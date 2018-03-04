package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.util.logging.Logger;

/**
 * This class provides the XPath function implementation for the
 * 'variablesAligned' function.
 */
public class VariablesAlignedFunction extends DefaultBehaviorXPathFunction
					implements XPathFunction {

	public VariablesAlignedFunction() {
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
//			ret = Boolean.TRUE;
//			
//			logger.warning("Behavioral XPath function '"+FUNCTION_NAME+
//					"' has been invoked - not current implemented");
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
		
		if (parameters != null && parameters.length == 3) {
			ret = true;
			
			for (int i=0; ret == true && i < parameters.length; i++) {
				if ((parameters[i] instanceof String) == false) {
					ret = false;
				}
			}
		}
		
		return(ret);
	}
	
    private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpe.orchestra.xpath");	
	
	private static final String FUNCTION_NAME="variablesAligned";
}
