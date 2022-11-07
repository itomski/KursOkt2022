package de.lubowiecki.vererbung.basics;

import java.util.ArrayList;
import java.util.List;

public class VererbungTest {

	public static void main(String[] args) {
		
		// Jede Klasse in Java ist eine Kind-Klasse von Object
		// d.h. sie kann alles (nicht private) verwenden, dass in Object definiert ist
		
		Mensch m1 = new Mensch();
		
		// Weil Mensch eine Kindklasse von Object ist
		// Kann ein Objekt der Kindklasse auf eine Referenz der Elternklasse zugewiesen werden
		Object o1 = new Mensch();
		
		// Über die Referenz der Elternklasse sehe ich nur das, was dort definiert ist
		// Details der Kindklasse bleiben verborgen
		
		// Weil Student eine Kindklasse von Mensch ist
		Mensch m2 = new Student();
		m2.setVorname("Peter");
		System.out.println(m2.getVorname());
		m2.machEtwas();
		
		System.out.println();
		
		// Weil Rentner eine Kindklasse von Mensch ist
		m2 = new Rentner();
		m2.setVorname("Hans");
		System.out.println(m2.getVorname());
		m2.machEtwas();
		
		System.out.println();
		
		// Weil Mensch ist ein Mensch
		m2 = new Mensch();
		m2.setVorname("Carol");
		System.out.println(m2.getVorname());
		m2.machEtwas();
		
		System.out.println();
		
		
		Student s1 = new Student();
		// Student enthält alle von der Elternkasse geerbten Methoden 
		s1.setNachname("Parker");
		s1.machEtwas();
		
		// s1 = new Rentner(); // Rentner ist KEIN Student, Error
		// s1 = new Mensch(); // Student ist ein Mensch, aber nicht jeder Mensch ist ein Student!!! Error
		
		System.out.println();
		
		Rentner r1 = new Rentner();
		// Rentner enthält alle von der Elternkasse geerbten Methoden 
		r1.setNachname("Hansen");
		r1.machEtwas();
		
		System.out.println();
		
		// Studenten sind die einzigen Objekte, die hier verwendbar sind
		//runMachWas(r1); // Rentner ist kein Student
		//runMachWas(m2); // Mensch ist kein Student
		runMachWas(s1);
		runMachWas(r1);
		runMachWas(m2);
		
		System.out.println();
		
		// Soll Studenten, Rentner und Menschen enthalten
		List<Mensch> gruppe = new ArrayList<>();
		// Alle Objekte müssen Instanzen von Kindklassen von Mensch sein, oder direkt von Mensch. stehen in einer IS-A-Beziehung
		gruppe.add(new Student());
		gruppe.add(new Student());
		gruppe.add(new Rentner());
		gruppe.add(new Mensch());
		gruppe.add(new Student());
		gruppe.add(new Rentner());
		
		for(Mensch m : gruppe) {
			if(m instanceof Student) // Prüft ob es ein Student ist
				m.machEtwas(); // Hier kann ich alles nutzen, was alle Menschen gemeinsam haben
		}
		
		// Vererbung gibt mir die Möglichkeit der Kompatibilität
		// auf Kosten der Einzigartigkeit 
		// d.h. Komplatibilität konzentriert sich auf "Dinge" die alle gemeinsam haben
		
		// Aufgabe:
		// Schreibe eine Elternkasse für Roboter welche eine Bezeichnung und preis enthält
		// sowie die Möglichkeit der Fortbewegung
		// Schreibe zwei Kindklassen RaupenRoboter und RadRoboter, die die Fortbewegung an ihre Möglichkeiten anpassen
		
		
	}
	
	/*
	// st ist frei wählbar, ist als Variable NUR in der Methode verfügbar
	public static void runMachWas(Student obj) {
		obj.machEtwas();
	}
	
	// Für andere Typen muss die Methode noch eingebaut werden
	public static void runMachWas(Rentner obj) {
		obj.machEtwas();
	}
	*/
	
	// Diese ist mit Mensch und allen Kindklassen von Mensch komplatibel
	public static void runMachWas(Mensch obj) {
		obj.machEtwas(); // die machWas-Methode wird auf dem Original-Typ auf dem Heap ausgeführt
	}

}
