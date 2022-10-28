package de.lubowiecki.workshop.statics;

public class StaticTest {
	
	public static int sZahl = 10; // Klassenvariable
	public int iZahl = 20; // Instanzvariable
	
	public static void main(String[] args) {
		
		System.out.println("---- KLASSE ----");
		
		// Statische Variable ist verfügbar
		System.out.println(StaticTest.sZahl);
		
		// Instanzvariablen sind über die Klasse nicht sichtbar
		//System.out.println(StaticTest.iZahl); // Error
		
		System.out.println("---- INSTANZ ----");
		
		StaticTest st1 = new StaticTest();
		System.out.println("st1: " + st1.iZahl); // Über das Objekt sichtbar
		
		StaticTest st2 = new StaticTest();
		System.out.println("st2: " + st2.iZahl);
		
		st1.iZahl = 100; // Instanzvariable wird geändert. Eine Änderung betrifft nur das angesprochene Objekt
		System.out.println("st1: " + st1.iZahl);
		System.out.println("st2: " + st2.iZahl);
		
		
		System.out.println("---- STATISCHE VARIABLE ÜBER DAS OBJEKT ANGESPROCHEN ----");
		// Über ein Objekt können auch die statischen Variablen angesprochen werden
		System.out.println("st1: " + st1.sZahl);
		System.out.println("st2: " + st2.sZahl);
		
		System.out.println();
		// Ändert sich eine statische Variable, betrifft die Änderung auch alle darauf basierenden Objekte
		// Alle Ojekte des gleich Typs(Klassa) teilen sich die gleichen statischen Variablen
		//st1.sZahl = 200;
		StaticTest.sZahl = 300; // Änderung über die Klasse
		System.out.println("st1: " + st1.sZahl);
		System.out.println("st2: " + st2.sZahl);
		
		// Bei der Definition von Klasse sollte überlegt werden
		// Welche Eigenschaften ein Objekt exclusiv haben muss - Instanzvariablen
		// Welche Eigenschaften gemeinsam von allen Objektn der gleiche Klasse genutzt werden sollen - Klassenvariablen
		
		
	}
}
