package de.lubowiecki.staubsauger;

public class Beutel {
	
	private final int MAX_MENGE;
	
	private int dreckImBeutel;
	
	public Beutel(int maxFuellMenge) {
		MAX_MENGE = maxFuellMenge;
	}
	
	public boolean fuellen(int dreck) {
		
		if(dreckImBeutel + dreck > MAX_MENGE) {
			dreckImBeutel = MAX_MENGE;
			return false;
		}
			
		dreckImBeutel += dreck;
		return true;
	}

	public int getDreckImBeutel() {
		return dreckImBeutel;
	}

}
