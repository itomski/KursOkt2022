package de.lubowiecki.vererbung.interfaces.game;

// Abstrakte Klassen brauchen ein Interface nicht komplett zu erfüllen
public abstract class AbstractUnit implements Unit {

	private int posX;
	
	private int posY;
	
	@Override
	public void moveTo(int x, int y) {
		posX = x;
		posY = y;
	}
	
}
