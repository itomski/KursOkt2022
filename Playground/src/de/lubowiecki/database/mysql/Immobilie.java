package de.lubowiecki.database.mysql;

public class Immobilie {
	
	private long id;
	private String titel;
	private String beschreibung;
	private int groesse;
	private double preis;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public String getBeschreibung() {
		return beschreibung;
	}
	
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	public int getGroesse() {
		return groesse;
	}
	
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	
	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}
}
