package de.lubowiecki.playground;

public class InitTest {

	public static void main(String[] args) {
		
		//System.out.println(InitA.wert);
		//System.out.println(InitB.wert);
		
		// InitA a; // Reine Deklaration ohne Verwendung wird vom Kompiler entfernt 
		
		InitA a = new InitB();
//		
//		System.out.println();
		a = new InitB();
//		
//		System.out.println();
//		InitA a = new InitA();
		
		// public void run()
		Runnable aufgabe = () -> {
			for (int i = 0; i < 1_000_000; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		};
		
		aufgabe = () -> {
			for (int i = 0; i < 22; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		};
		
		// aufgabe ist eine Referenz auf eine Instanz einer Anonymenklasse die Runnable implementiert
		
		aufgabe.run(); // sequentielle Ausführung
		
		new Thread(aufgabe).start(); // parallele Ausführung
		new Thread(aufgabe).start();
		new Thread(aufgabe).start();
		new Thread(aufgabe).start();
		
		new Thread(() -> {
			for (int i = 0; i < 1_000; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		}).start();
		
		System.out.println();
		
		// ist eine dynamische/kurze Inplementierung des Interfaces
		Machbar m1 = (x, y) -> x + y;
		Machbar m2 = (x, y) -> x * y;
		Machbar m3 = (x, y) -> x / y;
		
		// Für Lambdas brauche ich ein SAM = single abstract method (FunctionalInterfaces)
		
		
		// Anonyme Klasse
		// Hier wird eine neue Klasse ohne Namen deklariert, die vom Interface Machbar abgeleitet ist
		// und diese Klasse wird sofort instanziert
		Machbar m4 = new Machbar() {

			@Override
			public int rechneZusammen(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}


interface Machbar {
	
	int rechneZusammen(int a, int b); // Methoden ohne body sind automatisch abstrakt
	
}

class KonkretMachbar implements Machbar {

	@Override
	public int rechneZusammen(int a, int b) {
		return a + b;
	}
}

