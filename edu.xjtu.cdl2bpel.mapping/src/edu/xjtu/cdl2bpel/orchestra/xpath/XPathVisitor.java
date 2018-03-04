package edu.xjtu.cdl2bpel.orchestra.xpath;

public interface XPathVisitor {

	public void function(String namespace, XPathFunction func,
			Object[] parameters);

}
