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

package edu.xjtu.cdl2bpel.ui;

import edu.xjtu.cdl2bpel.plugin.ProvidedObject;

/**
 * <p>
 * Title: ProvidedObjectComboItem
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
class ProvidedObjectComboItem {

	private ProvidedObject object;
	private String caption;

	public ProvidedObjectComboItem(String caption, ProvidedObject object) {
		this.object = object;
		this.caption = caption;
	}

	public String toString() {
		return caption + " (" + object.getName() + ")";
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o instanceof ProvidedObjectComboItem) {
			// CHeck if the provided objects are the same, as well as the label.
			return o.toString().equals(toString())
					&& ((ProvidedObjectComboItem) o).object.equals(object);
		} else {
			return false;
		}
		// return o != null && o.toString().equals(toString());
	}

	public ProvidedObject getObject() {
		return object;
	}
}
