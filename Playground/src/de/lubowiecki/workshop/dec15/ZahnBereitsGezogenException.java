package de.lubowiecki.workshop.dec15;

public class ZahnBereitsGezogenException extends Exception {

	public ZahnBereitsGezogenException() {
		super("Zahn ist bereits gezogen...");
	}
	
}
