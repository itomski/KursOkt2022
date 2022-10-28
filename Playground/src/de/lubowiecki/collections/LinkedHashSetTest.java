package de.lubowiecki.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetTest {
	
	public static void main(String[] args) {
		
		Set<String> namen = new LinkedHashSet<>();
		namen.add("Peter");
		namen.add("Bruce");
		namen.add("bruce");
		namen.add("Carol");
		namen.add("Natasha");
		
		for (String n : namen) {
			System.out.println(n);
		}
		
		System.out.println();
		
		Set<String> sortNamen = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		//Set<String> sortNamen = new TreeSet<>();
		sortNamen.addAll(namen);
		
		for (String n : sortNamen) {
			System.out.println(n);
		}
		
	}
}
