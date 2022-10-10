package de.lubowiecki.uebung1;

public class ProtokollRechner {
	
	private String protokoll = "";

	public double add(double a, double b) {
		double sum = a + b;
		addToProtokoll(a, b, sum, "+");
		return sum;
	}
	
	public double sub(double a, double b) {
		double sum = a - b;
		addToProtokoll(a, b, sum, "-");
		return sum;
	}
	
	public double multi(double a, double b) {
		double sum = a * b;
		addToProtokoll(a, b, sum, "*");
		return sum;
	}
	
	public double div(double a, double b) {
		double sum = a / b;
		addToProtokoll(a, b, sum, "/");
		return sum;
	}
	
	private void addToProtokoll(double a, double b, double sum, String op) {
		protokoll += String.format("%f %s %f = %f%n", a, op, b, sum);
	}
	
	public String getProtokoll() {
		return protokoll;
	}
	
}
