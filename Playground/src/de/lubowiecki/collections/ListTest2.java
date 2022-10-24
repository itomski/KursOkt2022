package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		List<Thing> things = new ArrayList<>();
		things.add(new Thing("Hammer", 15.0));
		things.add(new Thing("Zange", 0.5));
		System.out.println(things);
		
		things = addToFirstPos(things, new Thing("Tasse", 0.25));
		System.out.println(things);
		
		System.out.println();
		
		List<Thing> l = Arrays.asList(new Thing("Tasse1", 0.25), new Thing("Tasse2", 0.25));
		l = addToFirstPos(l, new Thing("Tasse3", 0.25));
		System.out.println(l);

	}
	
	public static List<Thing> addToFirstPos(List<Thing> list, Thing obj) {
		list = new LinkedList<>(list);
		list.add(0, obj);
		return new ArrayList<>(list);
	}
}
