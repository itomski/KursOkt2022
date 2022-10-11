package de.lubowiecki.robots;

public class Robot {
	
	// Methode verliert den Zustand lokaler Variablen am Ende der Methode
	// Objekt verliert den Zustand der Instanzvariablen, wenn es vom Heap entfernt wird
	// Klasse verliert den Zustand von Klassenvariablen am Ende des Programms
	
	// Variable ist verfügbar, bis das Objekt vom Heap entfernt wird
	private String name;
	
	private int x; // Standard: 0
	private int y; // Standard: 0
	
	public static final String[] RICHTUNGEN = {"Osten", "Süden", "Westen", "Norden"}; 
	
	private int richtung; // 0 = Osten(rechts), 1 = Süden(unten), 2 = Westen(links), 3 = Norden(oben) 
	
	// Konstruktor: Belegt das Objekt mit gewünschten Werten
	public Robot(String name) {
		
		// Lokale Variablen werden etweder in der Parameterliste oder im Verlauf der Methode deklariert
		// String abc; // Deklaration einer lokalen Variable
		// String abc = "Abc"; // Deklaration und Initialisierung einer lokalen Variable
		
		// name = Lokale Variable
		// this.name = Instanzvariable
		
		// hat die lokale und Instanz-Variable den gleichen Namen, dann wird standardmäßig
		// über den Namen die lokale Variable angesprochen und über this. wird die Instanzvariable angesprochen
		
		this.name = name; // Zustand der lokalen Variable wird in die Instanzvariable gespeichert
	} // Lokale Variable (name) wird gelöscht, Instanzvariable bleibt erhalten

	public Robot(String name, int x, int y) {
		// Werte aus lokalen Variablen werden in Instanzvariablen kopiert
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public void schrittVorwaerts() {

		// TODO: Bewegung in negativen Berich verhindern
		switch(richtung) {
			case 0:
				x++;
				break;
				
			case 1:
				y++;
				break;	
		
			case 2:
				x--;
				break;
		
			case 3:
				y--;
				break;	
		}
	}
	
	public void schrittRueckwaerts() {
		switch(richtung) {
			case 0:
				x--;
				break;
				
			case 1:
				y--;
				break;	
		
			case 2:
				x++;
				break;
		
			case 3:
				y++;
				break;	
		}
	}
	
	public void sagHallo() {
		System.out.println("Hi, ich bin " + name);
	}
	
	public void zeigePosition() {
		System.out.println("x = " + x + ", y = " + y);
	}
	
	public void drehungRechts() {
		richtung = ++richtung % 4;
	}
	
	public void drehungLinks() {
		richtung = (richtung + 3) % 4;
	}
	
	public void zeigeRichtung() {
		System.out.println(RICHTUNGEN[richtung]);
	}
	
	@Override
	public String toString() {
		return "Robot [name=" + name + ", x=" + x + ", y=" + y + ", richtung=" + RICHTUNGEN[richtung] + "]";
	}
}
