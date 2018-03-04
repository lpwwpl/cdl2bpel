package edu.xjtu.cdl2bpel.lpwcommon.util;

public class Pair<E, F> {

	private E e;
	private F f;

	public Pair(E theFirst, F theSecond) {
		this.e = theFirst;
		this.f = theSecond;

	}

	public Pair() {
		
	}
	
	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public F getF() {
		return f;
	}

	public void setF(F f) {
		this.f = f;
	}

	public E getFirst() {
		return e;
	}

	public F getSecond() {
		return f;
	}
	
	public String toString() {
		return "{" + getFirst().toString() + "\n" + getSecond().toString()
				+ "}\n";
	}
}
