package edu.xjtu.cdl2bpel.cdl.xpathFunction;

public class HasDeadlinePassedFunction extends RoleOrParticipantNameFunction {

	/**
	 * This is the default constructor for the function.
	 *
	 */
	public HasDeadlinePassedFunction() {
		super(FUNCTION_NAME, NUM_OF_PARAMETERS,
				NUM_OF_MANDATORY_PARAMETERS,
				REPEATING_PARAMETERS,
				PARAMETER_TYPES,
				PARAMETER_NAMES,
				BOOLEAN_TYPE, ROLENAME_POSITION);
	}
	
	private static final String FUNCTION_NAME="hasDeadlinePassed";
	private static final int ROLENAME_POSITION=1;
	
	private static final int[] PARAMETER_TYPES={
							DATETIME_TYPE, QNAME_TYPE };
	
	private static final String[] PARAMETER_NAMES={
							"deadlineTime", "roleName" };
	
	private static final int NUM_OF_PARAMETERS=2;
	private static final int NUM_OF_MANDATORY_PARAMETERS=1;
	private static final boolean REPEATING_PARAMETERS=false;
}
