package de.lubowiecki.playground;

public class InitA {
	
	public static int wert = 10;
	
	static {
		System.out.println("InitA: static init");
	}
	
	{
		System.out.println("InitA: init");
	}
	
	public InitA() {
		System.out.println("InitA: const");
	}
}
