package de.lubowiecki.vererbung3;

public class Flugente implements Landbar {

	@Override
	public void towerKommunikation() {
		System.out.println("Quack quack quack");
		
	}

	@Override
	public void schubVeringern() {
		System.out.println("Wird langsamer");
		
	}

	@Override
	public void fahrwerkAusfahren() {
		System.out.println("Quack quack quack... streckt Beine aus");
		
	}

	@Override
	public void landen() {
		System.out.println("Ist am Boden angekommen");
	}

	@Override
	public void landebahnVerlassen() {
		System.out.println("latscht von der Landebahn unter");
	}

	@Override
	public String identifizieren() {
		return "Ente";
	}

}
