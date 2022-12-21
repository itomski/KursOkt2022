package de.lubowiecki.threads;

public class LoopHund {

	private int strecke;
	
	private String name;
	
	private int curPos = 0;
	
	private boolean amZiel = false;
	
	public LoopHund(String name, int strecke) {
		this.name = name;
		this.strecke = strecke;
	}
	
	public void move() {
		
		if(amZiel) return; // Verlässt vorzeitig die Methode
		
		if(curPos < strecke) {
			curPos += DiceUtil.roll(Dice.W10);
			System.out.println(name + ": " + curPos);
			return;
		} 
		
		System.out.println(name + ": Ziel erreicht!");
		amZiel = true;
	}
}
