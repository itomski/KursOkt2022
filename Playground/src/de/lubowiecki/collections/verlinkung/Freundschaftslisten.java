package de.lubowiecki.collections.verlinkung;

public class Freundschaftslisten {

	public static void main(String[] args) {
		
		Person p1 = new  Person("Peter");
		
//		p1.setNext(new Person("Bruce"));
//		
//		p1.getNext().setNext(new Person("Natasha"));
//		
//		p1.getNext().getNext().setNext(new Person("Steve"));
//		
//		System.out.println(p1.getName());
//		System.out.println(p1.getNext().getName());
//		System.out.println(p1.getNext().getNext().getName());
//		System.out.println(p1.getNext().getNext().getNext().getName());
//		
//		System.out.println();
//		
//		Person p2 = p1.getNext().getNext().getNext(); // Steve
//		System.out.println(p2.getName());
//		System.out.println(p2.getPrev().getName());
//		System.out.println(p2.getPrev().getPrev().getName());
//		System.out.println(p2.getPrev().getPrev().getPrev().getName());
		
		
		Person p2 = new Person("Bruce");
		p2.addFreund(new Person("Tony"));
		p2.addFreund(new Person("Carol"));
		
		
		p1.addFreund(p2); // Peter bekommt Bruce als Freund
		p1.addFreund(new Person("Natasha"));
		p1.addFreund(new Person("Steve"));
		
		System.out.println();
		
		for(Person freund : p1.getFreunde()) {
			System.out.println(freund.getName());
			for(Person subFreund : freund.getFreunde()) {
				System.out.println("\t" + subFreund.getName());
			}
		}
		
		
		System.out.println();
		p2 = p1;
		p1 = new Person("Peterson");
		
		for(Person freund : p2.getFreunde()) {
			System.out.println(freund.getName());
			for(Person subFreund : freund.getFreunde()) {
				System.out.println("\t" + subFreund.getName());
			}
		}
		
		p2 = null;
		
		System.out.println("-------------------");
		
		Person p3 = new Person("Tony");
		p3 = new Person("Luc");
	}
}
