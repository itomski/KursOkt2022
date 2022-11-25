package de.lubowiecki.patterns.builder;

public class Fahrzeug {
	
	private final String marke;
	private final String typ;
	
	private String kenzeichen;
	
	private final String farbe;
	
	public Fahrzeug(String marke, String typ, String kenzeichen, String farbe) {
		this.marke = marke;
		this.typ = typ;
		this.kenzeichen = kenzeichen;
		this.farbe = farbe;
	}

	public String getKenzeichen() {
		return kenzeichen;
	}

	public void setKenzeichen(String kenzeichen) {
		this.kenzeichen = kenzeichen;
	}

	public String getMarke() {
		return marke;
	}

	public String getTyp() {
		return typ;
	}

	public String getFarbe() {
		return farbe;
	}
}
