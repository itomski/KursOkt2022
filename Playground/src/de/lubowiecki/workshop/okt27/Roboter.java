package de.lubowiecki.workshop.okt27;

public class Roboter {
	
	// Instanzvariablen, jeder Roboter hat seine eigenen Eingenschaften, eigenen Zustand
	private String serienNr;
	private String typ;
	private String zustand;
	private int baujahr;
	
	// Konstruktor bietet und die Möglichkeit die Erzeugung eines Objektes zu beeinflüssen
	// Der Default-Kostruktor erzeugt immer ein leeres Objekt (Eigenschaften sind mit Default-Werten gefüllt)
	public Roboter(int baujahr) {
		this.baujahr = baujahr;
	}
	
	// Getter zeigen mir einen Wert
	public String getSerienNr() {
		return serienNr;
	}

	// Setter belegen eine Eigenschaft neu
	public void setSerienNr(String serienNr) {
		this.serienNr = serienNr;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	
	// public: steuert die Sichtbarkeit/Nutzbarkeit der Methode
	// String: Rückgabe-Typ, liefert einen String an den Aufrufer
	// getZustand
	public String getZustand() {
		return zustand;
	}

	public void setZustand(String zustand) {
		this.zustand = zustand;
	}
	
	// wenn du die Methode verwendest, bekommst du etwas vom Rückgabe-Typ zurück
	public int getBaujahr() {
		return baujahr;
	}

	// Setter verändern den Zustand des Objekts, liefern aber keinen Rückbagewert zurück
	// int i = r1.setBaujahr(2023); // Error, es wird void(Nichts) und nicht int zurückgegeben
	// r1.setBaujahr(2023); // Ok, verändert einfach das Objekt
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	
	// Methode liefert keinen Rückgabe-Wert
	// String s = r1.showEigenschaften() // Error, Methode liefert keinen String!
	// r1.showEigenschaften() // Ok, Inhalt der Methode wird einfach ausgeführt
	public void showEigenschaften() {
		System.out.println("Baujahr: " + baujahr);
		System.out.println("Zustand: " + zustand);
	}

	// Überschreiben heißt, etwas was man geerbt hat verändern
		// Eine Methode überschreiben heißt beim gleichen Methoden-Aufruf etwas anders zu liefern
	@Override
	public String toString() {
		return "Roboter [serienNr=" + serienNr + ", typ=" + typ + ", zustand=" + zustand + ", baujahr=" + baujahr + "]";
	}
	
}
