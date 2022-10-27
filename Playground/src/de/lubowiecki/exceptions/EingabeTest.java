package de.lubowiecki.exceptions;

import java.util.Scanner;

public class EingabeTest {

	public static void main(String[] args) {
		
		System.out.println("START");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("Eingabe: ");
				int zahl = scanner.nextInt();
				System.out.println(zahl);
				break;
			}
			catch(RuntimeException e) {
				System.out.println("Die Eingabe ist keine gültige Ganz-Zahl.");
				scanner.next(); // fix
			}
		}
		
		System.out.println("ENDE");
	}

}
