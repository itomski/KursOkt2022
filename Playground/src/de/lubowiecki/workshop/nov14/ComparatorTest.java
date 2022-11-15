package de.lubowiecki.workshop.nov14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("Carol", "Danvers", 32);
		Person p2 = new Person("Bruce", "Banner", 40);
		Person p3 = new Person("Peter", "Parker", 25);
		Person p4 = new Person("Natasha", "Romanov", 31);
		
		List<Person> personen = new ArrayList<Person>() {
			{
				add(p1);
				add(p2);
				add(p3);
				add(p4);
			}
		};
		
		personen = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		
		// int compare(T o1, T o2);
		Comparator<Person> nachAlter = (a, b) -> a.getAlter() - b.getAlter();
		Comparator<Person> nachAlterReverse = (a, b) -> b.getAlter() - a.getAlter();
		Comparator<Person> nachVorname = (a, b) -> a.getVorname().compareTo(b.getVorname());
		
		//Collections.sort(personen, nachVorname);
		Collections.sort(personen, (a, b) -> a.getNachname().compareTo(b.getNachname()));
		System.out.println(personen);
		

	}
}
