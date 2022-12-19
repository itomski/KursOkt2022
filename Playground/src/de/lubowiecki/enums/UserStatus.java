package de.lubowiecki.enums;

public enum UserStatus {
	
	// Reihenfolge der Konstanten ist für das ordinal verantwortlich
	AKTIV, GEBLOCKT, GELOESCHT;
	
	// Darf einen Konstruktor enthalten, ist per default private
	// d.h. man kann private oder nichts davor schreiben
	// Das Enum wird von der JVM beim Laden des Enums instanziert, 1x pro Konstante
	private UserStatus() {
		System.out.println("UserStatus init");
	}
}
