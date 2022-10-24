package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		List<Integer> zahlenListe1 = new ArrayList<>();
		zahlenListe1.add(2);
		zahlenListe1.add(5);
		zahlenListe1.add(7);
		
		System.out.println();
		
		List<Integer> zahlenListe2 = Arrays.asList(2,5,7);
		
		System.out.println(zahlenListe1);
		System.out.println(zahlenListe2);
		
		// equals ist so überschrieben, dass es den Inhalt der Listen vergleicht
		System.out.println(zahlenListe1.equals(zahlenListe2));
		System.out.println(zahlenListe1.hashCode());
		System.out.println(zahlenListe2.hashCode());
		
		System.out.println();
		
		// Vergleicht das 1. Element aus beiden Listen
		System.out.println(zahlenListe1.get(1).equals(zahlenListe2.get(1)));
		System.out.println(zahlenListe1.get(1).hashCode());
		System.out.println(zahlenListe2.get(1).hashCode());
		
		//zahlenListe1.set(1, zahlenListe2.get(1));

	}

}
