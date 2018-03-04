package edu.xjtu.cdl2bpel.cdl.xpathResolver;

public interface XMLPrefixResolver {

	public String getNamespace(String prefix);

	public String getPrefix(String namespace);

}
