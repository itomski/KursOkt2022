package de.lubowiecki.kaffee;

import java.util.List;

public class KaffeeAutomatenTest {

	public static void main(String[] args) {
		
		// Simuliere einen KaffeeAutomten
		// 1. Münzen mit passendem Wert müssen eingeworfen werden
		// 2. Kaffee wird angefordert
		// 3. Beim Abbruch werden die Münzen erstattet
		
		KaffeeAutomat automat = new KaffeeAutomat();
		
		List<Muenze> rueckgabe = automat.geldRueckgabe();
//		
//		if(rueckgabe.size() > 0) {
//			System.out.println("Rückgabe erfolgt");
//			System.out.println(rueckgabe);
//		}
//		else {
//			System.out.println("Es wurde kein Geld eingezahlt.");
//		}
//		
		Muenze m = Muenze.get10Cent();
		automat.geldEinwerfen(m);
		
		m = Muenze.get20Cent();
		automat.geldEinwerfen(m);
		
		m = Muenze.get50Cent();
		automat.geldEinwerfen(m);
		
		m = Muenze.get50Cent();
		automat.geldEinwerfen(m);
		
		m = Muenze.get20Cent();
		automat.geldEinwerfen(m);
		
		System.out.printf("Eingezahlt: %.2f EUR \n", automat.getSummeGeld());
		
		if(automat.kaffeeAnfordern()) {
			System.out.println("Kaffee erhalten");
		}
		else {
			System.out.println("Geldeinwurf nicht ausreichend.");
		}
//
//		System.out.printf("Eingezahlt: %.2f EUR \n", automat.getSummeGeld());
//		
//		if(automat.kaffeeAnfordern()) {
//			System.out.println("Kaffee erhalten");
//		}
//		else {
//			System.out.println("Geldeinwurf nicht ausreichend.");
//		}
//		
		rueckgabe = automat.geldRueckgabe();
		
		if(rueckgabe.size() > 0) {
			System.out.println("Rückgabe erfolgt");
			System.out.println(rueckgabe);
		}
		else {
			System.out.println("Es wurde kein Geld eingezahlt.");
		}
		
		System.out.printf("Eingezahlt: %.2f EUR \n", automat.getSummeGeld());
	}

}
