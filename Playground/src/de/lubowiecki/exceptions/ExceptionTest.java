package de.lubowiecki.exceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		
		
		int[] arr = new int[10]; // Leeres Zahlen Array (Größe: 10)
		int[] arr2 = {};// Leeres Zahlen Array (Größe: 0)
		int[] arr3 = {3,4,8,22};// Gefülltes Zahlen Array (Größe: 4), nur bei gleichzeitiger Deklaration möglich
		arr = new int[]{3,5,7}; // Gefülltes Zahlen Array (Größe: 3)
		arr = null;
		
		while(true) {
			try {
				System.out.println(arr.length);
				System.out.println(arr[2]);
				System.out.println(arr[0]);
				System.out.println(arr[4]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Problem: falscher Index");
				arr = new int[arr.length + 2];
			}
			catch(NullPointerException e) {
				System.out.println("Problem: array ist nicht vorhanden");
				arr = new int[3];
			}
			//...
		}
		
		// Taucht eine Exception auf, wird der try-Block sofort abgebrochen
		// Nach Behandlung der Exception wird die Code unterhalb der try-catch-Anweisung weiter ausgeführt 
		
		// Exception > RuntimeException > IndexOutOfBoundsException > ArrayIndexOutOfBoundsException

		System.out.println();
		
		processArray1(new int[]{5,7,22,8});
		System.out.println();
		
		int[] zahlen = null;
		processArray1(zahlen);
		System.out.println();
		
		processArray1(new int[]{1,2,3,4});
		System.out.println();
		
		showIndex4(new int[]{1,2,3,4,5,8,17});
		System.out.println();
		
		showIndex4(new int[]{1,2,3});
		System.out.println();
		
		showIndex4(zahlen);
		System.out.println();
		
	}
	
	
	public static void processArray1(int[] arr) {
		try {
			for(int i : arr) {
				System.out.println(i);
			}
		}
		catch(NullPointerException e) {
			System.out.println("Problem: array ist nicht vorhanden");
		}
	}
	
	public static void showIndex4(int[] arr) {
		try {
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Problem: falscher Index");
		}
		catch(NullPointerException e) {
			System.out.println("Problem: array ist nicht vorhanden");
		}
	}

}
