package de.lubowiecki.patterns.factory;

public class FahrzeugFactory {
	
	public Fahrzeug createGolf(String farbe, Antrieb antrieb) {
		Fahrzeug f = new Fahrzeug();
		f.setAntrieb(antrieb);
		f.setFarbe(farbe);
		f.setLeistung(150);
		f.setMarke("VW");
		f.setTyp("Golf");
		return f;
	}
}