package de.lubowiecki.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {

	public static void main(String[] args) {
		
		Integer[] ints = {2,17,22,18,1,9,18,15,1,15,100,-22};
		
		// forEach verwendet einen Consumer
		Arrays.stream(ints).forEach(System.out::println);
		
		// toList, toArray
		List<Integer> intList;
		
		//intList = Arrays.stream(ints).toList();
		
		// Die übrigen Elemente werden in ein Set/List/Collection gesammelt
		Set<Integer> intSet = Arrays.stream(ints).collect(Collectors.toSet());
		
		intList = Arrays.stream(ints).collect(ArrayList::new, List::add, List::addAll);
		
		intSet = Arrays.stream(ints).collect(TreeSet::new, Set::add, Set::addAll);
		System.out.println(intSet);
		
		// Reduce - Auf einen Wert reduzieren
		
		int sum = Arrays.stream(ints).reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		
		//ints = new Integer[]{};
		Optional<Integer> sumOpt = Arrays.stream(ints).reduce((a, b) -> a + b);
		sumOpt.ifPresent(System.out::println); // wird nur ausgegeben, wenn ein Wert vorliegt
		System.out.println(sumOpt.orElse(0)); // Gibt eine 0 aus, wenn Optional leer ist
		System.out.println(sumOpt.orElseThrow()); // Wird ausgegeben, wenn vorhanden, sonst eine Exception
		System.out.println(sumOpt);
		System.out.println(sumOpt.get());
		
		// Reduziert alle Inhalte auf einen String
		String str = Stream.of("A", "B", "C", "D").reduce("#", (a, b) -> a + ", " + b);
		System.out.println(str);
		
		System.out.println();
		
		ints = new Integer[]{2,17,22,18,1,9,18,15,1,15,100,-22};
		Optional<Integer> max = Arrays.stream(ints).max((a, b) -> a.compareTo(b));
		System.out.println(max);
		
		System.out.println();
		
		Optional<Integer> min = Arrays.stream(ints).min(Comparator.naturalOrder());
		System.out.println(min);
		
		System.out.println();
		
		boolean mehrAls50 = Arrays.stream(ints).anyMatch(i -> i > 50);
		System.out.println(mehrAls50);
		
		boolean keinerIstkleinerAls10 = Arrays.stream(ints).noneMatch(i -> i < 10);
		System.out.println(keinerIstkleinerAls10);
		
		boolean allesGeradeZehlen = Arrays.stream(ints).allMatch(i -> i % 2 == 0);
		System.out.println(allesGeradeZehlen);
		
		System.out.println();
		
		int[] intArr = new int[]{2,17,22,18,1,9,18,15,1,15,100,-22};
		
		sum = Arrays.stream(intArr).sum();
		System.out.println(sum);
		
		System.out.println();
		
		OptionalDouble ave = Arrays.stream(intArr).average();
		System.out.println(ave);
		
	}

}
