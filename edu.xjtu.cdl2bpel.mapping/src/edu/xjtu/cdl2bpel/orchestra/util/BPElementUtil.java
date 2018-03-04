package edu.xjtu.cdl2bpel.orchestra.util;

import edu.xjtu.cdl2bpel.cdl.xpathResolver.XMLPrefixResolver;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class BPElementUtil {
	public static String getNamespace(String qname, BPElement bpElement) {
		String ret = null;
		if (qname != null && bpElement != null
				&& bpElement.getGlobalArchitecture() != null) {
			
			ret = XMLUtils.getNamespace(qname, getPrefixResolver(bpElement
					.getGlobalArchitecture()), null);
		}

		return (ret);
	}

	public static XMLPrefixResolver getPrefixResolver(GlobalArchitecture sd) {
		return (new GlobalArchitecturePrefixResolver(sd));
	}

	static class GlobalArchitecturePrefixResolver implements XMLPrefixResolver {

		public GlobalArchitecturePrefixResolver(GlobalArchitecture sd) {
			m_globalArchitecture = sd;
		}

		public String getNamespace(String prefix) {
			return (m_globalArchitecture.getNameSpaceURIForPrefix(prefix));
		}

		public String getPrefix(String namespace) {
			return (m_globalArchitecture.getNameSpacePrefixForURI(namespace));
		}

		private GlobalArchitecture m_globalArchitecture = null;
	}
}
