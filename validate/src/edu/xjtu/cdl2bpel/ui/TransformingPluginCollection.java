/***********************************************************
 *      This software is part of the ProM package          *
 *             http://www.processmining.org/               *
 *                                                         *
 *            Copyright (c) 2003-2006 TU/e Eindhoven       *
 *                and is licensed under the                *
 *            Common Public License, Version 1.0           *
 *        by Eindhoven University of Technology            *
 *           Department of Information Systems             *
 *                 http://is.tm.tue.nl                     *
 *                                                         *
 **********************************************************/

package edu.xjtu.cdl2bpel.ui;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import javax.swing.JComponent;

import edu.xjtu.cdl2bpel.framework.CDL2BPELValidateFrameworkSplash;
import edu.xjtu.cdl2bpel.plugin.AnnotatedPlugin;
import edu.xjtu.cdl2bpel.plugin.AnnotatedPluginAcceptingObject;
import edu.xjtu.cdl2bpel.plugin.Plugin;
import edu.xjtu.cdl2bpel.plugin.PluginCollection;
import edu.xjtu.cdl2bpel.plugin.ProvidedObject;

/**
 * Collection of mining algorithms.
 * 
 * @see MiningPlugin
 * @author Peter van den Brand
 * @version 1.0
 */

public class TransformingPluginCollection extends PluginCollection {

	private static TransformingPluginCollection instance = null;

	protected TransformingPluginCollection() {
		super(Transformer.class);
	}

	/**
	 * Returns an instance of an <code>ConvertingPluginCollection</code>.
	 * 
	 * @return an instance of an <code>ConvertingPluginCollection</code>
	 */
	public static TransformingPluginCollection getInstance() {
		if (instance == null) {
			instance = new TransformingPluginCollection();
		}
		return instance;
	}

	/**
	 * Returns <code>true</code> if the given plugin is an
	 * <code>ConvertingPlugin</code>.
	 * 
	 * @param plugin
	 *            the plugin to check
	 * @return <code>true</code> if the given plugin is an
	 *         <code>ConvertingPlugin</code>, <code>false</code> otherwise.
	 */
	public boolean isValidPlugin(Plugin plugin) {
		return plugin instanceof TransformingPlugin;
	}

	@Override
	protected AnnotatedPlugin createFromAnnotation(Class<?> pluginClass,
			Method pluginMethod, Annotation annotation,
			CDL2BPELValidateFrameworkSplash splash) {
		return new AnnotatedConverterPlugin(pluginClass, pluginMethod,
				annotation);
	}
}

class AnnotatedConverterPlugin extends AnnotatedPluginAcceptingObject implements
		TransformingPlugin {

	public AnnotatedConverterPlugin(Class<?> pluginClass, Method pluginMethod,
			Annotation annotation) {
		super(pluginClass, pluginMethod, ((Transformer) annotation).name(),
				((Transformer) annotation).help(), ((Transformer) annotation)
						.sortName(), pluginMethod.getParameterTypes()[0]);
	}

	@Override
	protected void validate() throws Exception {
		if (getPluginMethod().getParameterTypes().length != 1) {
			throw new Exception(
					"Conversion plugin methods need to have exactly one parameter: the object to convert");
		}
		if (!JComponent.class.isAssignableFrom(getPluginMethod()
				.getReturnType())
				&& !MiningResult.class.isAssignableFrom(getPluginMethod()
						.getReturnType())) {
			throw new Exception(
					"Conversion plugin methods need to return an object which is derived from JComponent or MiningResult");
		}
	}

	public MiningResult convert(ProvidedObject object) {
		try {
			Object result = getPluginMethod().invoke(getNewPluginInstance(),
					findObject(object));

			if (result == null) {
				return null;
			} else if (MiningResult.class.isAssignableFrom(getPluginMethod()
					.getReturnType())) {
				return (MiningResult) result;
			} else
				return null;

		} catch (Throwable t) {
			t.printStackTrace();
			Message.add("Error executing conversion: " + t.getMessage());
			return null;
		}
	}
}
