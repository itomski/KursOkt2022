package de.lubowiecki.workshop.dez14;

public interface CryptoUnit {

	String BASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
	
	String encode(String str);
	
	String decode(String str);
	
}
