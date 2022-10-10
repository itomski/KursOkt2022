package de.lubowiecki.playground;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setFirstName("Peter");
		p1.setLastName("Parker");
		
		System.out.println(p1.getId() + ", " + p1.getFirstName() + " " + p1.getLastName());
		
		Person p2 = new Person();
		p2.setFirstName("Bruce");
		p2.setLastName("Banner");
		
		System.out.println(p2.getId() + ", " + p2.getFirstName() + " " + p2.getLastName());
		
		Person p3 = new Person();
		p3.setFirstName("Carol");
		p3.setLastName("Danvers");
		
		System.out.println(p3.getId() + ", " + p3.getFirstName() + " " + p3.getLastName());
		
	}

}
