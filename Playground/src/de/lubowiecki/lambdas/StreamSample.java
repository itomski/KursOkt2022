package de.lubowiecki.lambdas;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSample {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		
		// int roll();
		Dice w6 = () -> rand.nextInt(6) + 1;
		System.out.println(w6.roll());
		
		System.out.println();
		
		// IntSupplier: int getAsInt();
		IntSupplier w10 = () -> rand.nextInt(10) + 1;
		
		long start = System.currentTimeMillis(); // Altuelle Zeit in Millisekunden
		
		// generate ruft endlos die getAsInt Methode des IntSuppliers auf
		//IntStream.generate(w10).limit(1_000_000).forEach(i -> System.out.println(i));
		//List<Integer> rands = IntStream.generate(w10).limit(100_000_000).boxed().collect(Collectors.toList());
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + " ms");
		
		// Statt einen Lambda-Ausdruck einzugeben, kann man auch auf eine bereits vorhandene Methode mit gleicher Signatur verweisen
		
		// Methoden-Referenzen :: bedeutet hier wird auf eine vorhandene Methode verweisen/verlinkt
		
		// IntConsumer: void accept(int i)
		IntStream.generate(w10).limit(10).forEach(StreamSample::sPrintInt); // Aufruf einer statischen Methode
		
		
		StreamSample samp = new StreamSample();
		IntStream.generate(w10).limit(10).forEach(samp::iPrintInt); // Aufruf einer Instanzmethode
		
		
		IntStream.generate(w10).limit(10).forEach(System.out::println); // Aufruf einer Instanzmethode
		
		System.out.println();
		
		int zahl = 10;
		
		Consumer<Integer> cons = i -> System.out.println(i * 10); // zahl kann nur verwendet werden, weil sie effektiv final ist
		
		//zahl = 15; // verursacht, dass zahl nicht mehr effektiv final ist
		
		cons.accept(10);
	}
	
	public static void sPrintInt(int nr) {
		System.out.println(nr);
	}
	
	public void iPrintInt(int nr) {
		System.out.println(nr);
	}
	
}

@FunctionalInterface
interface Dice {
	int roll();
}
