package de.lubowiecki.workshop.dec15;

public class Krokodoc {
	
	public void run() {
		
		Krokodil krok = new Krokodil();
		
		System.out.println(krok.zeigeZaehne());
		
		int auswahl = 10;
		
		try {
			krok.zieheZahn(auswahl);
		} 
		catch (KrankerZahnErwischtException e) {
			System.out.println(e.getMessage());
		} 
		catch (ZahnBereitsGezogenException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(krok.zeigeZaehne());
	}
}
