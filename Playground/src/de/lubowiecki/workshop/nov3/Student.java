package de.lubowiecki.workshop.nov3;

public class Student {
	
	// Jeder Student braucht seinen persönlichen Vor- und Nachnamen
	private String firstName; // Instanzvariable
	
	private String lastName; // Instanzvariable
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void sagHallo() { // Muss Instanzmethode sein, weil Instanzvariablen verwendet werden
		System.out.println("Hi, mein Name ist " + firstName + " " + lastName);
	}
}
