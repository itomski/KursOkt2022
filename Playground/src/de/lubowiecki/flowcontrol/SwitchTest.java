package de.lubowiecki.flowcontrol;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		// NICHT erlaubt: boolean, long, float, double, alle komplexen Datentypen außer String und Ganzzahl-Wrapper
		byte eingabe = 100;
		
		switch(eingabe) {
			default: System.out.print("F");
			case 5: System.out.print("A"); break;
			case 8: System.out.print("B");
			case 10: System.out.print("C"); break;
			case 20: System.out.print("D"); break;
			//case 150: System.out.print("E"); break;
		}
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		int in = 0;
		
		abc: while(true) {
			
			System.out.print("\nZahl: ");
			in = scanner.nextInt();
			
			switch(in) {
				default: System.out.print("F");
				case 5: System.out.print("A"); break; // break bezieht sich auf die switch-Anweisung
				case 8: System.out.print("B");
				case 10: System.out.print("C");
				case 20: System.out.print("D"); continue; // continue bezieht sich auf die while-Schleife 
				case 30: System.out.print("E"); break;
				case 50: System.out.print("Ende"); break abc; // Mit label um die while-Schleife zu beenden
			}
		}
	}
}
