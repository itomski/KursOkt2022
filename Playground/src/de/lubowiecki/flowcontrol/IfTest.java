package de.lubowiecki.flowcontrol;

public class IfTest {

	public static void main(String[] args) {
		
		if(true) {
			
		}
		
		int i = 27;
		
		if(i < 10) {
			System.out.println("#");
		}
		else if(i >= 10 && i < 20) {
			System.out.println("@");
		}
		else {
			System.out.println("%");
		}
		
		String wort = null;
		
		int j = 3;
		// Short-Circuit stopt die Verarbeitung der Bedingung sobald eine Antwort feststeht
		if(wort != null && wort.length() > (j++))
			System.out.println("Das Wort ist länger als 3 Zeichen...");
		
		System.out.println(j);
		
//		if(wort != null & wort.length() > (j++))
//			System.out.println("Das Wort ist länger als 3 Zeichen...");
		
//		System.out.println(j);
		
		
		
		// Short-Circuit stopt die Verarbeitung der Bedingung sobald eine Antwort feststeht
		j = 10;
		if(j > 5 || ++j < 10) // Der zweite Teil der Bedingung wird nur ausgeführt, wenn der erste fals ergab
			System.out.println("> 5 oder < 10");

		System.out.println(j);
		
		j = 10;
		if(j > 5 | ++j < 10) // Hier werden beide Teile der Bedingung ausgeführt
			System.out.println("> 5 oder < 10");
		
		System.out.println(j);
		
		
		int erg1 = 10 | 5; // ergibt eine zahl oder ein boolean
		//int erg2 = 10 || 5; // ergibt nur ein boolean
		
		System.out.println();
		
		int z = 10;
		
		String erg = (z > 10) ? "größer" : "kleiner oder gleich";
		System.out.println(erg);
		
		erg = (z > 10) ? "größer" : (z == 10) ? "gleich" : "kleiner";
		System.out.println(erg);
		
		if(z > 10) {
			System.out.println("größer");
		}
		else {
			
			if(z == 10) {
				System.out.println("gleich");
			}
			else {
				System.out.println("kleiner");
			}
		}

		// Typ variable =  (WENN Bedingung wahr) ? "DANN" : "SONST";
//		if(BEDINGUNG) {
//			"DANN"
//		}
//		else {
//			"SONST"
//		}
		
		
		// Typ variable =  (WENN BEDINGUNG wahr) ? ((WENN SUB-BEDINGUNG) ? "SUB DANN" : "SUB SONST") : "SONST";
//		if(BEDINGUNG) {
//			if(SUB_BEDINGUNG) {
//				"SUB DANN"
//			}
//			else
//			{
//				"SUB SONST"
//			}
//		}
//		else {
//			"SONST"
//		}
		
		// Typ variable =  (WENN BEDINGUNG wahr) ? "DANN" : ((WENN SUB-BEDINGUNG) ? "SUB DANN" : "SUB SONST");
//		if(BEDINGUNG) {
//			"DANN"
//		}
//		else {
//			if(SUB_BEDINGUNG) {
//				"SUB DANN"
//			}
//			else
//			{
//				"SUB SONST"
//			}
//		}
		
		System.out.println();
		
		int zahl = 4;
		
		if(zahl <= 10) {
			if(zahl < 5) {
				System.out.println("kleiner 5");
			}
			System.out.println("keiner gleich 10");
		}
		else {
			System.out.println("größer 10");
		}
		
		System.out.println();
		
		String out = (zahl <= 10) ? (zahl < 5) ? "kleiner 5, keiner gleich 10" : "keiner gleich 10" : "größer 10";
		System.out.println(out);
		
		int n = 1;
		System.out.println("Das ist das Haus von " + ((n == 1) ? "Peter" : "Nikigraus"));
		
		
	}
	
}
