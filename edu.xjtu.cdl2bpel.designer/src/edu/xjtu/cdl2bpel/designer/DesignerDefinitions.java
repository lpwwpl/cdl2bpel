
package edu.xjtu.cdl2bpel.designer;

import java.util.logging.Logger;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.QualifiedName;

import edu.xjtu.cdl2bpel.common.ResourceLocator;

public class DesignerDefinitions {


	public static String getMessage(String key, Object[] params) {
		return(ResourceLocator.getMessage(DesignerDefinitions.DESIGNER_RESOURCE,
				key, params));
	}
	

	public static String getProperty(IResource res, String prop) {
		String ret=null;
		
		try {
			ret = res.getPersistentProperty(
				new QualifiedName(DesignerDefinitions.DESIGNER_PLUGIN_ID,
						prop));
		} catch(Exception e) {
			logger.log(java.util.logging.Level.SEVERE,
					"Failed to get property '"+prop+"'", e);
		}
		
		return(ret);
	}
	

	public static String getPreference(String pref) {
		return(DesignerPlugin.getInstance().getPreferenceStore().
					getString(pref));
	}
	

	public static boolean isPreference(String pref) {
		return(DesignerPlugin.getInstance().getPreferenceStore().
					getBoolean(pref));
	}
    
    private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpel.designer");
    
    public static final String DESIGNER_PLUGIN_ID=
    			"edu.xjtu.cdl2bpel.designer";

    public static final String DESIGNER_RESOURCE="designer";
    

    public static final String NAMESPACE_PREFIX="namespacePrefix";
    public static final String INCLUDE_XMLSCHEMA="includeXMLSchema";
    public static final String INFERENCE_ENABLED="inference";
    
}

