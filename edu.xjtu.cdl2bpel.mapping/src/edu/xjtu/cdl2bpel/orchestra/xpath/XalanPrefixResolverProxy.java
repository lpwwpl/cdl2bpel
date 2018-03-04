package edu.xjtu.cdl2bpel.orchestra.xpath;

import org.apache.xml.utils.PrefixResolver;
import org.apache.xml.utils.PrefixResolverDefault;

public class XalanPrefixResolverProxy extends PrefixResolverDefault implements
		PrefixResolver {

	public XalanPrefixResolverProxy(XMLPrefixResolver res) {
		super(null);
		m_target = res;
	}

	public String getNamespaceForPrefix(String prefix) {
		String ret = null;

		if (m_target != null) {
			ret = m_target.getNamespace(prefix);
		}

		return (ret);
	}

	public String getNamespaceForPrefix(String prefix, org.w3c.dom.Node context) {
		return (getNamespaceForPrefix(prefix));
	}

	private XMLPrefixResolver m_target = null;
}
