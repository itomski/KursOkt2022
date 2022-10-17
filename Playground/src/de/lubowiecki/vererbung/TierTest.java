package de.lubowiecki.vererbung;

public class TierTest {
	
	public static void main(String[] args) {
		
		Wolf w1 = new Wolf();
		
		System.out.println();
		
		// IS-A
		Object o = new Wolf();
		
		System.out.println();
		
		// IS-A
		// Links: Typ der Referenz
		// Rechts: Typ des Objektes auf dem Heap
		Tier t = new Wolf();
		t = new Zebra();
		
		System.out.println();
		
		w1.jagen();
		System.out.println(w1);
		
		Zebra z = ((Zebra)t);
		// Zebra z = new Wolf(); // Wolf ist nicht von Zebra abgeleitet
		
		
	}

}
