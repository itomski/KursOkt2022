package de.lubowiecki.workshop.dec21;

public class Powerbank {
	
	private final Action ACTION;
	
	public Powerbank(Action a) {
		ACTION = a;
	}
	
	public void load() {
		ACTION.execute();
	}

}
