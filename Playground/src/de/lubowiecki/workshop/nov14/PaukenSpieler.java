package de.lubowiecki.workshop.nov14;

// Eine Klasse geht einen Vertrag ein, wenn sie ein Interface implementiert
public class PaukenSpieler implements Musiker {

	@Override
	public void musiziere() {
		System.out.println("Haut in die Kesseln");
	}	
}
