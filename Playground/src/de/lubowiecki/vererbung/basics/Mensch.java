package de.lubowiecki.vererbung.basics;

public class Mensch {
	
	// private Eigenschaften und Methoden werden nicht vererbt
	private String vorname;
	private String nachname;
	
	// Alles was nicht privat ist wird an die Kindklassen weitergegeben
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public void machEtwas() {
		System.out.println("Der Mensch macht etwas...");
	}
}
