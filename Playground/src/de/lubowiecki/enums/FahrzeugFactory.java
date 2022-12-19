package de.lubowiecki.enums;

public class FahrzeugFactory {
	
	private Marke marke;
	private Typ typ;
	private Farbe farbe;
	
	
	public FahrzeugFactory(Marke marke, Typ typ, Farbe farbe) {
		this.marke = marke;
		this.typ = typ;
		this.farbe = farbe;
	}

	public Fahrzeug create() {
		// Objekt gem der Config zusammenstellen und zurückgeben
		return new Fahrzeug();
	}
}
