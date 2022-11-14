package de.lubowiecki.playground;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.PI; // funktioniert nur für statisches Inventar
import static java.lang.Math.pow;
import static java.lang.System.out;
import static de.lubowiecki.playground.ConsoleHelper.println;
import static de.lubowiecki.playground.Monat.*;
import static java.util.Arrays.asList;

public class ImportTest { // Top-Level-Klasse

	public static void main(String[] args) {
		
		// Math.PI
		// System.out.println()
		out.println(PI);

		// Math.pow()
		// ConsoleHelper.println()
		println(pow(10, 2));
		
		//Monat.AUG
		println(AUG);
		
		// Arrays.asList()
		List<Integer> zahlen = asList(1,2,3,4,5,6,7,8,9,0);

	}
	
	class Other { // Innere Klasse
	}
}
