

package edu.xjtu.cdl2bpel.common;

import java.util.Hashtable;
import java.util.ResourceBundle;



public class ResourceLocator {
	
	

	public static java.util.ResourceBundle getResourceBundle(String module)
							throws ResourceException {
		java.util.ResourceBundle ret=null;
		
		if (m_resourceBundles.containsKey(module)) {
			ret = (java.util.ResourceBundle)m_resourceBundles.get(module);
		} else {
			try {
				ret = ResourceBundle.getBundle(module);
				if (ret != null) {
					m_resourceBundles.put(module, ret);
				}
			} catch(Exception e) {
				throw new ResourceException("Failed to get " +
						"resource bundle for module '"+module+"'", e);
			}
		}
		
		return(ret);
	}
	
	public static String getMessage(String module, String key)
			throws ResourceException {
		return (getMessage(module, key, null));
	}

	public static String getMessage(String module, String key, Object[] params)
			throws ResourceException {
		String ret = null;
		java.util.ResourceBundle resources = getResourceBundle(module);

		if (resources != null) {
			ret = resources.getString(key);

			if (params != null && params.length > 0) {
				
				
				ret = processParameters(ret, params);
			}
		}

		return (ret);
	}

	protected static String processParameters(String mesg, Object[] params) {
		String ret = "";
		int pos = 0;
		int prev = 0;
		String nextToken = INDEX_START;

		while ((pos = mesg.indexOf(nextToken, pos)) != -1) {
			String token = mesg.substring(prev, pos);

			if (nextToken == INDEX_START) {
				ret += token;
				nextToken = INDEX_END;
			} else if (nextToken == INDEX_END) {
				int index = -1;

				try {
					index = Integer.valueOf(token).intValue();
				} catch (Exception e) {
					
				}

				if (params != null && index >= 0 && index < params.length) {
					ret += params[index];
				} else {
					ret += INDEX_START + index + INDEX_END;
				}

				nextToken = INDEX_START;
			}

			prev = pos + 1;
		}

		if (prev != -1) {
			ret += mesg.substring(prev);
		}

		return (ret);
	}
	
	

	public static void setResourceBundle(String module,
				java.util.ResourceBundle res) {
		if (module != null && res != null) {
			m_resourceBundles.put(module, res);
		}
	}
	
	public static final String INDEX_START="{";
	public static final String INDEX_END="}";
	
	public static final String DEFAULT_MODULE="common";
	
	private static Hashtable m_resourceBundles=
						new java.util.Hashtable();
}

