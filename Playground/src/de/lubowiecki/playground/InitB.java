package de.lubowiecki.playground;

public class InitB extends InitA {
	
	public static int wert = 20;
	
	static {
		System.out.println("InitB: static init");
	}
	
	{
		System.out.println("InitB: init");
	}
	
	public InitB() {
		System.out.println("InitB: const");
	}
}
