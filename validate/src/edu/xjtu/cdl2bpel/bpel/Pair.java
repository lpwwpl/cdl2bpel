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
package edu.xjtu.cdl2bpel.bpel;

/**
 * <p>
 * Title:
 * </p>
 * 
 * <p>
 * Description:
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2009
 * </p>
 * 
 * <p>
 * Company: HUT
 * </p>
 * 
 * @author Dang Trung Anh
 * @version 1.6
 * @since 1.0
 */
public class Pair<First, Second> {
	/***/
	public final First first;

	/***/
	public final Second second;

	private int hashCode;

	/**
	 * @param first
	 * @param second
	 */
	protected Pair(First first, Second second) {
		this.first = first;
		this.second = second;
		final int PRIME = 31;
		hashCode = 1;
		hashCode = PRIME * hashCode + ((first == null) ? 0 : first.hashCode());
		hashCode = PRIME * hashCode
				+ ((second == null) ? 0 : second.hashCode());
	}

	public static <S, T> Pair<S, T> create(S first, T second) {
		return new Pair<S, T>(first, second);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "(" + first + "," + second + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return hashCode;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Pair other = (Pair) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}

}
