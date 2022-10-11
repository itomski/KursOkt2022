package de.lubowiecki.fahrzeuge;

public class Kofferraum {
	
	private String inhalt;
	
	public Kofferraum() {
		System.out.println("Kofferraum wird gebaut");
	}
	
	public void beladen(String ladung) {
		if(istVoll()) {
			System.out.println("Kofferraum ist voll");
			return; // Verlässt vorzeitig die Methode
		}
			
		System.out.println("Der Kofferraum wird mit " + ladung + " beladen.");
		inhalt = ladung;
	}
	
	public void entladen() {
		if(!istVoll()) {
			System.out.println("Kofferraum ist leer");
			return;
		}
		
		System.out.println("Der Kofferraum wird entladen");
		inhalt = null;
	}
	
	public boolean istVoll() {
		return inhalt != null;
	}

	@Override
	public String toString() {
		return "Kofferraum [inhalt=" + inhalt + "]";
	}
}
