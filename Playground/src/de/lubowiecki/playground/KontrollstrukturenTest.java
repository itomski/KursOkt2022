package de.lubowiecki.playground;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class KontrollstrukturenTest {

	public static void main(String[] args) {
		
		int alter = 82;
		
		if(alter > 16) {
			if(alter < 80) {
				System.out.println("Das darfst du!");
			}
			else {
				System.out.println("Das darfst du nicht!");
			}
		}
		else {
			System.out.println("Das darfst du nicht!");
		}
		
		System.out.println((alter < 16) ? "Das darfst du nicht!" : "Das darfst du!");
		
		System.out.println((alter > 16) ? (alter < 80) ? "Das darfst du!" : "Das darfst du nicht!" : "Das darfst du nicht!");
		
		int i = 122;
		String str = (i % 2 == 0) ? "gerade" : "ungerade";
		System.out.println(str);
		
		System.out.println();
		
		int tagDerWoche = LocalDate.now().get(ChronoField.DAY_OF_WEEK);
		System.out.println(tagDerWoche);
		
		Wochentag tag = Wochentag.values()[tagDerWoche - 1];
		System.out.println(tag);
		
		switch(tag) {
			
			case MO:
			case DI:
			case MI:
			case DO:
			case FR:
				System.out.println("Arbeitstag");
				break;
				
			case SA:
			case SO:
				System.out.println("Wochenende");
				break;
				
//			default:	
//				System.out.println("Unbekannt");
//				break;
		}
		
		
		String input = "A";
		
		final String var1 = "c"; // muss eine Compieletime-Konstante
		
		final String var2; // Runtime-Konstante
		var2 = "c"; 
		
		switch(input.toLowerCase()) {
		
			case "a":
				System.out.println("#");
				break;
				
			case "b":
				System.out.println("@");
				break;
				
			case var1:
				System.out.println(">");
				break;
		}
		
		
		byte zahl = 100;
		
		switch(zahl) {
		
			case 10:
				System.out.println("#");
				break;
				
			case 20:
				System.out.println("@");
				break;
				
//			case 130: // Wert zu hoch
//				System.out.println(">");
//				break;
		}
		
//		if() {
//			
//		}
//		else if() {
//			
//		}
//		else {
//			
//		}
		
		for(int j = 0;j < 100; System.out.println(++j)) {
			System.out.println("x");
		}
		
		int j = 200;
		
//		var x = 10; // ab Java 10 möglich
//		x = "xyz"; // Error, muss ein int sein
			
	}
}

enum Wochentag {
	
	MO, DI, MI, DO, FR, SA, SO;
	
}
