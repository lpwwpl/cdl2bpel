package edu.xjtu.cdl2bpel.cdl.xpathResolver;

import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.CDLDefs;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.xpathFunction.GlobalizedTriggerFunction;

public class XPathProjection {

	public static String projectExpression(CDLElement src,
			String expression, RoleType[] roles) {
		return(projectExpression(src, expression, roles, null, false));
	}
	
	public static String projectExpression(CDLElement src,
			String expression, RoleType[] roles,
			ParticipantType participant) {
		return(projectExpression(src, expression, roles, participant, true));
	}
	
	protected static String projectExpression(CDLElement src,
			String expression, RoleType[] roles,
			ParticipantType participant,
			boolean projectParticipant) {
		String ret=null;
		
		if (expression == null) {
			ret = EMPTY_EXPRESSION;
		} else {
			// Validate the expression
			XPathContext context=
				DefaultXPathContext.createContext(src,
						src.getBelongedChoreography());
			ValidationResult res=
				XPathValidator.validateExpression(context,
						expression, src.getRoleTypesMatrixFromTheContext(),
						false);
			if (res != null) {
				
				if (isRoleTypeIntersection(roles,
							res.getRoleTypes()) 
//							&&(projectParticipant == false ||
//						res.getParticipantDefined() == false)
				) {
					
					if (isGlobalizedTrigger(res)) {

						ret = extractGTSubExpressions(res, roles);
					} else {
//						ret = EMPTY_EXPRESSION;
						ret = expression;
					}
				} else {
					ret = EMPTY_EXPRESSION;
				}
			}
		}
		
		return(ret);
	}
	
	protected static boolean isRoleTypeIntersection(RoleType[] roles1,
							RoleType[] roles2) {
		boolean ret=false;
		
		for (int i=0; ret == false &&
				i < roles1.length; i++) {
			for (int j=0; ret == false &&
				j < roles2.length; j++) {
				
				if (roles2[j].getName().equals(
						roles1[i].getName())) {
					ret = true;
				}
			}
		}

		return(ret);
	}
	
	protected static boolean isGlobalizedTrigger(ValidationResult result) {
		boolean ret=false;
		org.apache.xpath.XPath xpath=
				result.getXPathExpression();
		
		if (xpath != null && xpath.getExpression()
				instanceof FuncExtFunction &&
				((FuncExtFunction)xpath.getExpression()).
				getFunctionName().equals(
					GlobalizedTriggerFunction.FUNCTION_NAME)) {
			ret = true;
		}
		
		return(ret);
	}
	
	protected static String extractGTSubExpressions(ValidationResult result,
					RoleType[] roleTypes) {
		String ret=null;
		StringBuffer buf=new StringBuffer();		
		org.apache.xpath.XPath xpath=
				result.getXPathExpression();
		String includedExpr=null;
		int includeCount=0;
	
		if (xpath != null && xpath.getExpression()
			instanceof FuncExtFunction &&
			((FuncExtFunction)xpath.getExpression()).
			getFunctionName().equals(
				GlobalizedTriggerFunction.FUNCTION_NAME)) {
			
			FuncExtFunction func=(FuncExtFunction)xpath.getExpression();
			
			for (int i=0; i < func.getArgCount(); i += 2) {
				String expr=func.getArg(i).toString();
				String role=func.getArg(i+1).toString();
				
				// Check whether role is appropriate
				boolean include=false;
				
				for (int j=0; include == false &&
								j < roleTypes.length; j++) {
					if (roleTypes[j].getName().equals(role)) {
						include = true;
					}
				}
				
				if (include) {
					includedExpr = expr;
					includeCount++;
					
					if (i > 0) {
						buf.append(COMMA);						
					}
					buf.append(DOUBLE_QUOTE_MARK);
					buf.append(expr);
					buf.append(DOUBLE_QUOTE_MARK);
					buf.append(COMMA);
					buf.append(SINGLE_QUOTE_MARK);
					buf.append(role);
					buf.append(SINGLE_QUOTE_MARK);
				}
			}	
		}
		
		if (includeCount == 1) {
			ret = includedExpr;
		} else {
			buf.insert(0, GLOBALIZED_TRIGGER_START);
			buf.append(GLOBALIZED_TRIGGER_END);
			
			ret = buf.toString();
		}
		
		return(ret);
	}
	
	public static final String EMPTY_EXPRESSION="";
	public static final String GLOBALIZED_TRIGGER_START=
				CDLDefs.CDL_PREFIX+":"+
				GlobalizedTriggerFunction.FUNCTION_NAME+"(";
	public static final String GLOBALIZED_TRIGGER_END=")";
	public static final String DOUBLE_QUOTE_MARK="\"";
	public static final String SINGLE_QUOTE_MARK="'";
	public static final String COMMA=",";
}
