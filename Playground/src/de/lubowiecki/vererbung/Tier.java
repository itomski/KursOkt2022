package de.lubowiecki.vererbung;

public class Tier {
	
	private String gattung;
	
	private int alter;
	
	public Tier() {
		// super(); // Kostruktor der Elternklasse (Object)
		System.out.println("Tier");
	}

	public String getGattung() {
		return gattung;
	}

	public void setGattung(String gattung) {
		this.gattung = gattung;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
}
