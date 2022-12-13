package de.lubowiecki.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		
		List<Integer> zahlen = new ArrayList<>(Arrays.asList(2,5,9,1,7,18,22,100,9,5,4));
		
		Stream<Integer> intStream = zahlen.stream();
		
		String[] namen = {"Peter", "Bruce", "Carol", "Natasha", "Tony"};
		
		Stream<String> strStream = Arrays.stream(namen);
		
		Stream<Double> dStream = Stream.of(10.2, 17.22, 8.0, 19.3);
		
		dStream = Stream.generate(() -> Math.random() * 10);
		// dStream.forEach(System.out::println);

		Stream<Integer> iStream = Stream.iterate(0, i -> i + 2);
		
		try {
			Stream<String> lines = Files.lines(Paths.get("data", "content.txt"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		// IntStream = Stream für primitive ints
		IntStream chars = "Das ist ein Haus von Nikigraus".chars();
		chars.filter(i -> (char)i != 'N');
		
	}

}
