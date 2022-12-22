package de.lubowiecki.arrays;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		int i = 10;
		i = 20;
		
		// Jedes Array hat eine feste Größe
		int[] j = {10, 20, 30, 40, 50}; // Werte gleich vorgeben, Größe wird abhängig der Anzahl vorgegebener Werte festgelegt

		System.out.println(j.length);
		System.out.println(j);
		System.out.println(Arrays.toString(j)); // Zeigt den Inhalt des Arrays
		
		for (int x = 0; x < j.length; x++) {
			System.out.println(j[x]);
		}
		
		System.out.println();
		
		for (int x : j) {
			System.out.println(x);
		}
		
		//j = {60, 70, 80, 90, 100}; // diese Schreibweise ist nur bei der Deklaration der Variable möglich
		j = new int[]{60, 70, 80, 90, 100}; // Es wird keine Größe vorgegeben
		
		System.out.println();
		
		j = new int[10]; // Erzeugt ein leeres int-Array mit der Größe 10
		System.out.println(Arrays.toString(j));
		
		Arrays.fill(j, 8);
		System.out.println(Arrays.toString(j));
		
		// Der Index eines Arrays beginnt bei 0
		j[5] = 17; // Fügt auf der Position mit dem Index 5 eine 17 ein, überschreibt dabei den alten Wert
		System.out.println(Arrays.toString(j));
		
		//j[15] = 100; // ArrayIndexOutOfBoundsException bekommen, Indexposition nicht vorhanden
		//System.out.println(j[15]); // Lesen an gewünschter Position/Index: ArrayIndexOutOfBoundsException
		System.out.println(j[5]); // Lesen an gewünschter Position
		
		j = new int[]{5, 22, 18, 38, 9, 100, -5};
		System.out.println(Arrays.toString(j)); // Unsortiert
		Arrays.sort(j);
		System.out.println(Arrays.toString(j)); // Sortiert
		
		// Arrays können mit primitioven oder komplexen Werten gefüllt werden
		
		String[] arr = {"Max", "Bob", "Hans"};
		System.out.println(arr[2]);
		arr[1] = "Anna";
		System.out.println(Arrays.toString(arr));
		
		for (String x : arr) {
			System.out.println(x);
		}
		
		System.out.println();
		
		printOut(arr);
		
	}
	
	public static void printOut(String[] namen) {
		for (String name : namen) {
			System.out.println(name);
		}
	}
	
}
