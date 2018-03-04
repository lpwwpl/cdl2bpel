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

package edu.xjtu.cdl2bpel.models;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * <p>
 * Title: EnumToIterator
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
class EnumToIterator implements Iterator {
	private Enumeration e;

	public EnumToIterator(Enumeration e) {
		this.e = e;
	}

	public boolean hasNext() {
		return e.hasMoreElements();
	}

	public Object next() {
		return e.nextElement();
	}

	public void remove() {
		/** @todo Implement this java.util.Iterator method */
		throw new java.lang.UnsupportedOperationException(
				"Method remove() not yet implemented.");
	}
}
