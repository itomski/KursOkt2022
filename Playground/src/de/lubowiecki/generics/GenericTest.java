package de.lubowiecki.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericTest {

	public static void main(String[] args) {
		
		List<Integer> zahlen = new ArrayList<>();
		zahlen.add(10); // Verlangt den generischen Typ
		Integer i = zahlen.get(0); // Liefert etwas vom generischen Typ zurück
		
		System.out.println();
		List<String> namen = new ArrayList<>();
		namen.add("ABC"); // Verlangt den generischen Typ
		String s = namen.get(0); // Liefert etwas vom generischen Typ zurück
		
		// Unsave
		System.out.println();
		Set menge = new HashSet(); // Wird kein generischer Typ vorgegeben ist der per default Object
		menge.add("ABC"); // Object, String IS-A Object
		menge.add(123); // Object, Integer IS-A Object
		//Object o = menge.stream().findFirst(); // findFirst liefert das erste Element, Steams ab Java 1.8

		for(Object o : menge) {
			System.out.println(((Integer) o).floatValue());
		}
		
		int zahl = 10;
		String str = zahl + "";
		// String str = 123; // passt nicht
		
	}

}
