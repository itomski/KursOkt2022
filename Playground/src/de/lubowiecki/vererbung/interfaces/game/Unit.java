package de.lubowiecki.vererbung.interfaces.game;

public interface Unit {
	
	void moveTo(int x, int y);
	
	void attack(Unit other);
	
	default void transport(String thing) {
		System.out.println("Transportiert " + thing);
	}
}
