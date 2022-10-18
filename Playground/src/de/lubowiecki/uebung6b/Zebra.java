package de.lubowiecki.uebung6b;

public class Zebra implements Sozialisiert {

	@Override
	public void frisst() {
		System.out.println("Zebra frisst Salat");

	}

	@Override
	public void schlaeft() {
		System.out.println("Zebra schläft die ganze Nacht.");
	}

}
