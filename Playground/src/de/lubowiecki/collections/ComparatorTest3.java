package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest3 {

	public static void main(String[] args) {
		
		List<String> namen = new ArrayList<>();
		namen.add("Carol");
		namen.add("Bruce");
		namen.add("Bob");
		namen.add("Steve");
		namen.add("Natasha");
		namen.add("carol");
		namen.add("Hans");
		
		System.out.println(namen);
		
		Collections.sort(namen); // sort verwendet compareTo von String
		System.out.println(namen);
		
		Comparator<String> nachLaenge = (strA, strB) -> strA.length() - strB.length();
		Comparator<String> nachBuchstabe = (strA, strB) -> strA.compareTo(strB);
		
		//Collections.sort(namen, nachLaenge); // für die Sortierung wird der Comparator und nicht compareTo von String verwendet
		//Collections.sort(namen, nachBuchstabe); // nach Buchstaben
		Collections.sort(namen, nachBuchstabe.reversed()); // umgekehrte Reihenfolge
		System.out.println(namen);
		

	}

}
