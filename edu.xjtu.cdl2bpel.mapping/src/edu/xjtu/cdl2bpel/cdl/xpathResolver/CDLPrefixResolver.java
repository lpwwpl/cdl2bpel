package edu.xjtu.cdl2bpel.cdl.xpathResolver;

import org.apache.xml.utils.PrefixResolver;

/**
 * This class provides the prefix resolution for CDL.
 *
 */
public class CDLPrefixResolver implements PrefixResolver,
				XMLPrefixResolver {
	
	/**
	 * The default constructor for the prefix resolver.
	 *
	 */
	public CDLPrefixResolver() {
	}

	/**
	 * The constructor for the prefix resolver, with the
	 * choreography package.
	 *
	 * @param pack The choreography package
	 */
	public CDLPrefixResolver(edu.xjtu.cdl2bpel.cdl.Package pack) {
		m_package = pack;
	}

	public String getNamespace(String prefix) {
		return(getNamespaceForPrefix(prefix));
	}
	
	public String getNamespaceForPrefix(String prefix) {
		String ret=null;
		
		if (prefix != null) {
			
			if (m_package != null) {
				ret = m_package.getURIFromPrefix(prefix);
			}
		}
		
		return(ret);
	}

	public String getNamespaceForPrefix(String prefix,
            org.w3c.dom.Node context) {
		return(getNamespaceForPrefix(prefix));
	}
	
	public String getPrefix(String namespace) {
		return(null);
	}
	
	public String getBaseIdentifier() {
		return(null);
	}
	
	public boolean handlesNullPrefixes() {
		return(false);
	}
	
	private edu.xjtu.cdl2bpel.cdl.Package m_package=null;
}