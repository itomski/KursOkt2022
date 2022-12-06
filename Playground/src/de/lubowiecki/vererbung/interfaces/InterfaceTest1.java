package de.lubowiecki.vererbung.interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest1 {

	public static void main(String[] args) {
		
		Person p = new Person("Carol", "Banner");
		p.sagHallo();

		// Interfaces sind nicht dazu gedacht konkrete Methoden zu vererben - dazu benutz man konkrete oder abstakte Klassen
		
		// Interfaces vererben Möglichkeiten
		
		Kommunikativ k = new Person("Carol", "Danvers");
		k.sagHallo();
		
		k = new Hund("Watson"); // Hund implementiert Kommunikativ
		k.sagHallo();
		
		Hund h = new Hund("Stanley"); 
		// h = new Person();
		h.sagHallo();
		
		// Liste kann nur Personen aufnehmen
		List<Person> liste = new ArrayList<>();
		liste.add(new Person("Peter", "Parker"));
		// liste.add(new Hund()); // Hund ist nicht Person
		for(Person x : liste) {
			x.sagHallo();
			// Bietet alle Methoden von Person an
			x.getVorname(); // ist in Person enthalten
		}
		
		
		System.out.println();
		
		List<Kommunikativ> liste2 = new ArrayList<>();
		liste2.add(new Person("Bruce", "Banner")); // Person ist Kommunikativ
		liste2.add(new Hund("Marcie")); // Hund ist Kommunikativ
		liste2.add(new Roboter()); // Roboter ist Kommunikativ
		
		// Konzentriert sich auf die Gemeinsamkeit - Methoden von Kommunikativ
		for(Kommunikativ x : liste2) {
			x.sagHallo();
			// x.getVorname(); // Error. Methode ist nicht in Kommunikativ vorhanden
		}
		
		System.out.println();
		
		List<Bewegbar> liste3 = new ArrayList<>();
		//liste3.add(new Person("Bruce", "Banner")); // Error. Person ist NICHT Bewegbar
		liste3.add(new Hund("Marcie")); // Hund ist Bewegbar
		//liste3.add(new Roboter()); // Error. Roboter ist NICHT Bewegbar
		
		for(Bewegbar x : liste3) {
			x.bewegeAnPos(10, 20);
		}
	}
}

// Wird ein Interface implementiert muss die Klasse alle abstrakten Methoden anbieten
class Person implements Kommunikativ {
	
	private String vorname;
	
	private String nachname;
	
	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	// muss public sein, da die Methode im Interface public ist
	public void sagHallo() {
		System.out.println(vorname + " " + nachname + ": Hallo!");
	}
}

// Es müssen alle Methoden der Interfaces eingebaut werden
class Hund implements Kommunikativ, Bewegbar {
	
	private String name;
	
	public Hund(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// muss public sein, da die Methode im Interface public ist
	public void sagHallo() {
		System.out.println(name + ": Wau Wau...");
	}

	@Override
	public void bewegeAnPos(int x, int y) {
		System.out.println("läuft an Position x " + x + " und y " + y);
	}
}

class Roboter implements Kommunikativ {
	
	private static int nr = 0;
	
	private String seriennummer;
	
	public Roboter() {
		seriennummer = "R" + ++nr;
	}
	
	public String getSeriennummer() {
		return seriennummer;
	}

	public void setSeriennummer(String seriennummer) {
		this.seriennummer = seriennummer;
	}

	public void sagHallo() {
		System.out.println(seriennummer + ": Biep... biep... biep...");
	}
}

interface Kommunikativ {
	
	// Alle Eigenschaften sind public static final
	String wert = "...";
	
	// Beschreibung, welche Methode notwendig ist, aber nicht wie sie genau eingebaut wird
	// automatisch public
	void sagHallo(); // abstrakte Methode: kein Body
}

interface Bewegbar {
	
	void bewegeAnPos(int x, int y); // abstrakte Methode: kein Body
}
