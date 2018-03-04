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

package edu.xjtu.cdl2bpel.plugin;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import javax.swing.filechooser.FileFilter;

import edu.xjtu.cdl2bpel.framework.CDL2BPELValidateFrameworkSplash;
import edu.xjtu.cdl2bpel.ui.GenericFileFilter;
import edu.xjtu.cdl2bpel.ui.MiningResult;

/**
 * Collection of import plugins.
 * 
 * @see ImportPlugin
 * @author Dang Trung Anh
 * @version 1.0
 */

public class ImportPluginCollection extends PluginCollection {

	private static ImportPluginCollection instance = null;

	protected ImportPluginCollection() {
		super(Importer.class);
	}

	/**
	 * Returns an instance of an <code>ImportPluginCollection</code>.
	 * 
	 * @return an instance of an <code>ImportPluginCollection</code>
	 */
	public static ImportPluginCollection getInstance() {
		if (instance == null) {
			instance = new ImportPluginCollection();
		}
		return instance;
	}

	/**
	 * Returns <code>true</code> if the given plugin is an
	 * <code>ImportPlugin</code>.
	 * 
	 * @param plugin
	 *            the plugin to check
	 * @return <code>true</code> if the given plugin is an
	 *         <code>ImportPlugin</code>, <code>false</code> otherwise.
	 */
	public boolean isValidPlugin(Plugin plugin) {
		return plugin instanceof ImportPlugin;
	}

	@Override
	protected AnnotatedPlugin createFromAnnotation(Class<?> pluginClass,
			Method pluginMethod, Annotation annotation,
			CDL2BPELValidateFrameworkSplash splash) {

		return new AnnotatedImportPlugin(pluginClass, pluginMethod, annotation);

	}
}

class AnnotatedImportPlugin extends AnnotatedPlugin implements ImportPlugin {

	private String extension;

	public AnnotatedImportPlugin(Class<?> pluginClass, Method pluginMethod,
			Annotation annotation) {
		super(pluginClass, pluginMethod, ((Importer) annotation).name(),
				((Importer) annotation).help(), ((Importer) annotation)
						.sortName());
		this.extension = ((Importer) annotation).extension();
	}

	@Override
	protected void validate() throws Exception {
		if (getPluginMethod().getParameterTypes().length != 1
				|| !getPluginMethod().getParameterTypes()[0]
						.equals(InputStream.class)) {
			throw new Exception(
					"Import plugin methods need to have exactly one parameter: the InputStream to import from");
		}
//		if (!JComponent.class.isAssignableFrom(getPluginMethod()
//				.getReturnType())
//				&& !MiningResult.class.isAssignableFrom(getPluginMethod()
//						.getReturnType())) {
//			throw new Exception(
//					"Import plugin methods need to return an object which is derived from JComponent or MiningResult");
//		}
	}

	public FileFilter getFileFilter() {
		return new GenericFileFilter(extension);
	}

	public MiningResult importFile(InputStream input) throws IOException {
		try {
			Object result = getPluginMethod().invoke(getNewPluginInstance(),
					input);

			if (result == null) {
				return null;
			} else if (MiningResult.class.isAssignableFrom(result.getClass())) {
				return (MiningResult) result;
			} else
				return null;

		} catch (Throwable t) {
			t.printStackTrace();
			throw new IOException(t.getMessage());
		}
	}
}
