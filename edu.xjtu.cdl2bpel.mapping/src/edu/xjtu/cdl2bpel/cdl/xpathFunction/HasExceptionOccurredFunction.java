package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;

public class HasExceptionOccurredFunction extends DefaultXPathFunction {

	public HasExceptionOccurredFunction() {
		super(FUNCTION_NAME, NUM_OF_PARAMETERS,
				NUM_OF_MANDATORY_PARAMETERS,
				REPEATING_PARAMETERS,
				PARAMETER_TYPES,
				PARAMETER_NAMES,
				BOOLEAN_TYPE);
	}
	
	public java.util.Map validate(FuncExtFunction excfunc,
					XPathContext context) {
		java.util.Map ret=new java.util.Hashtable();
		
		// Validate the parameters
		boolean valid=validateParameters(excfunc, context);
		
		if (valid) {
			String exceptionType=excfunc.getArg(0).toString();
			
			ret.put(EXCEPTION_TYPE_PARAMETER,
								exceptionType);
		}
		
		return(ret);
	}
	
	public static final String FUNCTION_NAME="hasExceptionOccurred";
	
	public static final String EXCEPTION_TYPE_PARAMETER="exceptionType";
	
	private static final int[] PARAMETER_TYPES={
						STRING_TYPE };
	
	private static final String[] PARAMETER_NAMES={
						EXCEPTION_TYPE_PARAMETER };
	
	private static final int NUM_OF_PARAMETERS=1;
	private static final int NUM_OF_MANDATORY_PARAMETERS=1;
	private static final boolean REPEATING_PARAMETERS=false;
}
