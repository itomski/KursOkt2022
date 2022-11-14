package de.lubowiecki.playground;

import java.time.LocalTime;

public class NextInitializerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class BeispielKlasse1  {
	
	// Hier sind nur Zweisungen möglich, die als eine Anweisung ausgeführt werden können
	public static final int zahl1 = (LocalTime.now().isAfter(LocalTime.NOON)) ? 20 : 10;
	
	public static final int zahl2;
	
	// einzige Möglichkeit eine finale Klassenvariable dynamisch zu initialisieren
	static {
		if(LocalTime.now().isAfter(LocalTime.NOON)) {
			zahl2 = 20;
		}
		else {
			zahl2 = 0;
		}
	}
	
	// zu spät. Statische Eigenschaften sind bereits initialisiert
	BeispielKlasse1(int z) {
		// zahl = z;
	}
}