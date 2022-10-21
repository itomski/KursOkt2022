package de.lubowiecki.playground;

import java.time.LocalTime;

public class InitializerTest {

	public final static int ZAHL; // Klassenvariable
	
	public int andereZahl; // Instanzvariable
	
	static { // Statische Initializer
		System.out.println("Statische Initializer");
		
		if(LocalTime.now().isAfter(LocalTime.of(16, 0))) {
			ZAHL = 10;
		}
		else {
			ZAHL = 20;
		}
	}
	
	{ // Instanz Initializer
		System.out.println("Instanz Initializer");
	}
	
	public InitializerTest() { // Konstruktor
		System.out.println("Konstruktor");
	}
	
	public InitializerTest(int i) { // Konstruktor
		System.out.println("Konstruktor");
	}
	
	public static void main(String[] args) {
		
		new InitializerTest(10);
		// ab hier steht das obige Objekt für GC
		
		System.out.println();
		InitializerTest it = new InitializerTest();

	}
}
