package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import org.apache.xpath.XPathContext;
import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.Choreography;

public class HasChoreographyCompletedFunction extends DefaultXPathFunction {

	public HasChoreographyCompletedFunction() {
		super(FUNCTION_NAME, NUM_OF_PARAMETERS,
				NUM_OF_MANDATORY_PARAMETERS,
				REPEATING_PARAMETERS,
				PARAMETER_TYPES,
				PARAMETER_NAMES,
				BOOLEAN_TYPE);
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
//			Choreography choreo=context.getSource().
//						getEnclosingChoreography();
//			Package cdlpack=context.getSource().getPackage();
//			
//			if (choreo != null &&
//				choreo.getEnclosedChoreography(choreoName) != null) {
//				
//			} else if (cdlpack != null &&
//				cdlpack.getChoreography(choreoName) != null) {
//				
//			} else {
//				context.reportError(
//					getMessage("_NOT_FOUND_CHOREOGRAPHY",
//								 new Object[]{choreoName}));
//			}
//		}
//		
//		return(ret);
//	}
	
	private static final String FUNCTION_NAME="hasChoreographyCompleted";
	
	private static final int[] PARAMETER_TYPES={
			STRING_TYPE, STRING_TYPE };
	
	private static final String[] PARAMETER_NAMES={
			"choreographyName", "choreographyInstanceId"
			};
	
	private static final int NUM_OF_PARAMETERS=2;
	private static final int NUM_OF_MANDATORY_PARAMETERS=1;
	private static final boolean REPEATING_PARAMETERS=false;
}
