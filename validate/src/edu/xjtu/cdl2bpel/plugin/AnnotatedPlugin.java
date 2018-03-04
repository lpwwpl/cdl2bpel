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

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import edu.xjtu.cdl2bpel.utils.PluginDocumentationLoader;

/**
 * <p>
 * Title: AnnotatedPlugin.java
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
public abstract class AnnotatedPlugin implements Plugin, DoNotCreateNewInstance {

	private Class<?> pluginClass;
	private Method pluginMethod;
	private String name;
	private String help;
	private String sortName;

	public AnnotatedPlugin(Class<?> pluginClass, Method pluginMethod,
			String name, String help, String sortName) {
		this.pluginClass = pluginClass;
		this.pluginMethod = pluginMethod;
		this.name = name;
		this.help = help;
		this.sortName = sortName;
	}

	public String getHtmlDescription() {
		if (help == null || help.length() == 0) {
			return PluginDocumentationLoader.load(pluginClass.getName());
		}
		return help;
	}

	public String getName() {
		return name;
	}

	public String getSortName() {
		return sortName;
	}

	protected Object getNewPluginInstance() throws InstantiationException,
			IllegalAccessException {
		if (Modifier.isStatic(pluginMethod.getModifiers())) {
			return null;
		} else {
			return pluginClass.newInstance();
		}
	}

	protected Method getPluginMethod() {
		return pluginMethod;
	}

	// should throw an exception if the plugin method does not satisfy the
	// interface (which interface this is depends on the plugin type)
	protected abstract void validate() throws Exception;

}
