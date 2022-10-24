package de.lubowiecki.staubsauger;

public class Staubsauger {
	
	private Beutel beutel = new Beutel(100);
	
	public void saugen(int dreck) throws BeutelVollException {
		if(!beutel.fuellen(dreck)) {
			throw new BeutelVollException();
		}
	}

	public int getBeutelInhalt() {
		return beutel.getDreckImBeutel();
	}
}
