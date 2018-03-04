package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.util.logging.Level;
import java.util.logging.Logger;

public class XPathEvaluatorFactory {

	public synchronized static XPathEvaluator getXPathEvaluator() {

		if (m_instance == null) {
			m_instance = createXPathEvaluator();
		}

		return (m_instance);
	}

	protected static XPathEvaluator createXPathEvaluator() {
		XPathEvaluator ret = null;
		String clsName = null;

		if (ret == null) {
			if (logger.isLoggable(Level.FINE)) {
				logger.fine("Using default XPath evaluator");
			}

			ret = new XalanXPathEvaluatorImpl();
		}

		return (ret);
	}

	private static XPathEvaluator m_instance = null;
	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.common.util");

	public static final String XPATH_EVALUATOR_PROPERTY = "xpath_evaluator";
}
