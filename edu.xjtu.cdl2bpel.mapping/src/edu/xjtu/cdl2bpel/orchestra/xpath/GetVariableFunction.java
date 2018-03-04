package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.util.logging.Logger;

/**
 * This class provides the XPath function implementation for the
 * 'getVariable' function. This function retrieves a named
 * variable from the session.
 */
public class GetVariableFunction extends DefaultBehaviorXPathFunction 
					implements XPathFunction {

	/**
	 * This is the default constructor for the get variable function.
	 *
	 */
	public GetVariableFunction() {
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
//		Object ret=null;
//		InternalSession session=getInternalSession(context);
//		
//		if (session != null &&
//				validateParameters(parameters)) {
//			
//			try {
//				// Retrieve variable name from the session
//				Object value=session.getVariable((String)parameters[0]);
//				
//				if (value instanceof java.util.Map) {
//					java.util.Map mesg=(java.util.Map)value;
//					
//					if (NamesUtil.isSet((String)parameters[1])) {
//						
//						if (mesg.containsKey(parameters[1])) {
//							value = mesg.get(parameters[1]);
//						} else {
//							throw new UnresolvedConstraintException(
//									(String)parameters[0]+"["+
//									parameters[1]+"]");
//						}
//						
//					} else if (NamesUtil.isSet((String)parameters[2])) {
//						
//						// XPath expression provided, then must only
//						// have single part in multi-part message,
//						// as partname has not been explicitly
//						// named
//						
//						if (mesg.size() == 1) {
//							// Only single element, so extract
//							value = mesg.values().iterator().next();
//						} else {
//						
//							throw new XPathException("Attempt to " +
//									"perform 'getVariable' with " +
//									"XPath expression '"+parameters[2]+
//									"' on multipart variable '"+
//									parameters[0]+
//									"' without specifying the part name");
//						}
//					}
//				}
//				
//				// Is there an XPath expression to be applied
//				if (value != null &&
//						NamesUtil.isSet((String)parameters[2])) {
//					
//					//XPathEvaluator evaluator=
//						//XPathEvaluatorFactory.getXPathEvaluator();
//					
//					ret = evaluator.evaluate(value,
//							parameters[2].toString(), pres);
//				} else {
//					ret = value;
//				}
//			} catch(XPathException xpe) {
//				throw xpe;
//			} catch(Throwable t) {
//				throw new XPathException("Failed to invoke function '"+
//						getFunctionName()+"': "+t, t);
//			}
//			
//			if (logger.isLoggable(java.util.logging.Level.FINEST)) {
//				logger.finest("GetVariable '"+parameters[0]+"'="+ret);
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
		
		// If fourth parameter is provided, then just ignore it
		// The fourth parameter is the role name
		if (parameters != null && (parameters.length == 3 ||
				parameters.length == 4)) {
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
				
		if (logger.isLoggable(java.util.logging.Level.FINEST)) {
			logger.finest("Validate parameters = "+ret);
		}
		
		return(ret);
	}
	
	private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpe.orchestra.xpath");

	private static final String FUNCTION_NAME="getVariable";
}
