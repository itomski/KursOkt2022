package de.lubowiecki.lambdas;

import java.util.ArrayList;
import java.util.LinkedList;

public class DynamicTypeTest1 {

	public static void main(String[] args) {
		
		// Kurzschreibweise ab Java 9
		var i = 100; // Im Kompilat steht ein fester Typ
		//i = 10.0; // Geht nicht, da i auf int festgelegt ist

		var list = new ArrayList<String>(); // Verwendet ArrayList als Referenztyp
		//list = new LinkedList<String>(); // Error: LinkedList ist keine ArrayList
		
		// Primitive Werte landen NICHT im Byte-Literal-Pool
		Integer j = 100; // Landet im Byte-Literal-Pool
		j = new Integer(100); // Landet NICHT im Byte-Literal-Pool
		j = Integer.valueOf(100); // Landet NICHT im Byte-Literal-Pool
		
		
		// Beispiel aus JavaScript
		// func ist vom Datetyp Function
//		var func = function(a, b) {
//		};
//		
//		func(10, 20);
//		
//		machWas(function(a, b) {
//		});
//		
//		machWas((a, b) => a + b);
		
		// Methoden sind Funktionen, die zu einer Klasse gehören
		// Funktionen gehören zu keiner Klasse - gibt es in Java nicht
		
		
		
		
		
	}

}
