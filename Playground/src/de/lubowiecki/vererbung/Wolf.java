package de.lubowiecki.vererbung;

public class Wolf extends Tier {
	
	public Wolf() {
		// super(); // Kostruktor der Elternklasse (Tier)
		System.out.println("Wolf");
	}
	
	public void jagen() {
		System.out.println(getGattung() + " " + getAlter());
		System.out.println("Wolf jagt...");
	}
	
	@Override
	public String toString() {
		return "Wolf...";
	}
}
