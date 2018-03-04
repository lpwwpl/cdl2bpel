package edu.xjtu.cdl2bpel.commons.util;

import java.lang.reflect.Method;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckNOthersUtil {

	public static boolean isSet(String value) {
		return (value != null && value.trim().length() > 0);
	}

	public static String getJavaPackageFromNameSpace(String nsuri) {
		String ret = null;

		try {
			StringBuffer jpack = new StringBuffer();

			java.net.URL url = new java.net.URL(nsuri);

			String host = url.getHost();
			String path = url.getPath();

			java.util.StringTokenizer st = new StringTokenizer(host, ".");

			while (st.hasMoreTokens()) {
				String token = getJavaName(st.nextToken(), true);

				if (token.equals("www") == false && token.length() > 0) {

					if (jpack.length() > 0) {
						jpack.insert(0, token + ".");
					} else {
						jpack.append(token);
					}
				}
			}

			st = new StringTokenizer(path, "/");

			while (st.hasMoreTokens()) {
				String token = getJavaName(st.nextToken(), true);

				if (token.length() > 0) {
					if (jpack.length() > 0) {
						jpack.append("." + token);
					} else {
						jpack.append(token);
					}
				}
			}

			ret = jpack.toString();

			if (ret.length() == 0) {

				ret = DEFAULT_JAVA_PACKAGE;
			}

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Namespace '" + nsuri
					+ "' is not a valid format: " + e, e);
		}

		return (ret);
	}

	public static String getJavaName(String text, boolean toLower) {
		String ret = null;
		StringBuffer buf = new StringBuffer();

		byte[] b = text.getBytes();

		for (int i = 0; i < b.length; i++) {

			if ((i == 0 && Character.isJavaIdentifierStart((char) b[i]))
					|| (i != 0 && (Character.isJavaIdentifierPart((char) b[i]) || b[i] == '.'))) {
				buf.append((char) b[i]);
			} else if (i == 0) {
				buf.append('x');
				buf.append((char) b[i]);
			}
		}

		ret = buf.toString();

		if (toLower) {
			ret = ret.toLowerCase();
		}

		return (ret);
	}

	public static String getNameFromDescription(String description) {
		String ret = null;

		if (description != null) {
			StringBuffer buf = new StringBuffer();

			byte[] b = description.getBytes();
			boolean space = false;

			for (int i = 0; i < b.length; i++) {

				if (Character.isLetter((char) b[i])) {
					char ch = (char) b[i];

					if (space && Character.isLowerCase(ch)) {
						ch = Character.toUpperCase(ch);
					}
					space = false;

					buf.append(ch);
				} else if (Character.isDigit((char) b[i])) {
					if (buf.length() > 0) {
						buf.append((char) b[i]);
					}

				} else if (Character.isWhitespace((char) b[i])
						&& buf.length() > 0) {
					space = true;
				}
			}

			ret = buf.toString();
		}

		return (ret);
	}

	public static String getDisplayName(String propertyName) {
		String ret = null;
		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < propertyName.length(); i++) {
			char ch = propertyName.charAt(i);

			if (i == 0) {
				buf.append(Character.toUpperCase(ch));
			} else {
				if (Character.isUpperCase(ch)) {
					buf.append(' ');
				}
				buf.append(ch);
			}
		}

		ret = buf.toString();

		if (ret.indexOf("U R L") != -1) {
			ret = ret.replaceAll("U R L", "URL");
		}

		if (ret.indexOf("U R I") != -1) {
			ret = ret.replaceAll("U R I", "URI");
		}

		return (ret);
	}

	public static boolean compare(String s1, String s2) {
		boolean ret = false;

		if (s1 == null && s2 == null) {
			ret = true;
		} else if (s1 != null && s2 != null && s1.equals(s2)) {
			ret = true;
		}

		return (ret);
	}

	public static String findName(Object obj) {
		String ret = null;

		if (obj != null) {
			try {
				Class cls = obj.getClass();

				Method method = cls.getMethod("getName", new Class[0]);

				if (method == null) {
					logger.fine("Failed to find name attribute on object '"
							+ obj + "'");
				} else {
					ret = (String) method.invoke(obj, new Object[0]);

					if (ret != null && ret.trim().length() == 0) {
						ret = null;
					}
				}

			} catch (Exception e) {
				logger.fine("Failed to find name attribute on object '" + obj
						+ "': " + e);
			}
		}

		return (ret);
	}

	public static boolean isSet(Boolean value, boolean def) {
    	boolean ret=def;
    	
    	if (value != null) {
    		ret = value.booleanValue();
    	}
    	
    	return(ret);
    }
	
	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.common.util");

	public static final String DEFAULT_JAVA_PACKAGE = "edu.xjtu.cdl2bpel";
}
