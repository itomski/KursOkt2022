package de.lubowiecki.threads;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	
	// Kontrolliert die gleichzeitige Nutzung einer Methode 
	
	public static void main(String[] args) {
		
		HotTub tub1 = new HotTub(10);
		
		new BadeGast("Peter", tub1).start();
		new BadeGast("Bruce", tub1).start();
		new BadeGast("Carol", tub1).start();
		new BadeGast("Hans", tub1).start();
		new BadeGast("Anna", tub1).start();
		new BadeGast("Berta", tub1).start();
	}
}

class HotTub {
	
	private Semaphore semaphore;
	
	public HotTub(int limit) {
		semaphore = new Semaphore(limit);
	}
	
	public boolean benutzen(BadeGast gast) {
		System.out.println(gast.getName() + ": will ins Wasser.");
		
		boolean drin = false;
		
		try {
			semaphore.acquire(); // Wartet bis Platz frei ist
			drin = true;
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(gast.getName() + ": geht ins Wasser.");
		
		return drin;
	}
	
	public void nutzungBeenden(BadeGast gast) {
		System.out.println(gast.getName() + ": verlässt das Tub.");
		semaphore.release(); // Gibt den Platz frei
	}
}

class BadeGast extends Thread {
	
	private HotTub tub;
	
	public BadeGast(String name, HotTub tub) {
		super(name);
		this.tub = tub;
	}

	@Override
	public void run() {
		
		tub.benutzen(this);
		int badezeit = new Random().nextInt(5) + 1;
		
		System.out.println(getName() + ": badet");
		
		try {
			Thread.sleep(badezeit * 1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		tub.nutzungBeenden(this);
	}
}
