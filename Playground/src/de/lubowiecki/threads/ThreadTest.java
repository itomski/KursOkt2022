package de.lubowiecki.threads;

public class ThreadTest {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName() + " START");
		
		Thread t1 = new Thread(new Aufgabe());
		//t1.setPriority(10);
		
		Thread t2 = new ThreadMitAufgabe();
		
		
		Runnable aufgabe = () -> {
			for (int i = 0; i < 1000; i++) {
				
				try {
					Thread.sleep(500);
				} 
				catch (InterruptedException e) { // Tritt ein, wenn der Thread während des Schlafs abgebrochen wird
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		};
		
		Thread t3 = new Thread(aufgabe);
		
		t1.start(); // parallele Abarbeitung wird gestartet
		t2.start();
		t3.start();
		
//		t1.run(); // Wird sequenziell vom Main-Thread ausgeführt
//		t2.run();
//		t3.run();
		
//		count(1);
//		count(2);
//		count(3);
		
		System.out.println(Thread.currentThread().getName() + " ENDE");

	}
	
	public static void count() {
		
		for (int i = 0; i < 1000; i++) {
			
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}

class Aufgabe implements Runnable {

	@Override
	public void run() {
		ThreadTest.count();
	}
}

class ThreadMitAufgabe extends Thread {
	
	@Override
	public void run() {
		ThreadTest.count();
	}
}
