package de.lubowiecki.robots;

import java.util.Scanner;

public class RoboterSteuerungUI {

	public static void main(String[] args) {
		
		final Scanner scanner = new Scanner(System.in);
		Robot robot = new Robot("R2-D2");
		
		app: while(true) {
			
			System.out.print("Eingabe: ");
			String eingabe = scanner.next().trim().toLowerCase();
			
			if(eingabe.equals("exit")) break app; // Bricht die while-Schleife mit dem Label app ab
			// Eingabe in einzelne Zeichen zerlegen
			String[] keys = eingabe.split("");
			
			for(String key : keys) {
				switch(key) {
					
					case ">":
						robot.schrittVorwaerts();
						break;
						
					case "<":
						robot.schrittRueckwaerts();
						break;
						
					case "r":
						robot.drehungRechts();
						break;
						
					case "l":
						robot.drehungLinks();
						break;
						
					default:
						System.out.println("Ungültig");
				}
			}
			
			System.out.println(robot);
			
		}
		
		System.out.println("Programmende");
	}

}
