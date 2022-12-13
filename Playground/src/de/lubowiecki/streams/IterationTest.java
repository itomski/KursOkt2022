package de.lubowiecki.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterationTest {
	
	public static void main(String[] args) {
		
		List<Integer> zahlen = new ArrayList<>(Arrays.asList(2,5,9,1,7,18,22,100,9,5,4));
		
		// Externe Iteration
		for(Integer i : zahlen) {
			if(i % 2 == 0) continue;
			System.out.println(i + 2);
		}
		
		System.out.println();
		
		// Interne Iteration
		//zahlen.forEach(i -> System.out.println(i + 2)); // Collection wird direkt durchlaufen
		
		// Sequentiell (Auf einem Prozessorkern)
		zahlen.stream()
			  .filter(i -> i % 2 != 0)
			  .forEach(i -> System.out.println(i + 2));
		
		System.out.println();
		
		// Parallel (Auf mehreren Prozessorkernen)
		zahlen.parallelStream()
			  .filter(i -> i % 2 != 0)
			  .forEach(i -> System.out.println(i + 2));
		
		System.out.println();
		
//		zahlen.removeIf(i -> i % 2 == 0);
//		System.out.println(zahlen);
		
		// Beispiel Externe Iteration
		
		for(int i = 0; i < zahlen.size(); i++) {
			if(i % 2 == 0) zahlen.remove(i);
		}
		
		System.out.println(zahlen);
		
	}
}
