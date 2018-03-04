package edu.xjtu.cdl2bpel.commons.util;

import java.util.EmptyStackException;

/**
 * @(#)Stack.java 
 * 
 * @author 
 */
public class Stack<E> {

	private Object[] stackArray;
	private int topIndex = -1;
	private int size = 0;

	public Stack() {
		stackArray = new Object[10];
	}

	public Stack(int size) {
		stackArray = new Object[size];
	}

	public void push(E value) {
		ensureCapacity();
		stackArray[++topIndex] = value;
		size++;
	}

	@SuppressWarnings("unchecked")
	public E peek() {
		if (topIndex == -1)
			throw new EmptyStackException();
		return (E) stackArray[topIndex];
	}

	public E pop() {
		E value = peek();
		topIndex--;
		size--;
		return value;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if (size == stackArray.length) {
			Object[] newArray = new Object[size * 3 / 2 + 1];
			System.arraycopy(stackArray, 0, newArray, 0, size);
			stackArray = newArray;
		}
	}
	
	public int size() {
		return size;
	}
}
