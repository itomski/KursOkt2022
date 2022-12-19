package de.lubowiecki.enums;

public enum Farbe {

	ROT("#ff0000"), GRUEN("#00ff00"), BLAU("#0000ff"), SCHWARZ("#000000"), WEISS("#ffffff");
	
	private final String code;
	
	private Farbe(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return code;
	}
}
