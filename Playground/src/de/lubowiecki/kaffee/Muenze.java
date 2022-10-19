package de.lubowiecki.kaffee;

public class Muenze {
	
	private final double WERT;
	
	private Muenze(double wert) {
		WERT = wert;
	}
	
	// Fabrik-Methoden
	
	public static Muenze get2Eur() {
		return new Muenze(2);
	}
	
	public static Muenze get1Eur() {
		return new Muenze(1);
	}
	
	public static Muenze get50Cent() {
		return new Muenze(0.5);
	}
	
	public static Muenze get20Cent() {
		return new Muenze(0.2);
	}
	
	public static Muenze get10Cent() {
		return new Muenze(0.1);
	}

	public double getWert() {
		return WERT;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f €", WERT);
	}
}
