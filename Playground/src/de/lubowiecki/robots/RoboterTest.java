package de.lubowiecki.robots;

public class RoboterTest {

	public static void main(String[] args) {
		
		Robot r1 = new Robot("R2-D2");
		//System.out.println(r1);
		r1.sagHallo();
		r1.zeigePosition();
		r1.schrittVorwaerts();
		r1.schrittVorwaerts();
		r1.zeigePosition();
		
		for(int i = 0; i < 10; i++) {
			r1.drehungRechts();
			r1.zeigeRichtung();
		}
		
		System.out.println();
		for(int i = 0; i < 10; i++) {
			r1.drehungLinks();
			r1.zeigeRichtung();
		}
		
		System.out.println(r1);
		
		r1.schrittVorwaerts();
		r1.schrittVorwaerts();
		System.out.println(r1);
		r1.drehungRechts();
		System.out.println(r1);
		r1.schrittVorwaerts();
		r1.schrittVorwaerts();
		System.out.println(r1);
		r1.drehungRechts();
		System.out.println(r1);
		r1.schrittVorwaerts();
		r1.schrittVorwaerts();
		System.out.println(r1);
		r1.drehungRechts();
		System.out.println(r1);
		r1.schrittVorwaerts();
		r1.schrittVorwaerts();
		System.out.println(r1);
		
		
		
//		System.out.println();
//		
//		// Für die Objekterzeugung wird der Konstruktor mit 3 Parametern verwendet
//		Robot r2 = new Robot("C-3PO", 10, 15); 
//		//System.out.println(r2);
//		r2.sagHallo();
//		r2.zeigePosition();
//		r2.schrittVorwaerts();
//		r2.schrittVorwaerts();
//		r2.zeigePosition();
//		r2.schrittRueckwaerts();
//		r2.schrittRueckwaerts();
//		r2.schrittRueckwaerts();
//		r2.schrittRueckwaerts();
//		r2.zeigePosition();
//		
//		System.out.println();
//		
//		Robot r3 = new Robot("BB-8");
//		//System.out.println(r3);
//		r3.sagHallo();
//		r3.zeigePosition();

	}
}
