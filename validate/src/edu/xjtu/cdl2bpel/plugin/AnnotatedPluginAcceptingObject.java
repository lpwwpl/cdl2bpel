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

/**
 * <p>
 * Title: AnnotatedPluginAcceptingObject.java
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
public abstract class AnnotatedPluginAcceptingObject extends AnnotatedPlugin {

	private Class<? extends Object> type;

	public AnnotatedPluginAcceptingObject(Class<?> pluginClass,
			Method pluginMethod, String name, String help, String sortName,
			Class<? extends Object> type) {
		super(pluginClass, pluginMethod, name, help, sortName);
		this.type = type;
	}

	public boolean accepts(ProvidedObject object) {
		return findObject(object) != null;
	}

	protected Object findObject(ProvidedObject object) {
		Object[] o = object.getObjects();

		for (int i = 0; i < o.length; i++) {
			if (o[i] != null && type.isAssignableFrom(o[i].getClass())) {
				return o[i];
			}
		}
		return null;
	}
}
