package de.lubowiecki.patterns.builder;

public class BuilderTest {

	public static void main(String[] args) {
		
		Fahrzeug f1 = new Fahrzeug("VW", "Golf", "HH-AB123", "silber");
		Fahrzeug f2 = new Fahrzeug("VW", "Golf", "HH-AB124", "silber");
		Fahrzeug f3 = new Fahrzeug("VW", "Golf", "HB-AB125", "silber");
		
		FahrzeugBuilder builder = new FahrzeugBuilder();
		builder.setMarke("VW").setTyp("Golf").setFarbe("gelb");
		
		Fahrzeug f4 = builder.setKenzeichen("HB-AB125").build();
		Fahrzeug f5 = builder.setKenzeichen("HB-AB126").build();
		Fahrzeug f6 = builder.setKenzeichen("HB-AB127").build();
		Fahrzeug f7 = builder.setKenzeichen("HB-AB128").build();
		Fahrzeug f8 = builder.setKenzeichen("HB-AB129").build();
		

	}
}
