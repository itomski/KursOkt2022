package de.lubowiecki.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	
	static List<Integer> sammlung;
	
	public static void main(String[] args) {
		
		Runnable aufgabe1 = () -> {
			Random rand = new Random();
			List<Integer> zahlen = new ArrayList<>();
			
			for(int i = 0; i < 5000; i++) {
				zahlen.add(rand.nextInt(10) + 1);
			}
			
			// Lamdas dürfen nur dann LOKALE Variablen nutzen, wenn diese final oder effektiv-final sind
			sammlung = zahlen; // sammlung müsste synchronisiert werden
		};
		
		
		Callable<List<Integer>> aufgabe2 = () -> {
			Random rand = new Random();
			List<Integer> zahlen = new ArrayList<>();
			
			for(int i = 0; i < 5000; i++) {
				zahlen.add(rand.nextInt(10) + 1);
			}
			
			return zahlen; // muss nicht synchronisiert werden
		};
		
		ExecutorService service = Executors.newSingleThreadExecutor(); // SingleThreadExecutor arbeitet mit EINEM parallenen Thread
		service.execute(aufgabe1);
		
		Future<List<Integer>> ergFuture = service.submit(aufgabe2);
		
		try {
			List<Integer> erg = ergFuture.get(); // get blockiert bis ein Ergebnis vorliegt
			for(int i : erg) {
				System.out.println(i);
			}
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		} 
		catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
