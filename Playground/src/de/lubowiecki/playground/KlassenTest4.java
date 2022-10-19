package de.lubowiecki.playground;

public class KlassenTest4 {

	public static void main(String[] args) {
		
		// id, vorname, nachname, email
		
		int id = 10;
		String vorname = "Peter";
		String nachname = "Parker";
		String email = "p.parker@shield.org";
		
		System.out.println();
		
		String[] person = new String[4];
		person[0] = "10";
		person[1] = "Peter";
		person[2] = "Parker";
		person[3] = "p.parker@shield.org";
		
		System.out.println();
		
		// Klasse ist ein selbst definierter neuer Datentyp
		Person2 p = new Person2(10, "Peter", "Parker", "p.parker@shield.org");
		Person2 p2 = new Person2(11, "Bruce", "Banner", "b.banner@shield.org");		
	}

}

class Person2 {
	
	int id;
	String vorname;
	String nachname;
	String email;
	
	public Person2(int id, String vorname, String nachname, String email) {
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
	}
}
