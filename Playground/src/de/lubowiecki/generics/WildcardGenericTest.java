package de.lubowiecki.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardGenericTest {
	
	public static void main(String[] args) {
	
		//machWas(...);
		
		// super = Integer, Number, Object - Integer und seine Elternklassen
		List<? super Integer> zahlen1 = new ArrayList<Object>();
		
		// extends = Number, Integer - Number und seine Kindklassen
		List<? extends Number> zahlen2 = new ArrayList<Number>();
		
	}
	
	public static void machWas(List<? super Integer> zahlen) {
	}
	
	public static void machWasAnderes(List<? extends Number> zahlen) {
	}
}
