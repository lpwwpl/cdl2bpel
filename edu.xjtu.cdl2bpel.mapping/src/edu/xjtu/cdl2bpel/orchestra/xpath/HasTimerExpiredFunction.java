package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.util.logging.Logger;

/**
 * This class provides the XPath function implementation for the
 * 'hasDurationPassed' function.
 */
public class HasTimerExpiredFunction extends DefaultBehaviorXPathFunction
				implements XPathFunction {

	/**
	 * This is the default constructor for the hasDurationPassed
	 * function.
	 *
	 */
	public HasTimerExpiredFunction() {
		super(FUNCTION_NAME);
	}
	
	/**
	 * This method invokes the function, with the
	 * supplied parameters, using the supplied
	 * context information.
	 * 
	 * @param context The context
	 * @param parameters The parameters
	 * @param pres The XML prefix resolver
	 * @param evaluator The XPath evaluator
	 * @return The return value from the function
	 * @exception XPathException Failed to invoke function
	 */
//	public Object invoke(Object context, Object[] parameters,
//				XMLPrefixResolver pres, XPathEvaluator evaluator)
//					throws XPathException {
//		Object ret=Boolean.FALSE;
//		InternalSession session=getInternalSession(context);
//		
//		if (session != null &&
//				validateParameters(parameters)) {
//			long timeout=0;
//						
//			if (session.getConfiguration().getTimeoutManager() == null) {
//				throw new XPathException("Timeout manager is not available");
//			}
//			
//			// Parameter could be xsd:duration or xsd:dateTime
//			try {
//				timeout = TimeUtil.getDuration((String)parameters[0]);
//				
//			} catch(IllegalArgumentException iae) {
//				try {
//					timeout = TimeUtil.getDeadline((String)parameters[0]);
//
//					long current=session.getConfiguration().
//						getTimeoutManager().getCurrentDateTime().
//									getTime();
//					
//					if (current >= timeout) {
//						ret = Boolean.TRUE;
//					} else {
//						timeout = timeout-current;
//
//						if (logger.isLoggable(Level.INFO)) {
//							logger.info("Calculated timeout interval: "+timeout);
//						}
//					}
//			
//				} catch(IllegalArgumentException iae2) {
//					throw new XPathException("Invalid timer: "+
//								iae2.getMessage());
//				}
//			}
//			
//			if (ret != Boolean.TRUE && isBlockingActivity(context)) {
//				ActivityType activityType=getActivityType(context);
//
//				if (activityType == null ||
//						activityType.getEndpointDescriptionURI() == null) {
//					
//					throw new XPathException("Unable to identify activity type for timeout");
//
//				} else if (session.pendingTimeout(
//						activityType.getEndpointDescriptionURI(),
//								(String)parameters[0]) == false) {
//					try {
//						session.getConfiguration().getTimeoutManager().
//							register(session.getPrimaryIdentities(),
//								session.getId(),
//								activityType.getEndpointDescriptionURI(),
//								(String)parameters[0], timeout);
//					} catch(Exception e) {
//						throw new XPathException(
//								"Failed to register timeout: "+e, e);
//					}
//					
//				} else if (session.hasTimedOut(
//						activityType.getEndpointDescriptionURI(),
//								(String)parameters[0])) {
//					ret = Boolean.TRUE;
//				}
//			}
//		}
//		
//		return(ret);
//	}

	/**
	 * This method validates the parameters.
	 * 
	 * @param parameters The parameters
	 * @return Whether the parameters are valid
	 */
	protected boolean validateParameters(Object[] parameters) {
		boolean ret=false;
		
		if (parameters != null && (parameters.length == 1 ||
						parameters.length == 2)) {
			ret = true;
			
			for (int i=0; ret == true && i < parameters.length; i++) {
				if (parameters[i] == null) {
					if (i == 0) {
						ret = false;
					}
				} else if ((parameters[i] instanceof String) == false) {
					ret = false;
				}
			}
		}
		
		return(ret);
	}
	
    private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpe.orchestra.xpath");	

    private static final String FUNCTION_NAME="hasTimerExpired";
}
