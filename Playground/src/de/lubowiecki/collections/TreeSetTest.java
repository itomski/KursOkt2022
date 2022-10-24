package de.lubowiecki.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		Set<String> namen = new TreeSet<>();
		
		namen.add("Peter");
		namen.add("Bruce");
		namen.add("Carol");
		namen.add("Steve");
		
		System.out.println(namen);
		
		System.out.println();
		
		System.out.println("Hi".compareTo("Hi"));
		
		
		System.out.println();
		
		Set<Thing> sachen = new TreeSet<>();
		sachen.add(new Thing("Hammer", 10.0));
		sachen.add(new Thing("Tasse", 0.25));
		sachen.add(new Thing("Wecker", 1.0));
		
		System.out.println(sachen); // Exception: Thing ist aktuell nicht sortierbar
		
		Thing a = new Thing("Hammer", 0.25);
		Thing b = new Thing("Tasse", 1.25);
		
		System.out.println(a.compareTo(b));
		
		
	}
}
