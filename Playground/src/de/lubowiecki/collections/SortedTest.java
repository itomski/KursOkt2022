package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedTest {
	
	public static void main(String[] args) {
		
		List<String> namen = new ArrayList<>();
		namen.add("Peter");
		namen.add("Bruce");
		namen.add("Bruce");
		namen.add("Carol");
		namen.add("Natasha");
		
		System.out.println(namen);
		
		// sort gibt es nur für Listen!
		Collections.sort(namen); // verwendet compareTo des Strings - natürliche Reihenfolge
		
		System.out.println(namen);
		
		System.out.println("--------------");
		
		List<Integer> zahlen = new ArrayList<>();
		zahlen.add(5);
		zahlen.add(7);
		zahlen.add(28);
		zahlen.add(11);
		zahlen.add(1);
		
		System.out.println(zahlen);
		
		Collections.sort(zahlen); // verwendet compareTo des Integer
		
		System.out.println(zahlen);
		
		System.out.println("--------------");
		
		List<Thing> sachen = new ArrayList<>();
		sachen.add(new Thing("Hammer", 10));
		sachen.add(new Thing("Wecker", .5));
		sachen.add(new Thing("Zange", 1.5));
		sachen.add(new Thing("Tasse", .25));
		sachen.add(new Thing("Wecker", .5));
		
		System.out.println(sachen);
		
		// Wir kopieren die Liste, damit die Original-Liste unsortiert bleibt
		List<Thing> sortSachen = new ArrayList<>(sachen); 
		//Collections.sort(sortSachen); // Sortierung nach compareTo von Thing
		
		// Comperator ist ein externes Objekt mit flexiblen Sortier-Möglichkeiten
		Collections.sort(sortSachen, new ThingNamenComparator()); // Sortierung nach compare von ThingNamenComparator 
		//Collections.sort(sortSachen, new ThingWeightComparator().reversed()); // Sortierung nach compare von ThingNamenComparator 
		// .reversed() dreht die Reihenfolge um
		
		System.out.println(sachen);
		System.out.println(sortSachen);
		
		// Zwei Objekte sind für Java gleich, wenn sie den gleichen HashCode haben und equals true ergibt
		// Für ein TreeSet sind auch zwei Objekte die beim Vergleich mit compareTo 0 liefern gleich
		
		// seit Java 1.8, Lambdas
		// int compare(T o1, T o2);
		Collections.sort(sortSachen, (a, b) -> a.getName().compareTo(b.getName())); 
	}
}

class ThingNamenComparator implements Comparator<Thing> {

	@Override
	public int compare(Thing t1, Thing t2) {
		return t1.getName().compareTo(t2.getName());
	}
}

class ThingWeightComparator implements Comparator<Thing> {

	@Override
	public int compare(Thing t1, Thing t2) {
		return Double.compare(t1.getWeight(), t2.getWeight());
	}
}
