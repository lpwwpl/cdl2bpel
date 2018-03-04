package edu.xjtu.cdl2bpel.designer;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.xjtu.cdl2bpel.common.ResourceLocator;

/**
 * The activator class controls the plug-in life cycle
 */
public class DesignerPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "edu.xjtu.cdl2bpel.designer";
	private FormColors formColors;
	public static final String IMG_FORM_BG = "formBg"; //$NON-NLS-1$
	public static final String IMG_LARGE = "large"; //$NON-NLS-1$
	public static final String IMG_HORIZONTAL = "horizontal"; //$NON-NLS-1$
	public static final String IMG_VERTICAL = "vertical"; //$NON-NLS-1$
	public static final String IMG_SAMPLE = "sample"; //$NON-NLS-1$
	public static final String IMG_WIZBAN = "wizban"; //$NON-NLS-1$
	public static final String IMG_LINKTO_HELP = "linkto_help"; //$NON-NLS-1$
	public static final String IMG_HELP_TOPIC = "help_topic"; //$NON-NLS-1$
	public static final String IMG_CLOSE = "close"; //$NON-NLS-1$
	public static final String IMG_CLASS = "class"; //$NON-NLS-1$
	public static final String IMG_OBJECTPROPERTY = "object-property"; //$NON-NLS-1$
	public static final String IMG_DATATYPEPROPERTY = "datatype-property"; //$NON-NLS-1$
	public static final String IMG_DATATYPE = "datatype"; //$NON-NLS-1$
	public static final String IMG_ONTOLOGY = "ontology"; //$NON-NLS-1$
	public static final String IMG_Onto ="onto";
	
	// The shared instance
	private static DesignerPlugin plugin;
	
	/**
	 * The constructor
	 */
	public DesignerPlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	protected void initializeImageRegistry(ImageRegistry registry) {
		// TODO Auto-generated method stub
		registerImage(registry, IMG_FORM_BG, "form_banner.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_LARGE, "large_image.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_HORIZONTAL, "th_horizontal.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_VERTICAL, "th_vertical.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_SAMPLE, "sample.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_WIZBAN, "newprj_wiz.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_LINKTO_HELP, "linkto_help.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_HELP_TOPIC, "help_topic.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_CLOSE, "close_view.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_CLASS, "class.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_OBJECTPROPERTY, "objectprop.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_DATATYPEPROPERTY, "datatypeproperty.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_DATATYPE, "datatype.gif"); //$NON-NLS-1$
		registerImage(registry, IMG_ONTOLOGY,"toc_closed.gif");
		registerImage(registry, IMG_Onto, "testhier.gif");
	}
	public Image getImage(String key) {
		return getImageRegistry().get(key);
	}
	public FormColors getFormColors(Display display) {
		if (formColors == null) {
			formColors = new FormColors(display);
			formColors.markShared();
		}
		return formColors;
	}
	private void registerImage(ImageRegistry registry, String key,
			String fileName) {
		try {
			IPath path = new Path("icons/" + fileName); //$NON-NLS-1$
			URL url = find(path);
			if (url!=null) {
				ImageDescriptor desc = ImageDescriptor.createFromURL(url);
				registry.put(key, desc);
			}
		} catch (Exception e) {
		}
	}	

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static DesignerPlugin getDefault() {
		return plugin;
	}

	public static DesignerPlugin getInstance() {
		return (plugin);
	}

	public static void logError(String mesg, Throwable t) {

		if (getInstance() != null) {
			Status status = new Status(IStatus.ERROR, PLUGIN_ID, 0,
					mesg, t);

			getInstance().getLog().log(status);
		}

		logger.severe("LOG ERROR: " + mesg + (t == null ? "" : ": " + t));
	}

	private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpel.designer.eclipse");

	static {

		try {
			ResourceBundle res=ResourceBundle.getBundle("designer");
			
			ResourceLocator.setResourceBundle(
					"designer", res);
		} catch(Exception e) {

		}
	}
}
