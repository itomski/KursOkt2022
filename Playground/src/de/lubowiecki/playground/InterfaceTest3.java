package de.lubowiecki.playground;

public class InterfaceTest3 {

	public static void main(String[] args) {
		
		// Statische Methoden und Eigenschaften werden auf dem Referenztyp (links) ausgeführt
		// Instanzmethoden werden auf dem Objekttyp (rechts)
		
		Movable f1 = new Fahrzeug();
		f1 = new NextFlugzeug();
		f1.move();
		f1.moveFast();
		
		// Statische Methoden der Interfaces müssen IMMER über das Interface aufgerufen werden
		Movable.moveTo();
		

	}

}

interface Movable {
	
	// automatisch public static final
	int zahl = 10;
	
	static void moveTo() {
		System.out.println("MoveTo: Movable");
	}
	
	default void moveFast() {
		System.out.println("MoveFast: Movable");
	}
	
	void move();
}

class Fahrzeug implements Movable {

	@Override
	public void move() {
		System.out.println("Move: Fahrzeug");
		
	}
	
	// MoveFast kann, muss aber nicht überschrieben werden
	// Wenn nicht, wird die Default-Implementierung aus dem Interface benutzt
	
}

class NextFlugzeug implements Movable {

	@Override
	public void move() {
		System.out.println("Move: NextFlugzeug");
		
	}
	
	@Override
	public void moveFast() {
		System.out.println("MoveFast: NextFlugzeug");
	}
}