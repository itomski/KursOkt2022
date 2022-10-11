package de.lubowiecki.fahrzeuge;

public class Motor {
	
	private int geschwindigkeit;
	
	private boolean an;
	
	public Motor() {
		System.out.println("Motor wird gebaut");
	}
	
	public void start() {
		System.out.println("Motor wird gestartet");
		an = true;
	}
	
	public void stop() {
		System.out.println("Motor wird gestoppt");
		geschwindigkeit = 0;
		an = false;
	}

	public boolean istAn() {
		return an;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void beschleunigen(int kmh) {
		if(!istAn()) {
			System.out.println("Motor ist aus");
			return;
		}
		
		this.geschwindigkeit += kmh; // geschwindigkeit = geschwindigkeit + kmh
	}
	
	public void abbremsen(int kmh) {
		if(!istAn()) {
			System.out.println("Motor ist aus");
			return;
		}
		
		this.geschwindigkeit -= kmh; // geschwindigkeit = geschwindigkeit - kmh
	}

	@Override
	public String toString() {
		return "Motor [geschwindigkeit=" + geschwindigkeit + ", an=" + an + "]";
	}
}
