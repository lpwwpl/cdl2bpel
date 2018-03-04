package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.ValidationResult;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathValidator;

/**
 * This class represents the definition of the 'globalizedTrigger' CDL function.
 */
public class GlobalizedTriggerFunction extends DefaultXPathFunction {

	/**
	 * This is the default constructor for the function.
	 * 
	 */
	public GlobalizedTriggerFunction() {
		super(FUNCTION_NAME, NUM_OF_PARAMETERS, NUM_OF_MANDATORY_PARAMETERS,
				REPEATING_PARAMETERS, PARAMETER_TYPES, PARAMETER_NAMES,
				BOOLEAN_TYPE);
	}

	public java.util.Map validate(FuncExtFunction excfunc, XPathContext context) {
		java.util.Map ret = new java.util.Hashtable();

		// Validate the parameters
		boolean valid = validateParameters(excfunc, context);

		if (valid) {
			java.util.Vector roles = new java.util.Vector();

			// Iterate through the parameter pairs
			int count = excfunc.getArgCount();

			for (int i = 0; i < count; i += NUM_OF_PARAMETERS) {
				String expression = excfunc.getArg(i).toString();
				String roleOrParticipantName = excfunc.getArg(i + 1).toString();

				RoleType[] roleTypes = getRoleTypes(roleOrParticipantName,
						context);

				if (roleTypes != null) {

					for (int j = 0; j < roleTypes.length; j++) {

						if (context
								.getSource()
								.isInterrelatedWithRoleTypeMatrixFromTheContext(
										roleTypes[j].getName()) == false) {

						} else if (roles.contains(roleTypes[j]) == false) {
							roles.add(roleTypes[j]);
						}
					}

					ValidationResult result = XPathValidator
							.validateExpression(context, expression, roleTypes,
									false);

					// Check that the role type is included within
					// the validation results
					boolean f_roleFound = false;

					for (int j = 0; f_roleFound == false
							&& j < result.getRoleTypes().length; j++) {

						for (int k = 0; f_roleFound == false
								& k < roleTypes.length; k++) {
							if (result.getRoleTypes()[j] == roleTypes[k]) {
								f_roleFound = true;
							}
						}
					}

					if (f_roleFound == false) {
					}
				}
			}

			// Associate all of the relevant roles
			// for the variable with this function
			// return parameters
			RoleType[] roleTypes = new RoleType[roles.size()];
			roles.copyInto(roleTypes);

			ret.put(XPathFunction.PARAMETER_ROLES, roleTypes);
		}

		return (ret);
	}

	public static final String FUNCTION_NAME = "globalizedTrigger";

	public static final int[] PARAMETER_TYPES = { STRING_TYPE, STRING_TYPE };

	public static final String[] PARAMETER_NAMES = { "expression", "roleName" };

	public static final int NUM_OF_PARAMETERS = 2;
	public static final int NUM_OF_MANDATORY_PARAMETERS = 2;
	public static final boolean REPEATING_PARAMETERS = true;
}
