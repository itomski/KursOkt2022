package de.lubowiecki.threads;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		new Dinner(latch).start();
		new Gast("Peter", latch).start();
		new Gast("Carol", latch).start();
		new Gast("Bruce", latch).start();
		new Gast("Anna", latch).start();
		new Gast("Natasha", latch).start();
		new Gast("Franz", latch).start();
		
	}
}

class Dinner extends Thread {
	
	private CountDownLatch latch;
	
	public Dinner(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		try {
			latch.await(); // Wartet bis sich genügend Gäste angemeldet haben, bis CountDownLatch bei 0 ist
			System.out.println("Der Dinner startet.");
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Gast extends Thread {
	
	private String name;
	
	private CountDownLatch latch;
	
	private Random rand = new Random();
	
	public Gast(String name, CountDownLatch latch) {
		this.name = name;
		this.latch = latch;
	}
	
	@Override
	public void run() {
		System.out.println(name + ": überlegt...");
		
		try {
			sleep((rand.nextInt(5) + 1) * 1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + ": Meldet sich zum Dinner an.");
		latch.countDown(); // CountDownLatch wird um 1 ermäßigt
	}
}