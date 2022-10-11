package de.lubowiecki.fahrzeuge;

public class Auto {
	
	// HAS-A
	private Motor motor = new Motor();
	
	private Kofferraum kofferraum = new Kofferraum();
	
	public Auto() {
		System.out.println("Fahrzeug wird gebaut");
	}
	
	public void start() {
		motor.start();
	}
	
	public void stop() {
		motor.stop();
	}
	
	public void beladen(String ladung) {
		kofferraum.beladen(ladung);
	}
	
	public void entladen() {
		kofferraum.entladen();
	}

	@Override
	public String toString() {
		return "Auto [motor=" + motor + ", kofferraum=" + kofferraum + "]";
	}

	public void abbremsen(int kmh) {
		motor.abbremsen(kmh);
	}

	public void beschleunigen(int kmh) {
		motor.beschleunigen(kmh);
	}
}