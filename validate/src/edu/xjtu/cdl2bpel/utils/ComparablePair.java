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

/**
 * <p>
 * Title: ComparablePair.java
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
public class ComparablePair<F extends Comparable<F>, S extends Comparable<S>>
		extends Pair<F, S> implements Comparable<ComparablePair<F, S>> {

	public ComparablePair(F first, S second) {
		super(first, second);
	}

	public <T extends Comparable<T>> int compareTo(T x, T y) {
		if (x == null) {
			return y == null ? 0 : -1;
		} else {
			return x.compareTo(y);
		}
	}

	public int compareTo(ComparablePair<F, S> other) {
		if (other == null) {
			return 1;
		}
		int result = compareTo(first, other.first);
		return result == 0 ? compareTo(second, other.second) : result;
	}
}
