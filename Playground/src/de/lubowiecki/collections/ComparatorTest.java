package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		
		// Arrays.asList produziert eine fixed-size Liste
		List<Integer> zahlen = Arrays.asList(2,7,99,18,22,14,1,6,37,100);
		//zahlen.add(75); // Exception
		//zahlen.remove(0); // Exception
		
		// Eine flexible Liste
		zahlen = new ArrayList<>(Arrays.asList(2,7,99,18,22,14,1,6,37,100));
		System.out.println(zahlen);
		
		//zahlen.sort(null);
		Collections.sort(zahlen); // Sortierung nach natürlicher Ordnung d.h. compareTo von 
		System.out.println(zahlen);
		
		// int compare(Integer a, Integer b);
		Comparator<Integer> comp = (a, b) -> a - b;
		
		zahlen.sort(comp.reversed());
		//Collections.sort(zahlen, comp.reversed()); // Sortierung nach der compare-Methode des Comparators 
		System.out.println(zahlen);

		//Comparator<String> compB = (a, b) -> a.compareTo(b);
	}

}


class ZahlenComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		a = Math.abs(a);
		b = Math.abs(b);
		return a - b;
	}
}