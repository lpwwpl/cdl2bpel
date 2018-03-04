package edu.xjtu.cdl2bpel.orchestra.xpath;


/**
 * This class provides the XPath function implementation for the
 * 'hasChoreographyCompleted' function. This function determines
 * whether the named variable has a valid value within the session.
 */
public class HasChoreographyCompletedFunction extends DefaultBehaviorXPathFunction
				implements XPathFunction {

	public HasChoreographyCompletedFunction() {
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
//			validateParameters(parameters)) {
//			
//			try {
//				// Get performed sessions associated with the
//				// supplied information
//				java.util.List<SessionStatus> statuses=null;
//				
//				if (parameters.length == 1) {
//					statuses = session.
//						getSessionStatuses((String)parameters[0]); 
//				} else {
//					statuses = new java.util.Vector<SessionStatus>();
//					
//					statuses.add(session.getSessionStatus((String)parameters[0],
//									(String)parameters[1]));
//				}
//
//				// Check if all of the retrieved sessions have
//				// completed
//				if (statuses != null && statuses.size() > 0) {
//					ret = Boolean.TRUE;
//					
//					for (int i=0; ret == Boolean.TRUE &&
//								i < statuses.size(); i++) {
//	
//						// If status is enabled, then it is not
//						// completed (successfully or unsuccessfully)
//						// or closed
//						if (statuses.get(i).getStatus() !=
//								InternalSession.STATUS_COMPLETED_SUCCESSFULLY &&
//								statuses.get(i).getStatus() !=
//								InternalSession.STATUS_COMPLETED_UNSUCCESSFULLY &&
//								statuses.get(i).getStatus() !=
//								InternalSession.STATUS_CLOSED) {
//							
//							ret = Boolean.FALSE;
//						}
//					}
//				}
//
//			} catch(XPathException xpe) {
//				throw xpe;
//			} catch(Throwable t) {
//				throw new XPathException("Failed to invoke function '"+
//						getFunctionName()+"': "+t, t);
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
	
	private static final String FUNCTION_NAME="hasChoreographyCompleted";
}
