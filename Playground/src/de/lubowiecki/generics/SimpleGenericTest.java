package de.lubowiecki.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import de.lubowiecki.playground.Person;

public class SimpleGenericTest {
	
	public static void main(String[] args) {
		
		GenericBox<String> box = new GenericBox<>();
		box.set("Das ist ein Wert");
		System.out.println(box.get());
		
		System.out.println();
		GenericBox<Integer> box2 = new GenericBox<>();
		box2.set(123);
		System.out.println(box2.get());
		
		System.out.println();
		GenericBox<Person> box3 = new GenericBox<>();
		box3.set(new Person("Peter", "Parker"));
		System.out.println(box3.get());
		
		// ArrayList<E>
		// Comparator<Person> comp;
		// List<E>
		
		NumberBox<Double> zahlen = new NumberBox();
		zahlen.add(100.0);
		zahlen.add(200.0);
		zahlen.add(154.0);
		zahlen.add(22.0);
		System.out.println(zahlen.sum());
		
	}
}

// T ist ein Platzhalter
class GenericBox<T> { // <T> hier wird der Platzhalter festgelegt
	
	private T wert;

	public T get() {
		return wert;
	}

	public void set(T wert) {
		this.wert = wert;
	}
}

class NumberBox<T extends Number> { // T darf nur etwas sein, was von Number abgeleitet ist
	
	// T wird als Number verwendet ist aber in wirklichkeit eine SubKlasse davon
	private List<T> liste = new ArrayList<>();

	public double sum() {
		double sum = 0;
		for(Number n : liste) {
			sum += n.doubleValue();
		}
		return sum;
	}

	public void add(T wert) {
		this.liste.add(wert);
	}
}
