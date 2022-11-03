package de.lubowiecki.collections;

import java.util.HashSet;
import java.util.Set;

import de.lubowiecki.playground.Person;

public class HashTest {
	
	public static void main(String[] args) {
		
		// Hashbar = equals und hashCode müssen richtig eingebaut sein
		
		Todo t1 = new Todo("Wäsche waschen");
		System.out.println(t1.hashCode()); // Nummer, die aus dem Inhalt errechnet wird
		
		Todo t2 = new Todo("Wäsche waschen");
		System.out.println(t2.hashCode()); 
		
		// Jedes Objekt auf dem Heap bekommt per default einen eigenen HashCode
		
		System.out.println(t1 == t2); // Sind t1 und t2 das gleiche Objekt auf dem Heap?
		System.out.println(t1.equals(t2)); // Ist der Inhalt von t1 und t2 gleich?
		
		// Wenn equals nicht überschrieben ist funktioniert equals wie ==
		
		// Duplikate aus Sicht von Java liefern den gleichen HashCode und beim Vergleich mit equals ein true
		// Regel: ergibt equals true, muss der HashCode gleich sein
		// equals und HashCode sollten auf gleichen Eigenschaften basieren 
		
		Set<Todo> todos = new HashSet<>(); // Set erlaubt keine Duplikate
		todos.add(t1);
		todos.add(t2);
		
		System.out.println(todos);
		
		Todo t3 = new Todo("Müll rausbringen");
		Person p1 = new Person("Steve", "Rogers");
		Person p2 = new Person("Steve", "Rogers");
		//p = null;
		
		System.out.println(t3.equals(p1));
		System.out.println(t1.equals(t2));
		//System.out.println(p1.equals(p2));
		
		// ORM = Objekt Relationales Mapping
		// Java Objekte werden in Tabellen einer Datanbank geschrieben
		// Daten aus einer Tabelle der Datenbank werden automatisch in Java Objekte übersetzt
		// ORM Frameworks: Hibernate, EclipseLink
		// JPA Java Persistenze API
		
		
		// [8][7][5][1][10]
		// [7][8][5][1][10]
		// [7][5][8][1][10]
		// [7][5][1][8][10]
		// [5][7][1][8][10]
		// [5][1][7][8][10]
		// [1][5][7][8][10]
		
		// vergleich liefert 1 (positiver wert): links ist größer als rechts 
		// vergleich liefert 0: links ist gleich rechts
		// vergleich liefert -1 (negativer wert): links ist kleiner als rechts
		
		/*
		//[A][C][G][B]
		A.compareTo(C) -1 // A.vergleicheDichMit(C);
		C.compareTo(G) -1
		G.compareTo(B) 1
		//[A][C][B][G]
		C.compareTo(B) 1
		//[A][B][C][G]
		A.compareTo(B) -1
		*/
	}
}
