package edu.xjtu.cdl2bpel.orchestra.xpath;

public class DefaultXPathFunction implements XPathFunction {

	public DefaultXPathFunction(String name) {
		m_functionName = name;
	}

	public DefaultXPathFunction(String name, int params, String[] paramNames,
			int mandatoryParams, int[] paramTypes, int retType) {
		m_functionName = name;
		m_numberOfParameters = params;
		m_parameterNames = paramNames;
		m_numberOfMandatoryParameters = mandatoryParams;
		m_parameterTypes = paramTypes;
		m_returnType = retType;
	}

	public DefaultXPathFunction(String name, int params, String[] paramNames,
			int[] paramTypes, int retType, boolean repeatingParams) {
		m_functionName = name;
		m_numberOfParameters = params;
		m_parameterNames = paramNames;
		m_numberOfMandatoryParameters = params;
		m_parameterTypes = paramTypes;
		m_returnType = retType;
		m_repeatingParams = repeatingParams;
	}

	public String getFunctionName() {
		return (m_functionName);
	}

	public int getNumberOfParameters() {
		return (m_numberOfParameters);
	}

	public String[] getParameterNames() {
		return (m_parameterNames);
	}

	public int getNumberOfMandatoryParameters() {
		return (m_numberOfMandatoryParameters);
	}

	public int[] getParameterTypes() {
		return (m_parameterTypes);
	}

	public int getReturnType() {
		return (m_returnType);
	}

	public boolean isRepeatingParameters() {
		return (m_repeatingParams);
	}

	public Object invoke(Object context, Object[] parameters,
			XMLPrefixResolver pres, XPathEvaluator evaluator)
			throws XPathException {
		return (null);
	}

	private String m_functionName = null;
	private int m_numberOfParameters = 0;
	private String[] m_parameterNames = new String[0];
	private int m_numberOfMandatoryParameters = 0;
	private int[] m_parameterTypes = new int[0];
	private int m_returnType = XPathTypes.VOID_TYPE;
	private boolean m_repeatingParams = false;
}
