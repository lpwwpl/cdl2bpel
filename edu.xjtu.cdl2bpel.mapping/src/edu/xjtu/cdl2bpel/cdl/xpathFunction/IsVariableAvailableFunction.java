package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import org.apache.xpath.XPathContext;
import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.Variable;

public class IsVariableAvailableFunction extends RoleOrParticipantNameFunction {

	public IsVariableAvailableFunction() {
		super(FUNCTION_NAME, NUM_OF_PARAMETERS,
				NUM_OF_MANDATORY_PARAMETERS,
				REPEATING_PARAMETERS,
				PARAMETER_TYPES,
				PARAMETER_NAMES,
				BOOLEAN_TYPE, ROLENAME_POSITION);
	}
	
//	public java.util.Map validate(FuncExtFunction excfunc,
//					XPathContext context) {
//		java.util.Map ret=super.validate(excfunc, context);
//		
//		if (excfunc.getArgCount() == 2) {
//			Variable var=null;
//			
//			// Retrieve the associated variable
//			String varName=excfunc.getArg(0).toString();
//			String roleName=excfunc.getArg(1).toString();
//			
//			Choreography choreo=context.getSource().
//						getEnclosingChoreography();
//			
//			if (choreo != null) {
//				var = choreo.getVariable(varName);
//			}
//			
//			if (var != null) {
//				
//				validateVariableAtRoleOrParticipant(var, roleName,
//						context);
//				
//				// Set the parameters to be returned
//				ret = buildReturnParameters(roleName,
//								var, context);
//				
//			} else {
//				
//				context.reportError(
//						getMessage("_NOT_FOUND_VARIABLE",
//								new Object[]{varName}));
//			}
//		}
//		
//		return(ret);
//	}
	
	public static final String FUNCTION_NAME="isVariableAvailable";
	
	private static final int[] PARAMETER_TYPES={
			STRING_TYPE, QNAME_TYPE };
	
	private static final String[] PARAMETER_NAMES={
			"variableName", "roleName" };
		
	/**
	 * This parameter represents the variable name.
	 */
	public static final String PARAMETER_VARIABLE_NAME="variableName";
	
	private static final int NUM_OF_PARAMETERS=2;
	private static final int NUM_OF_MANDATORY_PARAMETERS=1;
	private static final boolean REPEATING_PARAMETERS=false;
	private static final int ROLENAME_POSITION=1;
}
