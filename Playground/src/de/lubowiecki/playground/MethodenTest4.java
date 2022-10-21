package de.lubowiecki.playground;

public class MethodenTest4 {

	// Einstiegspunkt bei Ausführung der Code
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		int erg = add(x, y);
		erg = add(40, 30);
		erg = add(70, 22);
	}
	
	public static int add(int a, int b) {
		return a + b;
	}

}
