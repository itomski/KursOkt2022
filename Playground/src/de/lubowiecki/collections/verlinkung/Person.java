package de.lubowiecki.collections.verlinkung;

import java.util.HashSet;
import java.util.Set;

public class Person {

	private String name;
	
//	private Person next;
//	
//	private Person prev;
	
	private Set<Person> freunde = new HashSet<>();
	

	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

//	public Person getNext() {
//		return next;
//	}
//
//	public void setNext(Person next) {
//		this.next = next;
//		next.setPrev(this);
//	}
//
//	public Person getPrev() {
//		return prev;
//	}
//
//	public void setPrev(Person prev) {
//		this.prev = prev;
//	}
	
	public void addFreund(Person p) {
		freunde.add(p);
		
		if(!p.getFreunde().contains(this)) // Nur hinzufügen, wenn noch nicht vorhanden
			p.addFreund(this);
	}
	
	public Set<Person> getFreunde() {
		return freunde;
	}
	
}
