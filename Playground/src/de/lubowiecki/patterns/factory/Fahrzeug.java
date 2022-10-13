package de.lubowiecki.patterns.factory;

public class Fahrzeug {
	
	private String marke;
	
	private String typ;
	
	private int leistung;
	
	private Antrieb antrieb;
	
	private String farbe;
	
	public Fahrzeug() {
	}

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

	public int getLeistung() {
		return leistung;
	}

	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}

	public Antrieb getAntrieb() {
		return antrieb;
	}

	public void setAntrieb(Antrieb antrieb) {
		this.antrieb = antrieb;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fahrzeug [marke=");
		builder.append(marke);
		builder.append(", typ=");
		builder.append(typ);
		builder.append(", leistung=");
		builder.append(leistung);
		builder.append(", antrieb=");
		builder.append(antrieb);
		builder.append(", farbe=");
		builder.append(farbe);
		builder.append("]");
		return builder.toString();
	}
}
