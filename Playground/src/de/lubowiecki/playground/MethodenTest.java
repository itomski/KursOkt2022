package de.lubowiecki.playground;

public class MethodenTest {

	// Instanz Eigenschaft
	private int zahl = 10;
	
	// Klasseneigenschaften
	private static int andereZahl = 20;
	
	public static void main(String[] args) {
		
		double sum = add(10.5, 17.22);
		System.out.println("Erg: " + sum);
		
		//addNext(10.5, 17.22);
		
		MethodenTest mt = new MethodenTest();
		mt.otherAdd(10.5, 17.22); // ist ohne ein Objekt nicht 
		
	}
	
	// Methoden = Fähigkeiten
	
	// statische Methode / Klassenmethode 
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static void addNext(double a, double b) {
		System.out.println(a + b);
	}
	
	// Instanzmethode 
	public double otherAdd(double a, double b) {
		return a + b;
	}

}
