package de.lubowiecki.collections;

public class Aufgabe {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		//System.out.println(i); // Nicht mehr sichtbar
		
		int i = 0;
		for(; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		
		i = 0;
		for(; i < 5;) {
			System.out.println(i);
			i++;
		}
		System.out.println(i);
		
//		for(;;) { // Entlos-Schleife
//			System.out.println("...");
//		}
		
		// Ist der zweite Block nicht gefüllt, ist die Bedingung immer true
		// d.h. Endlos-Schleife
		for(;;System.out.println("..."));	
	}
}

