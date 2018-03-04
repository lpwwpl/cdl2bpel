package edu.xjtu.cdl2bpel.orchestra.xpath;

public interface XMLPrefixResolver {

	public String getNamespace(String prefix);

	public String getPrefix(String namespace);

}
