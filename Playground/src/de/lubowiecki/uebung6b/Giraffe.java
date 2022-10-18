package de.lubowiecki.uebung6b;

public class Giraffe implements Sozialisiert {

	@Override
	public void frisst() {
		System.out.println("Giraffe frisst Blätter");
	}

	@Override
	public void schlaeft() {
		System.out.println("Giraffe schläft im Stehen");
		
	}
}
