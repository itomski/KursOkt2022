package de.lubowiecki.playground;

public class GleichheitTest {

	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1 == o2); // Ist es das gleiche Objekt auf dem Heap?
		System.out.println(o1.equals(o2)); // Haben sie den gleichen Inhalt?
		// equals in Object vergleicht Objekt-Gleichheit auf dem Heap 
		
		System.out.println();
		
		Mitarbeiter m1 = new Mitarbeiter("Peter");
		Mitarbeiter m2 = new Mitarbeiter("Peter");
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		
		// Möchte man den Inhalt von Objekt vergleichen, muss man zuerst die equals-Methode überschreiben

		System.out.println();
		
		String s1 = new String("Hi");
		String s2 = new String("Hi");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); // equals ist in String bereits überschrieben und vergleicht den Inhalt
		
		s1 = s1.toLowerCase(); // Methoden von String produzieren bei Manipulationen IMMER einen neuen String
		
		System.out.println();
		
		s1 = "Hi";
		s2 = "Hi";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}
}

class Mitarbeiter {
	
	private String name;

	public Mitarbeiter(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object other) {
		if(this == other)
			return true;
		
		if(other == null)
			return false;
		
		if(other instanceof Mitarbeiter) {
			Mitarbeiter otherMitarbeiter = (Mitarbeiter) other;
			return this.name.equals(otherMitarbeiter.name);
		}
		
		return false;
	}
}
