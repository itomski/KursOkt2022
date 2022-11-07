package de.lubowiecki.vererbung.basics;

//Rentner erbt von Mensch
//Mensch ist die Elernklasse
//Rentner ist die Kindklasse
public class Rentner extends Mensch {
	
	@Override
	public void machEtwas() {
		System.out.println("Ich mach gar nichts mehr... bin ein Rentner");
	}

}
