package de.lubowiecki.workshop.nov14;

public class KlavierSpieler implements Musiker {

	private String name;
	private String klavier;
	
	public KlavierSpieler(String name, String klavier) {
		this.name = name;
		this.klavier = klavier;
	}
	
	// Muss die Methode überschreiben und definieren WIE musiziert wird
	@Override
	public void musiziere() {
		System.out.println(name + " haut in die Tasten auf einem " + klavier);
	}	
}
