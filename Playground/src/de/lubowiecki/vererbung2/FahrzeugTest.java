package de.lubowiecki.vererbung2;

public class FahrzeugTest {

	public static void main(String[] args) {
		
		// Statische Methoden und (static und instanz) Eigenschaften werden auf dem Refernztyp ausgeführt
		// Instanzmethoden werden auf dem Objekttyp ausgeführt
		
		// Referenztyp: Fahrzeug
		// Objekttyp: Auto
		
		Fahrzeug f1 = new Auto();
		f1.setMarke("VW");
		f1.setTyp("Golf");
		f1.bewegung();
		
		System.out.println();
		
		f1 = new Flugzeug();
		f1.setMarke("AIRBUS");
		f1.setTyp("A370");
		//f1.bewegung();
		
		run(f1);
		run(new Auto());
		//run(new Object()); // Error: Object hat keine IS-A Beziehung zu Fahrzeug
		run(new Flugzeug());
		
		run(new Fahrzeug() { // Anonyme Klasse
			@Override
			public void bewegung() {
				System.out.println("Machr irgendwas...");
				
			}
		});
		
		// Polymorphie: Ein gemeinsamer Referenztyp aber unterschidlisches Verhalten hinter den Instanz-Methoden.
		
		System.out.println();
		
		// Es gibt keine Polymorphie für Eigenschaften
		System.out.println(f1.baujahr); // Verwendet die Eigenschaft direkt aus Fahrzeug
		
		Auto a = new Auto();
		System.out.println(a.baujahr);
		
		System.out.println();
		
		// Eine Methode verwendet Eigenschaften der Klassen, aus der sie verwendet wird
		f1 = a;
		f1.bewegung();
		a.bewegung();
		
	}
	
	public static void run(Fahrzeug f) {
		f.bewegung();
	}

}
