package de.lubowiecki.playground;

import java.lang.reflect.Field;

public class ScopeTest2 {
	
	public static void main(String[] args) {
		
		int i = 100;
		
		final int a = 20; // Compiletime-Konstante
		
		// Nicht erlaubt in switch
		final int b; // Runtime-Konstante
		b = 30;
		
//		switch(i) {
//		
//			case 10:
//				
//			case 20:
//				
//			case a + 10:
//				
//			case a + b:
//		
//		}
		
		
		//final boolean action = true; // Compiletime-Konstante: Compiler sieht den Wert
		
		final boolean action; // Runtime-Konstante:  Compiler sieht nur den Typ aber nicht den Wert
		action = true;
		
		//boolean action = true;
		
//		while(action) {
//		}
		
		System.out.println("Hallo");
		
		
		FahrzeugTyp typ = FahrzeugTyp.LUXUSWAGEN;
		
		switch(typ) {
		
			case SUV:
				break;
				
			case MITTELKLASSE:
				break;
		
		}
		
		
		System.out.println();

		int x = 10;
		
		if(x > 10) {
			System.out.println(">");
		}
		else if(x < 10) {
			System.out.println("<");
		}
		else {
			System.out.println("=");
		}
		
		
		
		String s = (x > 10) ? ">" : (x < 10) ? "<" : "=";
		System.out.println(s);
		
		
		System.out.println();
		
		// Reflection
		
		Object st = new Student(10, "Bruce", "Banner");
		
		for(Field f : st.getClass().getDeclaredFields()) {
			System.out.println(f.getType());
		}
		
		// Beziehungen
		// IS-A
		// HAS-A
		
		
	}
}

enum FahrzeugTyp {
	
	SUV, MITTELKLASSE, OBERKLASSE, KLEINWAGEN, LUXUSWAGEN, NUTZFAHRZEUG;
	
}

class Student {
	
	private int nr;
	private String firstname;
	private String lastname;
	
	public Student() {
	}
	
	public Student(int nr, String firstname, String lastname) {
		this.nr = nr;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void hi() {
		System.out.println("Hi, my name is " + firstname + " " + lastname);
	}
}

