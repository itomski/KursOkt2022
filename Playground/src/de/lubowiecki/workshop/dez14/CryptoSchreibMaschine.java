package de.lubowiecki.workshop.dez14;

import java.util.Scanner;

public class CryptoSchreibMaschine {
	
	private final Scanner scanner = new Scanner(System.in); 
	
	private final CryptoUnit cryptoUnit;
	

	public static void main(String[] args) {
		new CryptoSchreibMaschine(new GagaCrypro()).run();
	}
	
	public CryptoSchreibMaschine(CryptoUnit cryptoUnit) {
		this.cryptoUnit = cryptoUnit;
	}

	private void run() {
		
		while(true) {
			
			System.out.print("Auswahl [D|E]: ");
			
			String input = scanner.nextLine().trim().toUpperCase();
			
			if(input.equals("D")) {
				System.out.print("Verschlüsselt: ");
				input = scanner.nextLine().trim();
				System.out.println("Klartext: " + cryptoUnit.decode(input));
			}
			else if(input.equals("E")) {
				System.out.print("Klartext: ");
				input = scanner.nextLine().trim();
				System.out.println("Verschlüsselt: " + cryptoUnit.encode(input));
			}
			else if(input.equals("EXIT")) {
				System.exit(0); // Programm beenden
			}
			else {
				System.out.println("Auswahl war ungültig");
			}
		}
	}

}
