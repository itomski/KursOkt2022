package de.lubowiecki.vererbung.interfaces;

public interface Stecker {
	
	// Sagt, WAS eingebaut werden MUSS aber nicht WIE es eingebaut werden MUSS!
	
	void beziehtStrom();
	
	void verbindungTrennen();
	
	// Wird diese Methode nicht überschrieben, dann wird die default-Methode geerbt
	default void verbinden() {
		// Ein Interface hat keine Eigenschaften
		// Alle Eigenschaften sind public static final
		System.out.println("Gerät wurde verbunden...");
		
		// Kann andere Methoden des Interface verwenden
	}
}