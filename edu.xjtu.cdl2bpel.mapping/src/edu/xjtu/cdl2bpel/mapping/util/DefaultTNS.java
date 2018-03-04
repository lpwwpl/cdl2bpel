package edu.xjtu.cdl2bpel.mapping.util;

/**
 * This class used to allocate Each RoleTypeMatrix Namespace
 * 
 * @author Administrator
 * 
 */
public class DefaultTNS {
	// Header of default namespace
	private static final String ns = "http://www.xjtu.edu.cn/";
	// suffix of default namespace
	private static final String roleMatrix = "roleMatrix";
	private static int num = 1;
	private static String tns = "";

	public static void reset() {
		num = 1;
	}

	public static String getTNS() {
		tns = ns + roleMatrix + num;
		num++;
		return tns;
	}

	/**
	 * Used to get the suffix of default namespace
	 *  
	 * @return tns get the suffix of default namespace
	 */
	public static String getSuffix(String tns) {
		String str = "";
		if (tns.startsWith(ns)) {
			str = tns.substring(ns.length());
		}
		return str;
	}
}
