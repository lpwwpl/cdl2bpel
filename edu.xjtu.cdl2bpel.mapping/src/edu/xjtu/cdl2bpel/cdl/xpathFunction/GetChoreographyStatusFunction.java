package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.Choreography;

/**
 * This class represents the definition of the 'getChoreographyStatus'
 * CDL function.
 */
public class GetChoreographyStatusFunction extends DefaultXPathFunction {

	/**
	 * This is the default constructor for the function.
	 *
	 */
	public GetChoreographyStatusFunction() {
		super(FUNCTION_NAME, NUM_OF_PARAMETERS,
				NUM_OF_MANDATORY_PARAMETERS,
				REPEATING_PARAMETERS,
				PARAMETER_TYPES,
				PARAMETER_NAMES,
				STRING_TYPE);
	}
	
//	public java.util.Map validate(FuncExtFunction excfunc,
//					XPathContext context) {
//		java.util.Map ret=new java.util.Hashtable();
//		
//		// Validate the parameters
//		boolean valid=validateParameters(excfunc, context);
//		
//		if (valid) {
//			
//			// Retrieve the associated variables
//			String choreoName=excfunc.getArg(0).toString();
//			
//			Choreography choreo=context.getSource().getBelongedChoreography();
//			edu.xjtu.cdl2bpel.cdl.Package cdlpack=context.getSource().getBelongedPackage();
//			
//			if (choreo != null &&
//				choreo.getEnclosedChoreography(choreoName) != null) {
//				
//			} else if (cdlpack != null &&
//				cdlpack.getChoreography(choreoName) != null) {
//				
//			} else {
//				
//			}
//		}
//		
//		return(ret);
//	}
	
	private static final String FUNCTION_NAME="getChoreographyStatus";
	
	private static final int[] PARAMETER_TYPES={
			STRING_TYPE, STRING_TYPE };
	
	private static final String[] PARAMETER_NAMES={
			"choreographyName", "choreographyInstanceId"
			};
	
	private static final int NUM_OF_PARAMETERS=2;
	private static final int NUM_OF_MANDATORY_PARAMETERS=1;
	private static final boolean REPEATING_PARAMETERS=false;
}
