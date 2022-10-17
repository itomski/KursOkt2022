package de.lubowiecki.vererbung3;

public class LambdaTest {
	
	public static void main(String[] args) {
		
		Aufgabe a = new Aufgabe();
		a.doSomething();
		
		// Lambdas sind implementirungen der EINEN abstakten Methode des Interfaces
		Machbar m = () -> System.out.println("Mach was"); // Dynamische Implementierung der abstrakten Methode
		m.doSomething();
		
		m = () -> System.out.println("Dies und das");
		m.doSomething();
	}
}

class Aufgabe implements Machbar {

	@Override
	public void doSomething() {
		System.out.println("Mach was");
	}
}
