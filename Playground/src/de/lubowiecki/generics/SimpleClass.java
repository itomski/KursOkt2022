package de.lubowiecki.generics;

public class SimpleClass<T,S,R> {
	
	private T name;
	
	public T change() {
		return name;
	}
	
	public T change(S input) {
		return name;
	}
	
//	public R change(T in1, S in2) {
//		return in1 + in2;
//	}
	
	public String change(T in1, S in2) {
		return in1.toString() + in2.toString();
	}
}
