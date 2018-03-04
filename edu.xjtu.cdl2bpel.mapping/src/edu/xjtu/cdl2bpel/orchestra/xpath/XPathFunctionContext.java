package edu.xjtu.cdl2bpel.orchestra.xpath;

import edu.xjtu.cdl2bpel.orchestra.BPActivity;



/**
 * This class can be used to provide additional context information,
 * over and above the session, to a function.
 *
 */
public class XPathFunctionContext {

	/**
	 * The default constructor for the XPath function context.
	 *
	 */
	public XPathFunctionContext() {
	}
	
	/**
	 * This method sets the session associated with the XPath
	 * function context.
	 * 
	 * @param session The session
	 */
//	public void setSession(Session session) {
//		m_session = session;
//	}
	
	/**
	 * This method returns the session associated with the
	 * XPath function context.
	 * 
	 * @return The session
	 */
//	public Session getSession() {
//		return(m_session);
//	}
	
	/**
	 * This method sets the activity type associated with the
	 * XPath function context.
	 * 
	 * @param activity The activity type
	 */
	public void setActivityType(BPActivity activity) {
		m_activityType = activity;
	}
	
	/**
	 * This method returns the activity type associated with the
	 * XPath function context.
	 * 
	 * @return The activity type
	 */
	public BPActivity getActivityType() {
		return(m_activityType);
	}
	
	/**
	 * This method identifies whether the context is associated
	 * with a blocking activity.
	 * 
	 * @param blocking Blocking activity
	 */
	public void setBlockingActivity(boolean blocking) {
		m_blockingActivity = blocking;
	}
	
	/**
	 * This method determines whether the context is associated
	 * with a blocking activity.
	 * 
	 * @return Associated with a blocking activity
	 */
	public boolean getBlockingActivity() {
		return(m_blockingActivity);
	}
	
//	private Session m_session=null;
	private BPActivity m_activityType=null;
	private boolean m_blockingActivity=false;
}
