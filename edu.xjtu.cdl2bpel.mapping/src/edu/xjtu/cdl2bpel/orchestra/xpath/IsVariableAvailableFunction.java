package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.util.logging.Logger;

/**
 * This class provides the XPath function implementation for the
 * 'isVariableAvailable' function. This function determines
 * whether the named variable has a valid value within the session.
 */
public class IsVariableAvailableFunction extends DefaultBehaviorXPathFunction
				implements XPathFunction {

	public IsVariableAvailableFunction() {
		super(FUNCTION_NAME);
	}
	
//	public Object invoke(Object context, Object[] parameters,
//				XMLPrefixResolver pres, XPathEvaluator evaluator)
//					throws XPathException {
//		Object ret=Boolean.FALSE;
//		InternalSession session=getInternalSession(context);
//		
//		if (session != null &&
//				validateParameters(parameters)) {
//			
//			try {
//				// Retrieve variable name from the session
//				session.getVariable((String)parameters[0]);
//				
//				ret = Boolean.TRUE;
//
//			} catch(LockedInformationException lie) {
//				// Return true, as means variable is available
//				ret = Boolean.TRUE;
//				
//			} catch(UnresolvedConstraintException uce) {
//				
//				// Means that variable does not exist
//				ret = Boolean.FALSE;
//				
//			} catch(XPathException xpe) {
//				throw xpe;
//				
//			} catch(Throwable t) {
//				throw new XPathException("Failed to invoke function '"+
//						getFunctionName()+"': "+t, t);
//			}
//			
//			if (logger.isLoggable(java.util.logging.Level.FINEST)) {
//				logger.finest("IsVariableAvailable '"+parameters[0]+"'="+ret);
//			}
//		}
//		
//		return(ret);
//	}

	protected boolean validateParameters(Object[] parameters) {
		boolean ret=false;
		
		if (parameters != null && parameters.length >= 1 &&
							parameters.length <= 2) {
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

	private static final String FUNCTION_NAME="isVariableAvailable";
}
