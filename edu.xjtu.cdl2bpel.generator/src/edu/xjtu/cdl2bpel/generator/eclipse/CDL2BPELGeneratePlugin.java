package edu.xjtu.cdl2bpel.generator.eclipse;

import java.net.URL;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.xjtu.cdl2bpel.common.ResourceLocator;
import edu.xjtu.cdl2bpel.common.eclipse.BundleUtil;

public class CDL2BPELGeneratePlugin extends AbstractUIPlugin
			implements org.eclipse.ui.IStartup {

	private static CDL2BPELGeneratePlugin plugin;
	private ResourceBundle resourceBundle;
	
	public static final String CDL2BPELGENERATOR_PLUGIN_ID="edu.xjtu.cdl2bpel.generator";
	
	

	public CDL2BPELGeneratePlugin() {		
		super();
		plugin = this;
		
	}
	
	public void earlyStartup() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		try {
			if (formColors != null) {
				formColors.dispose();
				formColors = null;
			}
		} finally {
			super.stop(context);
		}
	}

	public static CDL2BPELGeneratePlugin getDefault() {
		return plugin;
	}

	public static String getResourceString(String key) {
		ResourceBundle bundle = CDL2BPELGeneratePlugin.getDefault().getResourceBundle();
		try {
			return (bundle != null) ? bundle.getString(key) : key;
		} catch (MissingResourceException e) {
			return key;
		}
	}

	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}
	
	static {
		BundleUtil.registerClasspathEntries(CDL2BPELGENERATOR_PLUGIN_ID, false);
		
		try {
			ResourceBundle res=ResourceBundle.getBundle(CDL2BPELGENERATOR_PLUGIN_ID);
			ResourceLocator.setResourceBundle(
					CDL2BPELGENERATOR_PLUGIN_ID, res);
		} catch(Exception e) {
		}
	}
	
	
	private FormColors formColors;
	public static final String IMG_FORM_BG = "formBg"; 
	public static final String IMG_LARGE = "large"; 
	public static final String IMG_HORIZONTAL = "horizontal"; 
	public static final String IMG_VERTICAL = "vertical"; 
	public static final String IMG_SAMPLE = "sample"; 
	public static final String IMG_WIZBAN = "wizban"; 
	public static final String IMG_LINKTO_HELP = "linkto_help"; 
	public static final String IMG_HELP_TOPIC = "help_topic"; 
	public static final String IMG_CLOSE = "close"; 
	
	protected void initializeImageRegistry(ImageRegistry registry) {
		registerImage(registry, IMG_FORM_BG, "form_banner.gif"); 
		registerImage(registry, IMG_LARGE, "large_image.jpg"); 
		registerImage(registry, IMG_HORIZONTAL, "th_horizontal.gif"); 
		registerImage(registry, IMG_VERTICAL, "th_vertical.gif"); 
		registerImage(registry, IMG_SAMPLE, "sample.gif"); 
		registerImage(registry, IMG_WIZBAN, "newprj_wiz.gif"); 
		registerImage(registry, IMG_LINKTO_HELP, "linkto_help.gif"); 
		registerImage(registry, IMG_HELP_TOPIC, "help_topic.gif"); 
		registerImage(registry, IMG_CLOSE, "close_view.gif"); 
	}
	
	private void registerImage(ImageRegistry registry, String key,
			String fileName) {
		try {
			IPath path = new Path("icons/" + fileName); 
			URL url = find(path);
			if (url!=null) {
				ImageDescriptor desc = ImageDescriptor.createFromURL(url);
				registry.put(key, desc);
			}
		} catch (Exception e) {
		}
	}
	
	public FormColors getFormColors(Display display) {
		if (formColors == null) {
			formColors = new FormColors(display);
			formColors.markShared();
		}
		return formColors;
	}
	
	public Image getImage(String key) {
		return getImageRegistry().get(key);
	}
	public ImageDescriptor getImageDescriptor(String key) {
		return getImageRegistry().getDescriptor(key);
	}
}


