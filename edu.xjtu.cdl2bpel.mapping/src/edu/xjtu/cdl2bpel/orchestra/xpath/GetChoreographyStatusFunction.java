package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.util.logging.Logger;

public class GetChoreographyStatusFunction extends DefaultBehaviorXPathFunction
				implements XPathFunction {

	public GetChoreographyStatusFunction() {
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
//			try {
//				// Get performed sessions associated with the
//				// supplied information
//				java.util.List<SessionStatus> statuses=null;
//				int status=InternalSession.STATUS_INSTANCE_UNKNOWN;
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
//				if (statuses != null) {
//					if (statuses.size() == 1) {
//						status = statuses.get(0).getStatus();
//						
//					} else if (statuses.size() > 1) {
//						status = InternalSession.STATUS_AMBIGUOUS;
//					}
//				}
//				
//				switch(status) {
//				case InternalSession.STATUS_INSTANCE_UNKNOWN:
//					ret = InternalSession.STATUS_INSTANCE_UNKNOWN_TEXT;
//					break;
//				case InternalSession.STATUS_ENABLED:
//					ret = InternalSession.STATUS_ENABLED_TEXT;
//					break;
//				case InternalSession.STATUS_COMPLETED_SUCCESSFULLY:
//					ret = InternalSession.STATUS_COMPLETED_SUCCESSFULLY_TEXT;
//					break;
//				case InternalSession.STATUS_COMPLETED_UNSUCCESSFULLY:
//					ret = InternalSession.STATUS_COMPLETED_UNSUCCESSFULLY_TEXT;
//					break;
//				case InternalSession.STATUS_CLOSED:
//					ret = InternalSession.STATUS_CLOSED_TEXT;
//					break;
//				case InternalSession.STATUS_AMBIGUOUS:
//					ret = InternalSession.STATUS_AMBIGUOUS_TEXT;
//					break;
//				default:
//					logger.severe("Unknown session status '"+
//							status+"'");
//				}
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
	
	private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpe.orchestra.xpath");

	private static final String FUNCTION_NAME="getChoreographyStatus";
}
