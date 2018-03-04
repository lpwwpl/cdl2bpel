package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.util.logging.Logger;

import edu.xjtu.cdl2bpel.orchestra.BPActivity;

/**
 * This class is the base class for the behavioral description XPath functions.
 * 
 */
public class DefaultBehaviorXPathFunction extends DefaultXPathFunction {

	/**
	 * This constructor initializes the function name.
	 * 
	 * @param name
	 *            The function name
	 */
	public DefaultBehaviorXPathFunction(String name) {
		super(name);
	}

	/**
	 * This method returns the internal session associated with the supplied
	 * context.
	 * 
	 * @param context
	 *            The context
	 * @return The internal session
	 */
	// protected InternalSession getInternalSession(Object context) {
	// InternalSession ret=null;
	//		
	// if (context instanceof InternalSession) {
	// ret = (InternalSession)context;
	// } else if (context instanceof XPathFunctionContext &&
	// ((XPathFunctionContext)context).getSession()
	// instanceof InternalSession) {
	// ret = (InternalSession)((XPathFunctionContext)context).
	// getSession();
	// }
	//		
	// return(ret);
	// }

	/**
	 * This method returns the activity type associated with the supplied
	 * context (if available).
	 * 
	 * @param context
	 *            The context
	 * @return The activity type, or null if not found
	 */
	protected BPActivity getActivityType(Object context) {
		BPActivity ret = null;

		if (context instanceof XPathFunctionContext) {
			ret = ((XPathFunctionContext) context).getActivityType();
		}

		if (logger.isLoggable(java.util.logging.Level.FINEST)) {
			logger
					.finest("Activity type on context=" + context + " is: "
							+ ret);
		}

		return (ret);
	}

	/**
	 * This method returns whether the activity associated with the context is a
	 * blocking activity.
	 * 
	 * @param context
	 *            The context
	 * @return Whether the context is associated with a blocking activity
	 */
	protected boolean isBlockingActivity(Object context) {
		boolean ret = false;

		if (context instanceof XPathFunctionContext) {
			ret = ((XPathFunctionContext) context).getBlockingActivity();
		}

		if (logger.isLoggable(java.util.logging.Level.FINEST)) {
			logger.finest("isBlockingActivity on context=" + context + " is: "
					+ ret);
		}

		return (ret);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpe.orchestra.xpath");
}
