package edu.xjtu.cdl2bpel.cdl2wsdl;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.xml.util.XMLPrefixNamespaceWithDefaultTNSDeriver;

public final class CDLPrefixNamespaceWithDefaultTNSDeriver implements XMLPrefixNamespaceWithDefaultTNSDeriver{
	
	private Package m_package = null;
	private String defaultCDLTargetNamespace = null;
	
	public CDLPrefixNamespaceWithDefaultTNSDeriver(Package pack,String defaultCDLTargetNamespace) {
		this.m_package = pack;
		this.defaultCDLTargetNamespace = defaultCDLTargetNamespace;
	}
	
	public CDLPrefixNamespaceWithDefaultTNSDeriver(Package pack) {
		m_package = pack;
		this.defaultCDLTargetNamespace = pack.getTargetNamespace();
	}

	public String getNamespace(String prefix) {
		return (m_package.getURIFromPrefix(prefix));
	}

	public String getPrefix(String namespace) {
		return (m_package.getPrefixFromURI(namespace));
	}

	public String getDefaultCDLTargetNamespace() {
		return defaultCDLTargetNamespace;
	}

	public void setDefaultCDLTargetNamespace(String defaultCDLTargetNamespace) {
		this.defaultCDLTargetNamespace = defaultCDLTargetNamespace;
	}
}
