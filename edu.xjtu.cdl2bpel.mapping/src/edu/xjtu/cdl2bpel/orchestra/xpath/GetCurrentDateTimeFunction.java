package edu.xjtu.cdl2bpel.orchestra.xpath;

/**
 * This class provides the XPath function implementation for the
 * 'getCurrentDateTime' function.
 */
public class GetCurrentDateTimeFunction extends DateTimeFunction {

	public GetCurrentDateTimeFunction() {
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
	
	private static final String FUNCTION_NAME="getCurrentDateTime";
	
	private static final String FORMAT_PATTERN="yyyy-MM-dd'T'HH:mm:ssZ";
}
