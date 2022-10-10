package de.lubowiecki.playground;

import java.util.*;

public class VarArgTest {
	
	public static void main(String[] args) {
		
		doSomething("Peter", "Carol", "Natasha", "Bruce");
		
		System.out.println();
		
		String[] namen = {"Peter", "Carol", "Natasha", "Bruce"};
		doSomething(namen);
		
		System.out.println();
		
		doSomething("Peter");
		
		doSomething(1,2,3);
	}
	
	private static void doSomething(String... str) {
		
		for(String s : str) {
			System.out.println(s);
		}
		
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}

// Seit Java 1.8		
//		List<String> list = Arrays.asList("Peter", "Carol", "Natasha", "Bruce");
//		list.forEach(System.out::println);
		
	}
	
	private static void doSomething(int... i) {
		
		for(int s : i) {
			System.out.println(s);
		}
	}
}
