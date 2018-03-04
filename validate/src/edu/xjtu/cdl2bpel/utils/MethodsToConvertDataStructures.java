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

package edu.xjtu.cdl2bpel.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description: This class has various methods to convert between classes or
 * data types in Java.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2004
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author not attributable
 * @version 1.0
 */

public class MethodsToConvertDataStructures {
	public MethodsToConvertDataStructures() {
	}

	/**
	 * Converts an Iterator to a TreeSet.
	 * 
	 * @param iterator
	 *            to be converted
	 * @return TreeSet. If Iterator equals null, the returned TreeSet is also
	 *         null.
	 */
	public static TreeSet toTreeSet(Iterator iterator) {
		TreeSet ts = null;
		if (iterator != null) {
			ts = new TreeSet();
			while (iterator.hasNext()) {
				ts.add(iterator.next());
			}
		}
		return ts;
	}

	/**
	 * Converts an Iterator to a Hashtable.
	 * 
	 * @param i
	 *            iterator to convert.
	 * @return Hashtable where: <br/>
	 *         - Keys = elements in i <br/>
	 *         - Values = an Integer equals -1. <br/>
	 * @throws java.lang.NullPointerException
	 *             if i equals null.
	 */
	public static Hashtable toHashtable(Iterator i) throws NullPointerException {
		Hashtable h = new Hashtable();
		while (i.hasNext()) {
			h.put(i.next(), new Integer(-1));
		}
		return h;

	}

	/**
	 * Converts an Iterator to a HashMap.
	 * 
	 * @param i
	 *            iterator to convert.
	 * @return Hashtable where: <br/>
	 *         - Keys = elements in i <br/>
	 *         - Values = an Integer equals -1. <br/>
	 * @throws java.lang.NullPointerException
	 *             if i equals null.
	 */
	public static HashMap toHashMap(Iterator i) throws NullPointerException {
		HashMap h = new HashMap();
		while (i.hasNext()) {
			h.put(i.next(), new Integer(-1));
		}
		return h;

	}

	/**
	 * This method build the unions set of all TreeSets that are at a given
	 * HashSet.
	 * 
	 * @param hashSet
	 *            HashSet that contains TreeSets.
	 * @return the union set.
	 */
	public static TreeSet getSetUnion(HashSet hashSet) {

		TreeSet treeSet = new TreeSet();

		if (hashSet != null) {
			Iterator iterator = hashSet.iterator();
			while (iterator.hasNext()) {
				Iterator iteratorSubSets = ((TreeSet) iterator.next())
						.iterator();
				while (iteratorSubSets.hasNext()) {
					treeSet.add(iteratorSubSets.next());
				}
			}
		}

		return treeSet;
	}
}
