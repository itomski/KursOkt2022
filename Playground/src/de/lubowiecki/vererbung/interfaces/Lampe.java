package de.lubowiecki.vererbung.interfaces;

// Alle abstrakten Methoden vom Interface MÜSSEN eingebaut werden
// Default Methoden können überschrieben werden
public class Lampe implements Stecker {

	private boolean verbunden;
	
	private boolean an;
	
	public boolean isVerbunden() {
		return verbunden;
	}
	
	public boolean isAn() {
		return an;
	}


	@Override
	public void beziehtStrom() {
		an = true;
		System.out.println("Die Lampe leuchtet");
	}

	@Override
	public void verbindungTrennen() {
		an = false;
		System.out.println("Die Lampe ist aus");
		verbunden = false;
		System.out.println("Lampe: Verbindung zum Strom wurde getrennt");
	}
	
	@Override
	public void verbinden() {
		verbunden = true;
		System.out.println("Die Lampe ist verbunden.");
	}
}
