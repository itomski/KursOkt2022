package de.lubowiecki.vererbung.basics;

// Student erbt von Mensch
// Mensch ist die Elernklasse
// Student ist die Kindklasse
public class Student extends Mensch {
	
	// machEtwas wird von Mensch geerbt und für Sudenten angepasst
	// Es wird nur das überschrieben, was im Studenten anderes als im Mensch funktionieren soll
	@Override
	public void machEtwas() {
		System.out.println("Student geht zur Vorlesung");
	}

}
