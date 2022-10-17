package de.lubowiecki.vererbung3;

import java.util.LinkedList;
import java.util.Queue;

public class FlughafenTest {
	
	public static void main(String[] args) {
		
		Flughafen ber = new Flughafen();
		
		Queue<Landbar> warteschlange = new LinkedList<>();
		warteschlange.add(new A380());
		warteschlange.add(new A380());
		warteschlange.add(new Flugente());
		warteschlange.add(new A380());
		warteschlange.add(new Flugente());
		warteschlange.add(new ImperialerKreuzer());
		warteschlange.add(new ImperialerKreuzer());
		warteschlange.add(new A380());
		warteschlange.add(new ImperialerKreuzer());
		
		ber.addFlugzeugSammlung(warteschlange);
		
		
//		A380 f1 = new A380();
//		ImperialerKreuzer ik1 = new ImperialerKreuzer();
		
		//ber.landen(ik1);
		//ber.starten(ik1);
		
		Flugobjekt f3 = new A380();
		Flugobjekt f4 = new ImperialerKreuzer();
		// Flugobjekt f5 = new Flugente();
		
		
		
		
	}

}
