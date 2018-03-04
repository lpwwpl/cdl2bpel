package edu.xjtu.cdl2bpel.orchestra.xpath;

public class DefaultXPathFunctionResolver implements XPathFunctionResolver {

	public XPathFunction getFunction(String name) {
		return ((XPathFunction) m_functions.get(name));
	}

	public void registerFunction(XPathFunction func) {
		m_functions.put(func.getFunctionName(), func);
	}

	public void registerFunction(String name, XPathFunction func) {
		m_functions.put(name, func);
	}

	public void unregisterFunction(String name) {
		m_functions.remove(name);
	}

	private java.util.Hashtable m_functions = new java.util.Hashtable();
}
