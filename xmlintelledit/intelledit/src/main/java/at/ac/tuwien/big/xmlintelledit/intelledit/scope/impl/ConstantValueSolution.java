package at.ac.tuwien.big.xmlintelledit.intelledit.scope.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueSolution;

public class ConstantValueSolution<T> implements ValueSolution<T> {

	private T val;
	
	private ConstantValueSolution(T val) {
		this.val = val;
	}
	
	public static<T> ConstantValueSolution<T> getSolution(T val) {
		return new ConstantValueSolution<T>(val);
	}
	
	public T get() {
		return val;
	}
}
