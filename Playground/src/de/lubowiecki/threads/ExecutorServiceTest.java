package de.lubowiecki.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
	
	public static void main(String[] args) {
		
		System.out.println("START");
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		Runnable aufgabe = () -> {
			for (int i = 0; i < 100; i++) {
				
				try {
					Thread.sleep(500);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		};
		
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		
		service.shutdown();
		
		System.out.println("ENDE");
	}
}
