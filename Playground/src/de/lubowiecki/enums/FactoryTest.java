package de.lubowiecki.enums;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		FahrzeugFactory vw = new FahrzeugFactory(Marke.VW, Typ.KLEINWAGEN, Farbe.WEISS);
		Fahrzeug f = vw.create();
		
		
	}

}
