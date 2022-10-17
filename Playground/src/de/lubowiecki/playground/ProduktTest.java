package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProduktTest {

	public static void main(String[] args) {
		
		Produkt p = new Produkt("Hammer", "Bla bla bla", 5);
		System.out.println(p.getName() + ", " + p.getGewicht() + "kg");
	}
}

class Produkt {
	
	private String name;
	private String beschreibung;
	private int gewicht;
	private List<String> bestandteile = new ArrayList<>(Arrays.asList("Eisen", "Holz", "Plastik"));

	public Produkt(String name, String beschreibung, int gewicht) {
		this.name = name;
		this.beschreibung = beschreibung;
		this.gewicht = gewicht;
	}

	@Override
	public String toString() {
		return name + ", " + beschreibung + ", " + gewicht + " kg, " + bestandteile;
	}

	public String getName() {
		return name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public int getGewicht() {
		return gewicht;
	}

	public List<String> getBestandteile() {
		return bestandteile;
	}
}
