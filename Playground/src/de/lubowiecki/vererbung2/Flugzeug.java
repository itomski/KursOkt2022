package de.lubowiecki.vererbung2;

public class Flugzeug extends Fahrzeug {

	@Override
	public void bewegung() {
		System.out.println("Fliegt durch die Gegend...");
	}
}
