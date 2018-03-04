package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.util.logging.Logger;

/**
 * This class provides the XPath function implementation for the
 * 'globalizedTrigger' function.
 */
public class GlobalizedTriggerFunction extends DefaultBehaviorXPathFunction
				implements XPathFunction {

	/**
	 * This is the default constructor for the globalizedTrigger
	 * function.
	 *
	 */
	public GlobalizedTriggerFunction() {
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
//		Boolean ret=null;
//		InternalSession session=getInternalSession(context);
//		
//		if (session != null &&
//				validateParameters(parameters)) {
//			//XPathEvaluator evaluator=
//			//	XPathEvaluatorFactory.getXPathEvaluator();
//			
//			ret = Boolean.TRUE;
//	
//			for (int i=0; ret.booleanValue() &&
//							i < parameters.length; i+=2) {
//				
//				Object value=evaluator.evaluate(context,
//						(String)parameters[i],
//						pres);
//				
//				if (value instanceof Boolean) {
//					
//					if (((Boolean)value).booleanValue() == false) {
//						ret = Boolean.FALSE;
//					}
//				} else {
//					logger.warning("Globalized Trigger expression '"+
//							parameters[i]+
//							"' has not returned a boolean value");
//					
//					ret = Boolean.FALSE;
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
		
		if (parameters != null && parameters.length > 1 &&
				(parameters.length % 2) == 0) {
			ret = true;
			
			for (int i=0; ret == true && i < parameters.length; i++) {
				if ((parameters[0] instanceof String) == false) {
					ret = false;
				}
			}
		}
		
		return(ret);
	}
	
    private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpe.orchestra.xpath");	
	
	private static final String FUNCTION_NAME="globalizedTrigger";
}
