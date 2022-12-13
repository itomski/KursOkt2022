package de.lubowiecki.streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		
		String[] namen = {"Peter", "Bruce", "Carol", "Natasha", "Tony", "Carol", "Peter"};
		
		// distinct() jeder Wert wird nur 1x verarbeitet
		Arrays.stream(namen).distinct().forEach(n -> System.out.println(n));
		
		System.out.println();
		
		Stream<String> namenStream = Arrays.stream(namen);
		namenStream.distinct().forEach(n -> System.out.println(n));
		
		System.out.println();
		
		// Jeder Stream kann nur 1x verarbeitet werden. Danach ist er verbraucht
		
		namenStream = Arrays.stream(namen); // muss neu zugewiesen werden
		namenStream.distinct().forEach(n -> System.out.println(n));

		System.out.println();
		
		// Jeder Stream kann nur 1x verarbeitet werden. Danach ist er verbraucht
		
		Function<String, Double> func1 = s -> s.length() + 0.0;
		
		// Funktion, wo Rückgabetyp gleich dem Eingangstyp ist
		UnaryOperator<Double> func2 = d -> d * d;
		
		Predicate<Double> pred1 = d -> d > 30;
		
		Arrays.stream(namen)
			//.peek(v -> System.out.print("+" + v))
			  .map(func1)
			  //.peek(v -> System.out.print("@" + v))
			  .map(func2)
			  //.peek(v -> System.out.print("#" + v))
			  .filter(pred1)
			  //.peek(v -> System.out.print("!" + v + " "))
			  .forEach(System.out::println); // Terminierende Operation
		
		
		System.out.println();
		
		Stream.of(2,17,22,18,1,9,18,15,100,-22).skip(3).distinct().sorted().forEach(System.out::println);
		
		
		
	}

}
