package de.lubowiecki.threads;

public class AnomalieTest {
	
	public static void main(String[] args) {
		
		CountContainer container = new CountContainer();
		
		Thread t1 = new Thread(new Counter(container));
		Thread t2 = new Thread(new Counter(container));
		Thread t3 = new Thread(new Counter(container));
		
		t1.start();
		t2.start();
		t3.start();
		
		// Main wartet, bis die Threads fertig sind
		try {
			t1.join();
			t2.join();
			t3.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(container.count);
		
	}
}

class Counter implements Runnable {

	public CountContainer container;
	
	public Counter(CountContainer container) {
		this.container = container;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10_000; i++) {
			container.up();
			container.down();
		}
	}
}

class CountContainer {
	
	public int count = 0;
	
	// Sperrt bei der Verwendung durch ein Thread das ganze Objekt für andere Threads
//	public synchronized void up() { // Verwendet this als LOCK
//		count += 1;
//	}
//	
//	public synchronized void down() { // Verwendet this als LOCK
//		count -= 1;
//	}
	
	
	public void up() {
		// Hier können parallel noch andere Aufgaben erledigt werden,
		// die keine Synchro brauchen
		synchronized (this) {
			//...
			count += 1;
			//...
		}
	}
	
	public void down() {
		// Hier können parallel noch andere Aufgaben erledigt werden,
		// die keine Synchro brauchen
		synchronized (this) { // LOCK wird aufgenommen
			count -= 1;
		} // LOCK zurückgegeben
		
	}
	
	public void doSomething() {
		
		synchronized (CountContainer.class) { // Synchronisiert auf die Klasse
			count += 1;
		}
	}
}