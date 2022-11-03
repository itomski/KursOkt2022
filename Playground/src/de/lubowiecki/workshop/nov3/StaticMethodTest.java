package de.lubowiecki.workshop.nov3;

public class StaticMethodTest {
	
	public static void main(String[] args) {
		
		System.out.println(Abc.zahl); // Was steht als zahl in der Klasse?
		
		Abc a = new Abc();
		System.out.println(a.andereZahl); // Was steht als andereZahl im Objekt?
		
		// zahl ist statisch... daher
		System.out.println(a.zahl); // Was steht als zahl in der Klasse?
		
		System.out.println();
		
		Abc b = new Abc();
		System.out.println(b.andereZahl); // Was steht als andereZahl im Objekt?
		
		// zahl ist statisch... daher
		System.out.println(b.zahl); // Was steht als zahl in der Klasse?
		
		
		System.out.println();
		a.andereZahl = 50;
		System.out.println("a andereZahl: " + a.andereZahl);
		System.out.println("b andereZahl: " + b.andereZahl);
		// Änderung am a hat keine Auswirkungen auf b
		
		System.out.println();
		a.zahl = 50; // Ändert in Wirklichkeit zahl in der Klasse
		System.out.println("a zahl: " + a.zahl); // Zeigt zahl aus der Klasse, da zahl statisch
		System.out.println("b zahl: " + b.zahl); // Zeigt zahl aus der Klasse, da zahl statisch
		System.out.println("Abc zahl: " + Abc.zahl); // Zeigt zahl aus der Klasse, da zahl statisch
		// Änderung am zahl über a, ändert den Wert der Klasse für alle Abc Objekte
			
		System.out.println("Fläche: " + Abc.flaecheKreis(10));
		
		Kreis k1 = new Kreis(10.0);
		System.out.println(k1.flaeche());
		
		Kreis k2 = new Kreis(15.7);
		System.out.println(k2.flaeche());
		
		// Statische Methoden berücksichtigen nicht den Zustand des Objektes
		// Sie sehen nur statische Variablen (Klassenvariablen) und können werte von außen entgegennehmen
		
		// Instanzmethoden zaben vollen Zugriff auf Instanz- und Klassenvariablen
		// Sie berücksichtigen den Zusatnd des Objektes und können ihn ändern
		
		// Für die Nutzung von statischen Mehoden brauchen keine Objekte instanziert zu werden
		
		// Für die Nutzung von Instanz-Mehoden MÜSSEN Objekte instanziert werden
		
		// Verwendet eine Methode nur Klassenvariablen oder bekommt nötige Parameter von außen
		// ist es ein guter Kandidat für eine statische Methode
		
	}
}

class Abc {
	
	public static final double PI = 3.14;
	public static int zahl;
	
	public int andereZahl;
	
	// Zustand des Objektes (Instanzeigenschaften) wird nicht berücksichtigt - kann es eine statische Methode sein
	public static double flaecheKreis(int r) { // r ist ein Wert, der bei Verwendung der Methode vorgegeben wird
		return PI * Math.pow(r, 2); 
	}
	
	// Zustand des Objektes (Instanzeigenschaften) wird nicht berücksichtigt - kann es eine statische Methode sein
	public static double add(double a, double b) { 
		return a + b;
	}
}

class Kreis {
	
	public static final double PI = 3.14; // Klassenvariable
	public double radius; // Instanzvariable
	
	public Kreis(double radius) {
		this.radius = radius;
	}
	
	// Statische Methoden haben keinen Zugriff auf Instanzvariablen
	public double flaeche() {
		return PI * Math.pow(radius, 2);
	}
	
}
