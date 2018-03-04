package edu.xjtu.cdl2bpel.orchestra.xpath;


/**
 * This class provides the XPath function implementation for the
 * 'hasDeadlinePassed' function.
 */
public class HasDeadlinePassedFunction extends DefaultBehaviorXPathFunction
				implements XPathFunction {

	public HasDeadlinePassedFunction() {
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
//			
//			if (session.getConfiguration().getTimeoutManager() == null) {
//				throw new XPathException("Timeout manager is not available");
//			}
//			
//			// Check if deadline has already passed
//			long deadline=0;
//			
//			try {
//				deadline = TimeUtil.getDeadline((String)parameters[0]);
//			} catch(IllegalArgumentException iae) {
//				throw new XPathException("Invalid deadline: "+
//								iae.getMessage());
//			}
//						
//			long current=session.getConfiguration().
//					getTimeoutManager().getCurrentDateTime().getTime();
//			
//			if (current >= deadline) {
//				ret = Boolean.TRUE;
//				
//			} else if (isBlockingActivity(context)) {
//				ActivityType activityType=getActivityType(context);
//				long timeout=deadline-current;
//				
//				if (activityType == null ||
//						activityType.getEndpointDescriptionURI() == null) {
//					
//					throw new XPathException("Unable to identify activity type for timeout");
//
//				} else if (session.pendingTimeout(
//						activityType.getEndpointDescriptionURI(),
//								(String)parameters[0]) == false) {
//					
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
	
	private static final String FUNCTION_NAME="hasDeadlinePassed";
}
