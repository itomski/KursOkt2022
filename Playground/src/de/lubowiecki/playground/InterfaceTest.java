package de.lubowiecki.playground;

import java.util.ArrayList;

public class InterfaceTest {

	public static void main(String[] args) {
		
		ArrayList<Fahrbar> liste = new ArrayList<>();
		liste.add(new Auto());
		liste.add(new Auto());
		liste.add(new Flugzeug());
		liste.add(new Ufo());
		liste.add(new Flugzeug());
		
		for (Fahrbar f : liste) {
			f.vorwaerts();
		}
		
	}
}

interface Fahrbar {
	
	// Alle Methoden des Interface sind public
	void vorwaerts();
	
	void rueckwaerts();
	
}

class Auto implements Fahrbar {

	@Override
	public void vorwaerts() {
		System.out.println("Fährt auf einer Straße vorwärts");
		
	}

	@Override
	public void rueckwaerts() {
		System.out.println("Fährt auf einer Straße rückwärts");
	}
}

class Flugzeug implements Fahrbar {

	@Override
	public void vorwaerts() {
		System.out.println("Fliegt vorwärts");
		
	}

	@Override
	public void rueckwaerts() {
		System.out.println("Ist nicht möglich");
	}
}

class Ufo implements Fahrbar {

	@Override
	public void vorwaerts() {
		System.out.println("Fliegt wild in der Gegend rum");
		
	}

	@Override
	public void rueckwaerts() {
		System.out.println("Fliegt wild rückwärts in der Gegend rum");
	}
}
