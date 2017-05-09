package com.sda.api;

public interface Structure<T> {
	void push(T item);
	
	/**
	 * Pop should remove element from structure
	 * @return
	 */
	T pop();
	
	/**
	 * Peek should not remove element from structure
	 * @return Item
	 */
	T peek();
	
	void printStructure();
}
