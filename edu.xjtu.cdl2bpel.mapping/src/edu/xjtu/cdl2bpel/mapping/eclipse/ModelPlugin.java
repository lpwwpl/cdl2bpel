package edu.xjtu.cdl2bpel.mapping.eclipse;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import edu.xjtu.cdl2bpel.common.eclipse.BundleUtil;

public class ModelPlugin extends Plugin{
	// The plug-in ID
	public static final String CDL2BPELModel_PLUGIN_ID = "edu.xjtu.cdl2bpel.mapping";

	private static ModelPlugin plugin;	
	private ResourceBundle resourceBundle;
	
	/**
	 * The constructor
	 */
	public ModelPlugin() {
		plugin = this;
		initialize();
	}

	public static String getResourceString(String key) {
		ResourceBundle bundle = ModelPlugin.getDefault().getResourceBundle();
		try {
			return (bundle != null) ? bundle.getString(key) : key;
		} catch (MissingResourceException e) {
			return key;
		}
	}
	
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}
	
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static ModelPlugin getDefault() {
		return plugin;
	}

	public void initialize() {
		
		// Initialize the resource change listener
		IResourceChangeListener rcl = new IResourceChangeListener() {

			public void resourceChanged(IResourceChangeEvent evt) {

				try {
					evt.getDelta().accept(new IResourceDeltaVisitor() {

						public boolean visit(IResourceDelta delta) {
							boolean ret = true;
							IResource res = delta.getResource();
							return (ret);
						}
					});
				} catch (Exception e) {

				}
			}
		};

		// Register the resource change listener
		ResourcesPlugin.getWorkspace().addResourceChangeListener(rcl,
				IResourceChangeEvent.POST_CHANGE);
	}

	static {
		BundleUtil.registerClasspathEntries(CDL2BPELModel_PLUGIN_ID, false);
	}
}
