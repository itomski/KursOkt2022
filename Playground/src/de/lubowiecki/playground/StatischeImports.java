package de.lubowiecki.playground;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static de.lubowiecki.playground.Monat.*;

public class StatischeImports {

	public static void main(String[] args) {
		
		// Statische Imports importieren statisches Inventar einen anderen Klasse
		// so dass es genutzt werden kann, als wäre es direkt hier deklariert
		
		System.out.println(PI);
		
		System.out.println(random());
		
		System.out.println(Monat.FEB);
		
		System.out.println(FEB);
		System.out.println(DEZ);

	}
}
