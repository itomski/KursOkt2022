package de.lubowiecki.generics;

public class GenerischeVererbung {
	
	public static void main(String[] args) {
		
		NextMyClass<Integer, String> nmc1 = new NextMyClass<>();
		nmc1.machWas(123);
		
		NextMyClass<String, Integer> nmc2 = new NextMyClass<>();
		nmc2.machWas("Moin");
		
	}
}

class MyClass<T> {
	
	public T machWas(T t) {
		return t;
	}
}

class NextMyClass<A, B> extends MyClass<A> {
	
}