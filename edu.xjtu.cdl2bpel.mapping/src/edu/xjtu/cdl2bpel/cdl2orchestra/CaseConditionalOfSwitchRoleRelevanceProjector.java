package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.CDLDefs;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.impl.CaseConditionalOfSwitchImpl;
import edu.xjtu.cdl2bpel.cdl.xpathFunction.GlobalizedTriggerFunction;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.DefaultXPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.ValidationResult;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathProjection;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathValidator;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class CaseConditionalOfSwitchRoleRelevanceProjector  extends OrderingStructuralActivityRoleRelevanceProjector{
	
	private static final boolean CONDITION_PROJECT_SINGLETON = true;
	
	public CaseConditionalOfSwitchRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == CaseConditionalOfSwitchImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		
		CaseConditionalOfSwitch caseConditionalOfSwitch = (CaseConditionalOfSwitch)cdlElement;
		
		edu.xjtu.cdl2bpel.orchestra.Conditional orcheConditional = null;

		orcheConditional = OrchestraFactory.eINSTANCE.createConditional();

		orcheConditional.setName(caseConditionalOfSwitch.getName());

		if (caseConditionalOfSwitch.getGuardExpression()!=null) {
			orcheConditional.setExpression(convertExpression(caseConditionalOfSwitch,
					caseConditionalOfSwitch.getGuardExpression(), CONDITION_PROJECT_SINGLETON));
		}
		
		
		String ret = "";
		XPathContext xpcontext=
			DefaultXPathContext.createContext(caseConditionalOfSwitch,
					caseConditionalOfSwitch.getBelongedChoreography());
		
		String conditionalExpression = caseConditionalOfSwitch.getGuardExpression();
		String realExpression = "";
		
		ValidationResult res = XPathValidator.validateExpression(
				xpcontext, conditionalExpression, context.getRoleTypes(),
				false);
		org.apache.xpath.XPath xpath = res.getXPathExpression();
		if (xpath != null && xpath.getExpression()
				instanceof FuncExtFunction &&
				((FuncExtFunction)xpath.getExpression()).
				getFunctionName().equals(
					GlobalizedTriggerFunction.FUNCTION_NAME)) {
				
				FuncExtFunction func=(FuncExtFunction)xpath.getExpression();
				
				for (int i=0; i < func.getArgCount(); i += 2) {
					realExpression=func.getArg(i).toString();
				}
		}
		
//		System.out.println(realExpression+"############");		
		ValidationResult realRes = XPathValidator.validateVariableForLpw(
				xpcontext, realExpression, context.getRoleTypes(),
				false);
		Variable variable = null;
		String part = "";
		if (realRes != null && realRes.getVariable() != null) {
			variable = (realRes.getVariable());
			if (realRes.getPartName() != null) {
				part =(realRes.getPartName());
			}
		}
		
		if(realExpression.lastIndexOf("!=")!=-1) {
			orcheConditional.setAddition(variable.getName()+"$"+part+" " +"not"+realExpression.substring(realExpression.lastIndexOf("=")+1));
		} else if(realExpression.lastIndexOf("=")!=-1) {
			orcheConditional.setAddition(variable.getName()+"$"+part+" " +realExpression.substring(realExpression.lastIndexOf("=")+1));
		} else{ 
			orcheConditional.setAddition(variable.getName()+"$"+part+" " +"needed2implement");
		}
//		System.out.println(variable.getName()+"$"+part+"$"+"!!!!!!!!!!!!!!!!!!!!");
//		System.out.println(orcheConditional.getAddition()+"*******");
				
				
		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheConditional);
		context.pushBPElementStack(orcheConditional);
		Iterator iter = retriveActivities(caseConditionalOfSwitch.getActivities()).iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
	}
	
	protected static boolean isRoleTypeIntersection(RoleType[] roles1,
			RoleType[] roles2) {
		boolean ret = false;

		for (int i = 0; ret == false && i < roles1.length; i++) {
			for (int j = 0; ret == false && j < roles2.length; j++) {

				if (roles2[j].getName().equals(roles1[i].getName())) {
					ret = true;
				}
			}
		}

		return (ret);
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
//				String role=func.getArg(i+1).toString();
				
				// Check whether role is appropriate
				boolean include=true;
				
//				for (int j=0; include == false &&
//								j < roleTypes.length; j++) {
//					if (roleTypes[j].getName().equals(role)) {
//						include = true;
//					}
//				}
				
				if (include) {
					includedExpr = expr;
//					includeCount++;
//					
//					if (i > 0) {
//						buf.append(COMMA);						
//					}
//					buf.append(DOUBLE_QUOTE_MARK);
					buf.append(expr);
//					buf.append(DOUBLE_QUOTE_MARK);
//					buf.append(COMMA);
//					buf.append(SINGLE_QUOTE_MARK);
//					buf.append(role);
//					buf.append(SINGLE_QUOTE_MARK);
				}
			}	
		}
		
		if (includeCount == 1) {
			ret = includedExpr;
		} else {
//			buf.insert(0, GLOBALIZED_TRIGGER_START);
//			buf.append(GLOBALIZED_TRIGGER_END);
			
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
