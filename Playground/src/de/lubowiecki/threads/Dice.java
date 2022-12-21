package de.lubowiecki.threads;

public enum Dice {
	
	W6(6), W10(10), W20(20), W100(100);
	
	private int pips; 
	
	private Dice(int pips) {
		this.pips = pips;
	}

	public int getPips() {
		return pips;
	}
}
