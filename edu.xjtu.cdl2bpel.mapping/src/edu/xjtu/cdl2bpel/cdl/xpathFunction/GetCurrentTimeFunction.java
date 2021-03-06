package edu.xjtu.cdl2bpel.cdl.xpathFunction;

/**
 * This class represents the definition of the 'getCurrentTime'
 * CDL function.
 */
public class GetCurrentTimeFunction extends RoleOrParticipantNameFunction {

	/**
	 * This is the default constructor for the function.
	 *
	 */
	public GetCurrentTimeFunction() {
		super(FUNCTION_NAME, NUM_OF_PARAMETERS,
				NUM_OF_MANDATORY_PARAMETERS,
				REPEATING_PARAMETERS,
				PARAMETER_TYPES,
				PARAMETER_NAMES,
				TIME_TYPE, ROLENAME_POSITION);
	}
	
	private static final String FUNCTION_NAME="getCurrentTime";
	private static final int ROLENAME_POSITION=0;
	
	private static final int[] PARAMETER_TYPES={
							QNAME_TYPE };
	
	private static final String[] PARAMETER_NAMES={
							"roleName" };
	
	private static final int NUM_OF_PARAMETERS=1;
	private static final int NUM_OF_MANDATORY_PARAMETERS=0;
	private static final boolean REPEATING_PARAMETERS=false;
}
