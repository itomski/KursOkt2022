package de.lubowiecki.vererbung3;

public class A380 implements Flugobjekt {

	private boolean fahrwerkAusgefahren;
	
	private int schub = 0;
	
	
	@Override
	public void towerKommunikation() {
		System.out.println(identifizieren() + ": kommuniziert mit dem Tower");
	}

	@Override
	public void schubVeringern() {
		schub -= 50;
		System.out.println(identifizieren() + ": verringert den Schub = " + schub + "%");
		
	}

	@Override
	public void fahrwerkAusfahren() {
		fahrwerkAusgefahren = true;
		System.out.println(identifizieren() + ": fährt Fahrwerk aus.");
		
	}

	@Override
	public void landen() {
		System.out.println(identifizieren() + ": landet.");
		
	}

	@Override
	public void landebahnVerlassen() {
		System.out.println(identifizieren() + ": verlässt die Landebahn.");
	}

	@Override
	public String identifizieren() {
		return "A380, Serien-Nr. 12345";
	}

	@Override
	public void schubErhoehen() {
		schub += 50;
		System.out.println(identifizieren() + ": erhöht den Schub = " + schub + "%");
	}

	@Override
	public void fahrwerkEinfahren() {
		fahrwerkAusgefahren = false;
		System.out.println(identifizieren() + ": fährt Fahrwerk ein.");
		
	}

	@Override
	public void starten() {
		System.out.println(identifizieren() + ": startet.");
	}

	@Override
	public void landebahnBefahren() {
		System.out.println(identifizieren() + ": positioniert sich auf der Landebahn.");
		
	}
}
