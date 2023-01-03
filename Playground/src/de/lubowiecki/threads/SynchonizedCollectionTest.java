package de.lubowiecki.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SynchonizedCollectionTest {

	public static void main(String[] args) {
		
		// Ist nicht ThreadSave
		List<String> list = new ArrayList<>();
		list.add("Peter");
		list.add("Carol");
		list.add("Bruce");
		list.add("Natasha");
		list.add("Steve");
		
		// tsList ist jetzt ThreadSave
		List<String> tsList = Collections.synchronizedList(list);
		
		List<String> fixedList = Collections.unmodifiableList(list);
		// fixedList.remove(1);
		
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
		System.out.println();
		
		Stream<Integer> zahlen = Stream.of(10,15,18,1,7,99,-20,18,101,22,18,99,2,3,8,17,13,102,95,75,4,3,2);
		// bei parallelenStreams sollten ThreadSave-Collections verwendet werden
		ArrayList<Integer> zahlenListe = zahlen.parallel().filter(i -> i >= 10).collect(ArrayList::new, List::add, List::addAll);
		System.out.println(zahlenListe.size());
		System.out.println(zahlenListe);

	}

}
