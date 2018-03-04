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

/**
 * <p>
 * Title: ProvidedObject.java
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
public class ProvidedObject {

	private String name;
	private Object[] objects;

	public ProvidedObject(String name, Object[] objects) {
		this.name = name;
		this.objects = objects;
	}

	public ProvidedObject(String name, Object objects) {
		this.name = name;
		this.objects = new Object[] { objects };
	}

	protected ProvidedObject() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object[] getObjects() {
		return objects;
	}

	public String toString() {
		return name;
	}

	public boolean equals(Object o) {
		if (!(o instanceof ProvidedObject)) {
			return false;
		}
		if (o == this) {
			return true;
		}
		ProvidedObject p = (ProvidedObject) o;
		if (!name.equals(p.name) || (objects.length != p.objects.length)) {
			return false;
		}
		for (int i = 0; i < objects.length; i++) {
			try {
				if (!objects[i].equals(p.objects[i])) {
					return false;
				}
			} catch (NullPointerException ex) {
				if (!(objects[i] == null && p.objects[i] == null)) {
					// One of the objects was null.
					return false;
				}
			}
		}
		return true;
	}

	public int hashCode() {
		int h = name.hashCode();
		for (int i = 0; i < objects.length; i++) {
			h += (objects[i] != null ? objects[i].hashCode() : 0)
					^ (objects.length - i - 1);
		}
		return h;
	}
}
