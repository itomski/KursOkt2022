package de.lubowiecki.vererbung2;

public class Auto extends Fahrzeug {
	
	int baujahr = 2022; // geerbte Eigenschaft wird überlagert: hiding

	@Override
	public void bewegung() {
		System.out.println("Fährt auf der Straße, " + baujahr);
	}
	
	@Override
	public void setTyp(String typ) { // Überlagert die geerbte Methode
		if(typ != null && typ.length() > 0) {
			super.setTyp(typ); // geerbte Methode
		}
	}
}
