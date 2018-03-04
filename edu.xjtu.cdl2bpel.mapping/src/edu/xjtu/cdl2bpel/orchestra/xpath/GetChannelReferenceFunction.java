package edu.xjtu.cdl2bpel.orchestra.xpath;


/**
 * This class provides the XPath function implementation for the
 * 'getChannelReference' function.
 */
public class GetChannelReferenceFunction extends DefaultBehaviorXPathFunction
				implements XPathFunction {

	public GetChannelReferenceFunction() {
		super(FUNCTION_NAME);
	}
		
//	public Object invoke(Object context, Object[] parameters,
//				XMLPrefixResolver pres, XPathEvaluator evaluator)
//					throws XPathException {
//		Object ret=null;
//		InternalSession session=getInternalSession(context);
//		
//		if (session != null &&
//				validateParameters(parameters)) {
//			
//			// Retrieve channel from the session
//			Channel chan=
//				session.getChannel((String)parameters[0], null, null, null);
//
//			// Check if it a channel
//			if (chan != null) {
//				ret = chan.getServiceReference();
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
		
		if (parameters != null && parameters.length == 1) {
			
			if (parameters[0] instanceof String) {
				ret = true;
			}
		}
		
		return(ret);
	}
	
	private static final String FUNCTION_NAME="getChannelReference";
}
