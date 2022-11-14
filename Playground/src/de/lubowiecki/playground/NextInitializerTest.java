package de.lubowiecki.playground;

public class NextInitializerTest {

	// Wird ausgeführt sobald die Klasse geladen wird
	// Wird nur 1x ausgeführt
	static { // statischer Initializer
		System.out.println("static init");
		// ExceptionInInitializerError: es gibt keine Möglichkeit der Behandlung
//		int[] arr = {1,2,3,4};
//		System.out.println(arr[10]);
	}
	
	// Wird vor dem Konstruktor ausgeführt
	{ // instanz Initializer
		System.out.println("init");
		// ArrayIndexOutOfBoundsException: kann bei der Instanzierung behandelt werden
//		int[] arr = {1,2,3,4};
//		System.out.println(arr[10]);
	}
	
	public static void main(String[] args) {
		
		// Instanz der Klasse
		NextInitializerTest obj = null;
		try {
			obj = new NextInitializerTest();
			obj = new NextInitializerTest();
			obj = new NextInitializerTest();
			obj = new NextInitializerTest();
		}
		catch(Exception e) {
			System.out.println("Problem bei der Instanzierung");
		}
		
		// Eine Instanz der Klasse als Objekt
		System.out.println(obj);
		
		// Ein Objekt welches die Definition der Klasse beschreibt
		System.out.println(obj.getClass()); // Reflection
		
		
	}
}
