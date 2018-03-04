package edu.xjtu.cdl2bpel.commons.util;

public class CommonNamespaceUtil {

	public static boolean isFullyQualifiedName(String name) {
		boolean ret = false;
		int pos = 0;

		if (name != null && name.startsWith("{")
				&& (pos = name.indexOf('}')) != -1 && name.length() != pos + 1) {
			ret = true;
		}

		return (ret);
	}

	public static String getFullyQualifiedName(String namespace,
			String localpart) {
		String ret = null;

		if (namespace != null && namespace.trim().length() > 0) {
			ret = NAMESPACE_PREFIX + namespace + NAMESPACE_SUFFIX;
		}

		if (localpart != null) {
			if (ret == null) {
				ret = localpart;
			} else {
				ret += localpart;
			}
		}

		return (ret);
	}

	public static String getNamespace(String qname) {
		String ret = null;
		int index = 0;

		if (qname != null && (index = qname.indexOf(NAMESPACE_PREFIX)) != -1) {
			int endindex = qname.indexOf(NAMESPACE_SUFFIX);

			if (endindex == -1) {
				endindex = qname.length();
			}

			ret = qname.substring(index + 1, endindex);
		}

		return (ret);
	}

	public static String getLocalPart(String qname) {
		String ret = null;
		int index = 0;

		if (qname != null && (index = qname.indexOf(NAMESPACE_SUFFIX)) != -1) {
			ret = qname.substring(index + 1);
		} else {
			ret = qname;
		}

		return (ret);
	}

	public static final String NAMESPACE_PREFIX = "{";
	public static final String NAMESPACE_SUFFIX = "}";
}
