package de.lubowiecki.patterns.composite;

public abstract class AbstractGeoElement implements Element {

	private int x;
	
	private int y;
	
	// Abstrakte Klassen können auch Konstrukltoren habe
	// dies dürfen aber nur von erbenden Klassen benutzt werden
	public AbstractGeoElement(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
