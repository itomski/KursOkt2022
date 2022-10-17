package de.lubowiecki.vererbung3;

public class ImperialerKreuzer implements Flugobjekt {

	@Override
	public void schubErhoehen() {
		System.out.println(identifizieren() + ": Schub wird auf halbe Kraft erhöht");
	}

	@Override
	public void fahrwerkEinfahren() {
		System.out.println(identifizieren() + ": Wir haben kein Fahrwerk...");
		
	}

	@Override
	public void starten() {
		System.out.println(identifizieren() + ": Auf in fremde Galaxien");
	}

	@Override
	public void landebahnBefahren() {
		System.out.println(identifizieren() + ": Auf der Bahn positionieren");
		
	}

	@Override
	public void towerKommunikation() {
		System.out.println(identifizieren() + ": Brauchen wir nicht... wir können machen, was wir wollen");
	}

	@Override
	public void schubVeringern() {
		System.out.println(identifizieren() + ": Schub wird auf halbe Kraft verringert");
		
	}

	@Override
	public void fahrwerkAusfahren() {
		System.out.println(identifizieren() + ": Kein Fahrwerk vorhanden");
		
	}

	@Override
	public void landen() {
		System.out.println(identifizieren() + ": landet");
		
	}

	@Override
	public void landebahnVerlassen() {
		System.out.println(identifizieren() + ": Nö. Das machen wir nicht...");
		
	}

	@Override
	public String identifizieren() {
		return "Imperialer Kreuzer, Nr 123";
	}

}
