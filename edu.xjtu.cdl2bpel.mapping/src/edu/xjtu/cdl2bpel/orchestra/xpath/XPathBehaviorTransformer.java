package edu.xjtu.cdl2bpel.orchestra.xpath;

import javax.xml.namespace.QName;

public class XPathBehaviorTransformer extends DefaultXPathFunctionResolver implements
		XPathFunctionResolver, XMLPrefixResolver {

	public XPathBehaviorTransformer() {
		registerFunction(new GetChannelReferenceFunction());
		registerFunction(new GetChoreographyStatusFunction());
		registerFunction(new GetCurrentDateFunction());
		registerFunction(new GetCurrentDateTimeFunction());
		registerFunction(new GetCurrentTimeFunction());
		registerFunction(new GetVariableFunction());
		registerFunction(new GlobalizedTriggerFunction());
		registerFunction(new HasChoreographyCompletedFunction());
		registerFunction(new HasDeadlinePassedFunction());
		registerFunction(new HasDurationPassedFunction());
		registerFunction(new HasTimerExpiredFunction());
		registerFunction(new IsVariableAvailableFunction());
		registerFunction(new VariablesAlignedFunction());
	}

	public static XPathBehaviorTransformer getInstance() {
		if (m_instance == null) {
			m_instance = new XPathBehaviorTransformer();
		}
		return (m_instance);
	}

	public String getNamespace(String prefix) {
		String ret = null;

		if (prefix != null) {
			if (prefix.equals(BEHAVIOR_PREFIX) || prefix.equals("be")) { // for
																			// backward
																			// compatibility
				ret = BEHAVIOR_NAMESPACE;
			}
		}

		return (ret);
	}

	public String getPrefix(String namespace) {
		return (null);
	}

	private static XPathBehaviorTransformer m_instance = null;

	public static final String BEHAVIOR_PREFIX = "sdl";
	public static final String BEHAVIOR_NAMESPACE = "http://www.cdl2bpel.xjtu.edu/behavior";

	static {
		XPathEvaluatorFactory.getXPathEvaluator().registerFunctionResolver(
				BEHAVIOR_NAMESPACE, getInstance());
	}
}
