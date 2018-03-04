/***********************************************************
 *                    SOA Framework                        *        
 *               Author : Dang Trung Anh                   *
 *             Email: dangtrunganh@gmail.com		       *
 *                Copyright (c) 2008-2009 			       *
 *          by Hanoi University of Technology              *
 *         Department of Software Engineering              *
 *           Faculty of Information Technology             *
 *                                                         *
 **********************************************************/
package edu.xjtu.cdl2bpel.utils;

import att.grappa.Grappa;

/**
 * <p>
 * Title: RuntimeUtils.java
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2008 - 2009
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Dang Trung Anh
 * @version 1.4
 */
public class RuntimeUtils {

	static {
		// smooth like that...
		Grappa.useAntiAliasing = true;
		Grappa.antiAliasText = true;
	}

	public static final String OS_WIN32 = "Windows";
	public static final String OS_MACOSX = "Mac OS X";
	public static final String OS_MACOSCLASSIC = "Mac OS 7-9";
	public static final String OS_LINUX = "Linux";
	public static final String OS_BSD = "BSD";
	public static final String OS_RISCOS = "RISC OS";
	public static final String OS_BEOS = "BeOS";
	public static final String OS_UNKNOWN = "unknown";

	public static String currentOs = null;

	public static String determineOS() {
		if (currentOs == null) {
			String osString = System.getProperty("os.name").trim()
					.toLowerCase();
			if (osString.startsWith("windows")) {
				currentOs = RuntimeUtils.OS_WIN32;
			} else if (osString.startsWith("mac os x")) {
				currentOs = RuntimeUtils.OS_MACOSX;
			} else if (osString.startsWith("mac os")) {
				currentOs = RuntimeUtils.OS_MACOSCLASSIC;
			} else if (osString.startsWith("risc os")) {
				currentOs = RuntimeUtils.OS_RISCOS;
			} else if ((osString.indexOf("linux") > -1)
					|| (osString.indexOf("debian") > -1)
					|| (osString.indexOf("redhat") > -1)
					|| (osString.indexOf("lindows") > -1)) {
				currentOs = RuntimeUtils.OS_LINUX;
			} else if ((osString.indexOf("freebsd") > -1)
					|| (osString.indexOf("openbsd") > -1)
					|| (osString.indexOf("netbsd") > -1)
					|| (osString.indexOf("irix") > -1)
					|| (osString.indexOf("solaris") > -1)
					|| (osString.indexOf("sunos") > -1)
					|| (osString.indexOf("hp/ux") > -1)
					|| (osString.indexOf("risc ix") > -1)
					|| (osString.indexOf("dg/ux") > -1)) {
				currentOs = RuntimeUtils.OS_BSD;
			} else if (osString.indexOf("beos") > -1) {
				currentOs = RuntimeUtils.OS_BEOS;
			} else {
				currentOs = RuntimeUtils.OS_UNKNOWN;
			}
		}
		return currentOs;
	}

	public static boolean isRunningWindows() {
		return (RuntimeUtils.determineOS() == RuntimeUtils.OS_WIN32);
	}

	public static boolean isRunningMacOsX() {
		return (RuntimeUtils.determineOS() == RuntimeUtils.OS_MACOSX);
	}

	public static boolean isRunningLinux() {
		return (RuntimeUtils.determineOS() == RuntimeUtils.OS_LINUX);
	}

	public static boolean isRunningUnix() {
		String os = RuntimeUtils.determineOS();
		if ((os == RuntimeUtils.OS_BSD) || (os == RuntimeUtils.OS_LINUX)
				|| (os == RuntimeUtils.OS_MACOSX)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * If the runtime environment is detected to be Mac OS X, this method will
	 * strip the parameter string of all HTML tags and return the result. On all
	 * other platforms, the parameter string is returned unchanged.
	 * 
	 * @param menuText
	 * @return
	 */
	public static String stripHtmlForOsx(String menuText) {
		if (isRunningMacOsX() == true) {
			menuText = stripHtml(menuText);
		}
		return menuText;
	}

	/**
	 * This method will strip the parameter string of all HTML tags and return
	 * the result.
	 * 
	 * @param text
	 * @return
	 */
	public static String stripHtml(String text) {
		return text.replaceAll("<[^<>]*>", "");
	}
}
