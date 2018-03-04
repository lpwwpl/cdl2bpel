package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class GetVariableFunction extends DefaultXPathFunction {

	public GetVariableFunction() {
		super(FUNCTION_NAME, NUM_OF_PARAMETERS,
				NUM_OF_MANDATORY_PARAMETERS,
				REPEATING_PARAMETERS,
				PARAMETER_TYPES,
				PARAMETER_NAMES,
				ANY_TYPE);
	}
	
	public java.util.Map validate(FuncExtFunction excfunc,
					XPathContext context) {
		java.util.Map ret=new java.util.Hashtable();
		
		// Validate the parameters
		boolean valid=validateParameters(excfunc, context);
		
		if (valid) {
			Variable var=null;
			
			// Retrieve the associated variable
			String varName=excfunc.getArg(0).toString();
			Choreography choreo=context.getChoreography();
			String roleOrParticipantName=null;
			
			if (XMLUtils.getPrefix(varName) != null) {				
			} else {
				if (choreo != null) {
					var = choreo.getVariable(varName);
				}
				
				if (excfunc.getArgCount() == 4) {
					roleOrParticipantName = excfunc.getArg(3).toString();
				}
	
				if (var == null) {
					if (choreo != null) {
						
					} else {
						
					}
					
				} else {
					
					// TODO: Need to validate that the variable
					// is available at a subset of the roles
					// currently relevant - but then need
					// to reduce the appropriate roles if not
					// at all roles
					
					if (roleOrParticipantName != null &&
							validateRoleOrParticipant(roleOrParticipantName, context)) {
	
//						validateVariableAtRoleOrParticipant(var, roleOrParticipantName,
//									context);
					}
					
					// Set the parameters to be returned
					ret = buildReturnParameters(excfunc, roleOrParticipantName,
										var, context);
	
					// Check if participant
//					ParticipantType part=
//						context.getSource().getBelongedPackage().
//								getParticipantType(roleOrParticipantName);
//	
//					if (part != null) {
//						ret.put(XPathFunction.PARAMETER_PARTICIPANT,
//								part);
//					}
				}
			}
		}
		
		return(ret);
	}
	
	protected java.util.Map buildReturnParameters(FuncExtFunction excfunc,
			String roleName, Variable var, XPathContext context) {
		java.util.Map ret=super.buildReturnParameters(roleName,
				var, context);
		
		if (ret != null) {
			ret.put(PARAMETER_VARIABLE_NAME,
					var.getName());
			ret.put(PARAMETER_PART,
					excfunc.getArg(1).toString());
//			ret.put(PARAMETER_DOCUMENT_PATH,
//					excfunc.getArg(2).toString());
		}
		
		return(ret);
	}
	
	public boolean isParticipantBased() {
		return(true);
	}
	
	public static final String FUNCTION_NAME="getVariable";
	
	private static final int[] PARAMETER_TYPES={
			STRING_TYPE, STRING_TYPE, STRING_TYPE,
			QNAME_TYPE };
	
	private static final String[] PARAMETER_NAMES={
			"variableName", "part", "documentPath",
			"roleName" };
	
	public static final String PARAMETER_VARIABLE_NAME="variableName";
	
	public static final String PARAMETER_PART="part";
	
	public static final String PARAMETER_DOCUMENT_PATH="documentPath";
	
	private static final int NUM_OF_PARAMETERS=4;
	private static final int NUM_OF_MANDATORY_PARAMETERS=3;
	private static final boolean REPEATING_PARAMETERS=false;
}
