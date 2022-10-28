package de.lubowiecki.collections;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListSuche {
	
	public static void main(String[] args) {
		
		List<Integer> zahlen = randNumbers();
		
		int pos = hasZahl(zahlen, 5);
		System.out.println(zahlen);
		System.out.println(pos);
		
		// Arrays
		pos = binHasZahl(zahlen, 5);
		System.out.println(zahlen);
		System.out.println(pos);
		
		
	}
	
	public static List<Integer> randNumbers() {
		Random rand = new Random();
		return Stream.generate(() -> rand.nextInt(10) + 1).limit(10).collect(Collectors.toList());
	}
	
	public static int hasZahl(List<Integer> haufen, int nadel) {
		
		for (int i = 0; i < haufen.size(); i++) {
			if(haufen.get(i) == nadel)
				return i;
		}
		
		return -1;
	}
	
	public static int binHasZahl(List<Integer> haufen, int nadel) {
		Collections.sort(haufen);
		// Wenn da, wird die Position geliefert
		// Wenn nicht da wird die Position in neginert plus -1 geliefert
		return Collections.binarySearch(haufen, nadel);
	}
}
