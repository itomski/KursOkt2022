package de.lubowiecki.workshop.dec21;

public class LadeAktion implements Action {

	private int maxCharge = 40;
	
	private int charged;
	
	@Override
	public void execute() {
		
		if(charged >= maxCharge) {
			System.out.println("Ladung nicht nötig");
			return;
		}
		
		charged += 10;
		System.out.println("Wurde geladen. Stand ist " + charged);
	}
}
