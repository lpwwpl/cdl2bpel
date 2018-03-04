package edu.xjtu.cdl2bpel.orchestra.xpath;

/**
 * This class provides the XPath function implementation for the
 * 'getCurrentTime' function.
 */
public class GetCurrentTimeFunction extends DateTimeFunction {

	public GetCurrentTimeFunction() {
		super(FUNCTION_NAME);
	}
	
	/**
	 * This method returns the format pattern that should
	 * be used to process the current date time value.
	 * 
	 * @return The format pattern
	 */
	protected String getFormatPattern() {
		return(FORMAT_PATTERN);
	}
	
	private static final String FUNCTION_NAME="getCurrentTime";
	
	private static final String FORMAT_PATTERN="HH:mm:ssZ";
}
