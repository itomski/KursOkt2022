package de.lubowiecki.enums;

public enum EnumSingleton {
	
	INSTANCE;
	
	private int zahl;
	
	private EnumSingleton() {
		zahl = 100;
	}
	
	public int getZahl() {
		return zahl;
	}
}
