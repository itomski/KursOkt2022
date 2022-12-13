package de.lubowiecki.vererbung.interfaces.game;

public class Cavalry extends AbstractUnit implements Militant, Logistician {

	@Override
	public void attack(Unit other) {
		System.out.println("Angriff zur Pferd");
	}
	
	// default Methode wird 2x geerbt (von Unit und von Logistican), Error
	// Es ist nicht klar, welche der Methode hier verwendet werden soll
	// Das Problem kann nur gelöst dadurch werden, dass KEINE der beiden Methoden verwendet wird
	// Sondern die Klasse eine eine EIGENE Methode anbietet
	
	@Override
	public void transport(String thing) {
		System.out.println("Transport von " + thing + " mit dem Pferd.");
	}
	
	
}
