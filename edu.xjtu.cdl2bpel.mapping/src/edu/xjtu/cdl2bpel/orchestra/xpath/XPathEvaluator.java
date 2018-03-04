package edu.xjtu.cdl2bpel.orchestra.xpath;

public interface XPathEvaluator {

	public void registerFunctionResolver(String namespace,
			XPathFunctionResolver resolver);

	public void unregisterFunctionResolver(String namespace);

	public Object evaluate(Object context, String xpath, XMLPrefixResolver pres)
			throws XPathException;

	public Object selectNode(Object context, String xpath,
			XMLPrefixResolver pres) throws XPathException;

	public java.util.List<Object> selectNodes(Object context, String xpath,
			XMLPrefixResolver pres) throws XPathException;

	public void visit(String xpath, XPathVisitor visitor, XMLPrefixResolver pres)
			throws XPathException;

	public void validate(String xpath, XMLPrefixResolver pres)
			throws XPathException;

	public String asString(Object value);
}
