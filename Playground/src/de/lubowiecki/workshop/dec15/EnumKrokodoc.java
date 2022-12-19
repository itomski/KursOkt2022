package de.lubowiecki.workshop.dec15;

import java.util.Scanner;

public class EnumKrokodoc {
	
	private EnumKrokodil krok = new EnumKrokodil();
	private Scanner scanner = new Scanner(System.in);
	
	
	public void run() {
		
		int spieler = 1;
		int runde = 1;
		
		spiel: while(true) {
			
			System.out.println(krok.zeigeZaehne());
			
			System.out.println("Runde: " + runde);
			System.out.println("Spieler: " + spieler);
			
			System.out.print("Auswahl: ");
			
			switch(krok.zieheZahn(scanner.nextInt())) {
				
				case ZAHN_GOZOGEN:
					System.out.println("Super. Zahn wurde gezogen.");
					runde++;
					spieler = (runde % 2) == 0 ? 2 : 1;
					break;
					
				case ZAHN_BEREITS_GEZOGEN:
					System.out.println("Zahn bereits gezogen!");
					continue;	
					
				case FALSCHE_EINGABE:
					System.out.println("Falsche Eingabe!");
					continue;
					
				case ZAHN_KRANK:
					System.out.println("Aua!!!!!!!!");
					break spiel;
			
			}
		}
		
		System.out.println("Spieler " + spieler + " hat verloren.");
		
	}
}

