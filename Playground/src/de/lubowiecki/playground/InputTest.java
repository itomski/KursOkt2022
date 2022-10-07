package de.lubowiecki.playground;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Eingabe: ");
			String eingabe = scanner.next();
			
			if(eingabe.equalsIgnoreCase("exit")) break;
			
			System.out.println("Deine Eingabe: " + eingabe);
		}
		
		System.out.println("Ende...");
	}

}
