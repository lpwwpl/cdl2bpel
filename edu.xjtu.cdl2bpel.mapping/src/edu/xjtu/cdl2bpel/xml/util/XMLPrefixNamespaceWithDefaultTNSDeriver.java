package edu.xjtu.cdl2bpel.xml.util;

public interface XMLPrefixNamespaceWithDefaultTNSDeriver {
	
	public String getNamespace(String prefix);

	public String getPrefix(String namespace);
	
	public String getDefaultCDLTargetNamespace();
}
