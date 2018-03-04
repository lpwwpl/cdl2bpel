package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.text.SimpleDateFormat;

/**
 * This class provides the XPath function implementation for the
 * 'getCurrentTime' function.
 */
public class DateTimeFunction extends DefaultBehaviorXPathFunction
				implements XPathFunction {

	/**
	 * The constructor for the date time function.
	 * 
	 * @param name The name of the function
	 */
	public DateTimeFunction(String name) {
		super(name);
	}

	protected boolean validateParameters(Object[] parameters) {
		boolean ret=false;

		// The parameter is the rolename, which is actually
		// ignored
		if (parameters != null && parameters.length == 1) {
			ret = true;
		}
		
		return(ret);
	}
	
	protected String getFormatPattern() {
		return(null);
	}
	
    private java.text.SimpleDateFormat dateFormatter=
					new SimpleDateFormat(getFormatPattern());
}
