package de.lubowiecki.threads;

import java.util.Random;

// Entweder implementiert der Hund Runnable und wird an einen Thread zur Ausführung gegeben
// Oder er erweitert die Klasse Thread und überschreibt die run Methode, danach kann er direkt gestartet werden
public class Hund implements Runnable {

	private int strecke;
	
	private String name;
	
	public Hund(String name, int strecke) {
		this.name = name;
		this.strecke = strecke;
	}
	
	@Override
	public void run() {
		
		int pos = 0;
		
		while(pos < strecke) {
			pos += DiceUtil.roll(Dice.W10);
			System.out.println(name + ": " + pos);
			
			try {
				Thread.sleep(100);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + ": Ziel erreicht!");
	}
}
