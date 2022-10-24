package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
//		Set<String> namen = new HashSet<>();
//		namen.add("Peter");
//		namen.add("Bruce");
//		
//		String s1 = "Steve";
//		namen.add(s1);
//		String s2 = new String("Steve");
//		namen.add(s2);
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		
//		// HashSet: Elemente sind weder geordnet, noch sortiert
//		System.out.println(namen);
//		
//		// 
//		System.out.println(namen.contains("Natasha"));
		
		System.out.println();
		
		// HashCode und Equals müssen richtig implementiert/überschrieben sein
		Set<Thing> things = new HashSet<>();
		Thing a = new Thing("Tasse", 0.25);
		things.add(a);
		System.out.println();
		
		Thing b = new Thing("Tasse", 0.25);
		things.add(b);
		System.out.println();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(things);
		
		// Nur eine Eigenschaft aus dem Thing
		// Inhalt der Strings wird verglichen
		//System.out.println(a.getName().equals(b.getName()));
		
		System.out.println();
		
		Thing a2 = new Thing("Hammer", 10.0);
		Thing b2 = new Thing("Zange", 1.5);
		
		Set<Thing> menge = new HashSet<>();
		menge.add(a2);
		menge.add(b2);
		
		for(Thing t : menge) {
			t.setWeight(5);
		}
		
		System.out.println(a2);
		
		List<Thing> liste = new ArrayList<>(menge);
		System.out.println(liste);
		
		liste.get(1).setWeight(20);
		
		System.out.println(menge);

	}

}
