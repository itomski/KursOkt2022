package de.lubowiecki.workshop.dec15;

import java.util.Scanner;

public class Krokodoc {
	
	private Krokodil krok = new Krokodil();
	private Scanner scanner = new Scanner(System.in);
	
	
	public void run() {
		
		int spieler = 1;
		int runde = 1;
		
		while(true) {
			
			System.out.println(krok.zeigeZaehne());
			
			System.out.println("Runde: " + runde);
			System.out.println("Spieler: " + spieler);
			
			System.out.print("Auswahl: ");
			
			try {
				krok.zieheZahn(scanner.nextInt());
				System.out.println("Super. Zahn wurde gezogen.");
				
				runde++;
				spieler = (runde % 2) == 0 ? 2 : 1;
				
			} 
			catch (KrankerZahnErwischtException e) {
				System.out.println("Aua!!!!!!!!");
				break;
				
			} 
			catch (ZahnBereitsGezogenException e) {
				System.out.println("Zahn bereits gezogen!");
				continue;
			}
		}
		
		System.out.println("Spieler " + spieler + " hat verloren.");
	}
}
