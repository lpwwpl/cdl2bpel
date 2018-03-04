package edu.xjtu.cdl2bpel.cdl.xpathFunction;

public class GetChannelReferenceFunction extends ChannelBasedFunction {

	public GetChannelReferenceFunction() {
		super(FUNCTION_NAME, NUM_OF_PARAMETERS,
				NUM_OF_MANDATORY_PARAMETERS,
				REPEATING_PARAMETERS,
				PARAMETER_TYPES,
				PARAMETER_NAMES,
				ANY_TYPE);
	}
	
	private static final String FUNCTION_NAME="getChannelReference";
	
	private static final int[] PARAMETER_TYPES={
			STRING_TYPE };
	
	private static final String[] PARAMETER_NAMES={
			"variableName" };
	
	private static final int NUM_OF_PARAMETERS=1;
	private static final int NUM_OF_MANDATORY_PARAMETERS=1;
	private static final boolean REPEATING_PARAMETERS=false;
}
