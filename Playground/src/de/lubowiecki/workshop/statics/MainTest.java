package de.lubowiecki.workshop.statics;

public class MainTest {
	
	// Wird automatisch durch die JVM verwendet
	// Zum Starten wird kein neues Objekt von MainTest erzeugt
	// sondern die Main-Methode wie folgt aufgerufen MainTest.main(args)
	
	// Statische Methoden und Eigenschaften brauchen für die Verfügbarkeit kein Objekt, lediglich eine Klasse
	public static void main(String[] args) {
		
		// Statische Methoden werden über die Klasse verwendet
		MainTest.machWas();
		
		// Instanz-Methoden brauchen erstmal ein Objekt
		MainTest mt1 = new MainTest(); // Objekt wird erzeugt
		mt1.machWasAnderes(); // aufruf der Instanzmethode
		
		MainTest mt2 = new MainTest();
		mt2.machWasAnderes();
		
		// Instanzmethoden werden auf dem Objekt auf dem Heap ausgeführt
		
		// Statische Variablen teilen sich alle Obejkte gleiche Klasse gemeinsam
		// Instanzvariablen hat jedes Objekt exclusiv für sich
		
		
	}
	
	public static void machWas() {
		// Statische Mehoden haben kein this
		// this ist eine Referenz auf ein Objekt
		// Static heißt Bauplan ist verfügbar, aber nicht das Objekt
		System.out.println("Static Methode");
		//System.out.println("Static Methode" + this.hashCode()); // Error: this nicht verfügbar
	}
	
	public void machWasAnderes() {
		System.out.println("Instanz Methode: " + this.hashCode());
	}
}
