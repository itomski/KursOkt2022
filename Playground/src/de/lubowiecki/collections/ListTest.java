package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		// Wrapper
		// byte > Byte
		// short > Short
		// char > Character
		// int > Integer
		// long > Long
		// float > Float
		// double > Double
		
		List<Integer> zahlen = new ArrayList<>();
		zahlen.add(10);
		zahlen.add(20);
		zahlen.add(5);
		
		zahlen = new LinkedList<>(zahlen);
		zahlen.add(1, 15);
		
		// Funktioniert für alle Collections
		// Übersichtlich. Erlaubt nicht, elemente zu löschen/ersetzen
		for(Integer zahl : zahlen) {
			System.out.println(zahl);
		}
		
		System.out.println();
		
		// Funktioniert für alle Collections
		// Unübersichtlich aber entält die Möglichkeit Elemente während der Iteration zu verändern/löschen
		Iterator<Integer> itr = zahlen.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		// Es erfolgen viele Methodenaufrufe. Get sucht nach dem Element hinter dem Index
		// Funktioniert nur für Collections, die einen Index anbieten
		for (int i = 0; i < zahlen.size(); i++) {
			System.out.println(zahlen.get(i));
		}
		
		System.out.println();
		
		// Seit Java 1.8 möglich. Verwendet Lambdas
		// löschen/ersetzen nicht möglich
		zahlen.forEach(e -> System.out.println(e));
		
		System.out.println();
		
		List<String> namen = new ArrayList<>();
		namen.add("Peter");
		namen.add("Natasha");
		
		// Übernimmt alle Elemente aus der namen-Liste
		//List<String> namen2 = new ArrayList<>(namen);
		List<String> namen2 = new ArrayList<>();
		namen2.addAll(namen); // Übernimmt die Elemente anderer Collections
		namen2.add("Carol");
		
		List<String> namen3 = new ArrayList<>();
		namen3.add("Bruce");
		namen3.add("Tony");
		namen3.add("Steve");
		namen3.add(1, "Hans"); // nur bei Listen
		namen3.addAll(2, namen); // nur bei Listen
		
		System.out.println(namen);
		System.out.println(namen2);
		System.out.println(namen3);
		
		System.out.println();
		
		List<Integer> zahlen2 = new ArrayList<>();
		zahlen2.add(1); // Autoboxing von int zu Integer
		// Index ist aber int
		zahlen2.add(2);
		// [1][2][][][][][][][][]
		zahlen2.add(1, 3);
		zahlen2.add(0, 4);
		// [4][1][3][2][][][][][][]
		zahlen2.remove(1); // Entfernt das Element an Position 1
		// [4][3][2][][][][][][][]
		// zahlen2.remove(new Integer(3)); // Entfernt das Element mit dem Wert 3
		
		
		zahlen2 = new LinkedList<>(zahlen2); // Wechsel von ArrayList zu LinkedList
		// () <-> () <-> () <-> ()
		
		zahlen2 = new ArrayList<>(zahlen2); // Wechsel von LinkedList zu ArrayList 

	}

}
