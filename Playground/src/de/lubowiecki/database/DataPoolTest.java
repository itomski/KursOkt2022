package de.lubowiecki.database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.lubowiecki.playground.Person;

public class DataPoolTest {
	
	public static void main(String[] args) {
		
		DataPool<Person> personen = new DataPool<>();
		personen.add(new Person("Peter", "Parker"), new Person("Bruce", "Banner"), new Person("Carol", "Danvers"));
		System.out.println(personen.getAll());
		
		System.out.println();
		
		DataPool<String> namen = new DataPool<>();
		namen.add("Peter", "Bruce", "Carol");
		System.out.println(namen.getAll());
		
		System.out.println();
		
		DataPool<Integer> zahlen = new DataPool<>();
		zahlen.add(17,22,18,1,9,109,2000,2);
		System.out.println(zahlen.getAll());
		
	}
}

class DataPool<T extends Comparable<T>> {
	
	private List<T> data = new ArrayList<>();
	
	public void add(T... values) {
		
		for(T value : values) {
			data.add(value);
		}
		
		Collections.sort(data); // Elemente müssen Comparable sein
	}
	
	public List<T> getAll() {
		return data;
	}
}