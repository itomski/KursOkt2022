package de.lubowiecki.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeTest {

	public static void main(String[] args) {
		
		System.out.println("main START");
		
		
		int processors = Runtime.getRuntime().availableProcessors(); // Anzahl der der Prozessoren
		System.out.println(processors);
		
		ExecutorService service = Executors.newFixedThreadPool(processors);
		
		List<Callable<Integer>> aufgaben = new ArrayList<>();
		
		Callable<Integer> aufgabe = () -> {
			Random rand = new Random();
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + ": START");
			
			Thread.sleep((rand.nextInt(10) + 1) * 1000);
			
			System.out.println(t.getName() + ": ENDE");
			return 1;
		};
		
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		aufgaben.add(aufgabe);
		
		try {
			//service.invokeAll(aufgaben); // es wird gewartet, bis alle Aufgaben fertig sind
			service.invokeAny(aufgaben); // es wird gewartet, bis eine der Aufgaben fertig ist
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		} 
		catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("main ENDE");
	}
}
