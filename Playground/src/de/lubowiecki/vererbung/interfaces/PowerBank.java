package de.lubowiecki.vererbung.interfaces;

public class PowerBank implements Stecker {

	@Override
	public void beziehtStrom() {
		System.out.println("Die PowerBank wird geladen");
	}

	@Override
	public void verbindungTrennen() {
		System.out.println("Verbindung wird getrennt");
	}
}
