package edu.xjtu.cdl2bpel.cdl.xpathResolver;


import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.impl.ExceptionWorkUnitImpl;

/**
 * This class provides the default implementation for the validation context.
 */
public class DefaultXPathContext implements XPathContext {

	protected DefaultXPathContext(CDLElement src, Choreography choreo,
			boolean exception) {

		m_source = src;
		m_choreography = choreo;
		m_exception = exception;
	}

	public static XPathContext createContext(CDLElement src, Choreography choreo) {
		return (new DefaultXPathContext(src, choreo, false));
	}
	
	public static XPathContext createContext(CDLElement src, Choreography choreo, boolean exception) {
		return (new DefaultXPathContext(src, choreo, exception));
	}

	public CDLElement getSource() {
		return (m_source);
	}

	public void setSource(CDLElement src) {
		m_source = src;
	}

	public Choreography getChoreography() {
		return (m_choreography);
	}

	public boolean isException() {
		return (m_exception);
	}

	private CDLElement m_source = null;
	private Choreography m_choreography = null;
	private boolean m_exception = false;

	private static final String PREFIX_SEPARATOR = ": ";

	public static XPathContext createContext(ExceptionWorkUnitImpl src,
			Choreography enclosingChoreography, String str,boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
}
