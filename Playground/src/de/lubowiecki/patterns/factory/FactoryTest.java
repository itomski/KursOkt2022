package de.lubowiecki.patterns.factory;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		FahrzeugFactory factory = new FahrzeugFactory();
		
		Fahrzeug f1 = factory.createGolf("blau", Antrieb.DIESEL);
		System.out.println(f1);
		
		Fahrzeug f2 = factory.createGolf("grau", Antrieb.ELEKTRO);
		System.out.println(f2);
		
		
		
	}
}
