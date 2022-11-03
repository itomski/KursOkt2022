package de.lubowiecki.collections;

import java.util.Objects;

public class Todo {
	
	private static int count;
	
	private int id;
	
	private String title;
	
	public Todo(String title) {
		id = ++count;
		this.title = title;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// this: Todo
		// obj: Object -> Person
		
		/* START: DIESER TEIL IST IMMER GLEICH */
		if (this == obj) // sind this und obj Referenzen auf das gleiche Objekt auf dem Heap?
			return true;
		
		if (obj == null) // ist obj ein null?
			return false;
		
		// getClass() ist das gleich wie this.getClass()
		if (getClass() != obj.getClass()) // sind this und obj Objekte der gleichen Klasse?
			return false;
		
		/* ENDE: DIESER TEIL IST IMMER GLEICH */
		
		Todo other = (Todo) obj; // Der Cast macht alle Todo-Eigenschaften von obj sichtbar 
		
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + "]";
	}
}
