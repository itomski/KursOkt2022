package de.lubowiecki.workshop.nov14;

public class GeigenSpieler implements Musiker {

	private String vorname;
	private String nachname;
	
	
	public GeigenSpieler(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	@Override
	public void musiziere() {
		System.out.println(vorname.charAt(0) + ". " + nachname + " spielt Geige.");
	}
}
