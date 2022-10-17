package de.lubowiecki.vererbung2;

public abstract class Fahrzeug {
	
	private String marke;
	
	private String typ;
	
	int baujahr = 2020;
	
	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public abstract void bewegung();

}
