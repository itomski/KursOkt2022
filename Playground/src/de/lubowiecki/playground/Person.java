package de.lubowiecki.playground;

public class Person { // Pascal case
	
	private static int count; // Klasseneigenschaft
	
	private int id; // Instanzeigenschaft
	
	private String firstName; // Camel case
	
//	private String first_name; // Snake case
//	private final String FIRST_NAME; // Screaming snake case
	
	private String lastName;
	
	public Person() {
		id = ++count;
	}
	
//	public Person(int id) {
//		this.id = id;
//	}
	
	public Person(String firstName, String lastName) {
		this(); // Ruft den Parameterlosen Konstruktor auf
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person(int id, String firstName, String lastName) {
		this(firstName, lastName); // Ruft einen anderen Konstruktor auf
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
