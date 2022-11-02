package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {
		
		// Streams
		Random rand = new Random();
		
		// int getAsInt();
		IntSupplier sup = () -> rand.nextInt(100) + 1; 
		
		// void accept(int value);
		IntConsumer cons = (i) -> System.out.println(i); 
		
		IntStream.generate(sup).limit(1_000).forEach(cons);
		
		
		// boolean test(Integer t);
		Predicate<Integer> pred = t -> t%2 == 0; 
		System.out.println(pred.test(175));
		
		ArrayList<String> namen = new ArrayList<>();
		namen.add("Peter");
		namen.add("Bruce");
		namen.add("Carol");
		System.out.println(namen);
		
		String[] ws1 = new String[8]; // Ist Array ausreichend groß, wird es als Referenz verwendet
		//String[] ws1 = new String[0]; // Ist das Array zu klein, wird nur der Datentyp mitgenommen
		String[] ws2 = namen.toArray(ws1);
		
		System.out.println(ws1 == ws2);
		System.out.println(Arrays.toString(ws1));
		System.out.println(Arrays.toString(ws2));
		
		
	}

}
