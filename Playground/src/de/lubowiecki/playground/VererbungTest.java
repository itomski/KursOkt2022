package de.lubowiecki.playground;

import java.util.Arrays;

public class VererbungTest {
	
	// Klassenvariable
	static final int zahl;
	
	// Instanzvariable
	final int zahl2;
	
	static { // Classinitializer
		zahl = 10;
	}
	
	{ // Instanzeinitializer, wird vor dem Konstruktor ausgeführt
		zahl2 = 20;
	}
	
	public static void main(String[] args) {
		
		Apfel a = new Apfel();
		Obst o = a; // Apfel IS-A Obst
		
		Birne b = new Birne();
		o = b; // Birne IS-A Obst
		
		System.out.println(o instanceof Obst); // true
		System.out.println(o instanceof Apfel); // false
		
		if(o instanceof Birne)
			b = (Birne)o;
		
		if(o instanceof Apfel)
			a = (Apfel)o; // Für Kompiler ok, aber ClassCastException zur Laufzeit, da Birne
		
	}
}

class Obst {
	
	String getName() {
		return "Obst";
	}
	
}

class Apfel extends Obst {
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}

class Birne extends Obst {
	
	public String getName(String lang) { // Überladen
		return "Birne";
	}
	
}
