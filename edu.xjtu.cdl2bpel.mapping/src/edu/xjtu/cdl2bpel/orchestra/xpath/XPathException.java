package edu.xjtu.cdl2bpel.orchestra.xpath;

public class XPathException extends RuntimeException {

	private static final long serialVersionUID = 8912427774069642865L;

	public XPathException(String mesg, Throwable cause) {
		super(mesg, cause);

		m_cause = cause;
	}

	public XPathException(String mesg) {
		super(mesg, null);
	}

	public Throwable getCause() {
		return (m_cause);
	}

	private Throwable m_cause = null;
}
