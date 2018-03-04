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

// TODO: Auto-generated Javadoc
/**
 * The Class Quintuple.
 */
/**
 * <p>
 * Title: Quintuple
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
public class Quintuple<A, B, C, D, E> {

	/**
	 * Creates the.
	 * 
	 * @param a
	 *            the a
	 * @param b
	 *            the b
	 * @param c
	 *            the c
	 * @param d
	 *            the d
	 * @param e
	 *            the e
	 * 
	 * @return the quintuple< a, b, c, d, e>
	 */
	public static <A, B, C, D, E> Quintuple<A, B, C, D, E> create(A a, B b,
			C c, D d, E e) {
		return new Quintuple<A, B, C, D, E>(a, b, c, d, e);
	}

	/** The first. */
	public final A first;

	/** The second. */
	public final B second;

	/** The third. */
	public final C third;

	/** The fourth. */
	public final D fourth;

	/** The fifth. */
	public final E fifth;

	/**
	 * Hash code.
	 * 
	 * @return the int
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((first == null) ? 0 : first.hashCode());
		result = PRIME * result + ((second == null) ? 0 : second.hashCode());
		result = PRIME * result + ((third == null) ? 0 : third.hashCode());
		result = PRIME * result + ((fourth == null) ? 0 : fourth.hashCode());
		result = PRIME * result + ((fifth == null) ? 0 : fifth.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		final Quintuple other = (Quintuple) obj;
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
		if (third == null) {
			if (other.third != null)
				return false;
		} else if (!third.equals(other.third))
			return false;
		if (fourth == null) {
			if (other.fourth != null)
				return false;
		} else if (!fourth.equals(other.fourth))
			return false;
		if (fifth == null) {
			if (other.fifth != null)
				return false;
		} else if (!fifth.equals(other.fifth))
			return false;
		return true;
	}

	/**
	 * Instantiates a new quintuple.
	 * 
	 * @param a
	 *            the a
	 * @param b
	 *            the b
	 * @param c
	 *            the c
	 * @param d
	 *            the d
	 * @param e
	 *            the e
	 */
	private Quintuple(final A a, final B b, final C c, final D d, final E e) {
		super();
		this.first = a;
		this.second = b;
		this.third = c;
		this.fourth = d;
		this.fifth = e;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + first.toString() + "," + second.toString() + ","
				+ third.toString() + "," + fourth.toString() + ","
				+ fifth.toString() + ")";
	}

}
