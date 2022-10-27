package de.lubowiecki.workshop.okt27;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		// Besonders gut, wenn man nur wenige oder nur eine Zufallszahl im Verlauf des Programms erzeugen möchte
		
		// random: double Zufallszahl zwischen 0 und 1, wobei 1 nie erreicht wird
		// floor: rundet ab, bleibt bei double
		// (int): cast von double auf Ganzzahlen
		int zufall1 = (int)Math.floor(Math.random() * 10) + 1;
		
		// Besonders gut, wenn man mehrere Zufallszahlen im Verlauf des Programms erzeugen möchte
		Random rand = new Random(); // Bleibt im Speicher bis der Geltungsbereich beendet wird
		int zufall2 = rand.nextInt(10) + 1;
		

		System.out.println(rand1Bis10());
		System.out.println(rand1Bis10());
		
		int zahl = rand1Bis10();
		zahl++; // zählt das Erg. um 1 hoch
		System.out.println(zahl);
		
		int sum = rand1Bis10() + rand1Bis10() + rand1Bis10();
		System.out.println(sum);
		
	}
	
	public static int rand1Bis10() {
//		Random rand = new Random();
//		return rand.nextInt(10) + 1;
		
		return (int)Math.floor(Math.random() * 10) + 1;
	}

}
