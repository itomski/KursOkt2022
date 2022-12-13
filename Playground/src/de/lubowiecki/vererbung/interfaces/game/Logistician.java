package de.lubowiecki.vererbung.interfaces.game;

public interface Logistician {
	
	default void transport(String thing) {
		System.out.println("Transportiert " + thing + " ...");
	}
}
