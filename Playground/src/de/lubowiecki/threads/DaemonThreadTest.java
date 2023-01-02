package de.lubowiecki.threads;

public class DaemonThreadTest {
	
	public static void main(String[] args) {
		
		// void run();
		Runnable aufgabe1 = () -> {
			// liefert eine Referenz auf den Thread, der später diese Aufgabe ausführt
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + ": start");
			
			// der Thread, der diese Aufgabe ausführt pausiert für 5 Sekunden
			try {
				Thread.sleep(10000); // sleep ist statisch
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(t.getName() + ": ende");
		};
		
		
		Runnable aufgabe2 = () -> {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + ": start");
			
			new Thread(aufgabe1).start();
			
			try {
				Thread.sleep(5000); // sleep ist statisch
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(t.getName() + ": ende");
		};
		
		
		System.out.println("main START");
		
		Thread t1 = new Thread(aufgabe2);
		t1.setDaemon(true); // t1 wird dem Thread unterordnet, der ihn startet (main)
		// Endet der main-Thread wird automatisch auch t1 beendet
		// Alle Threads, die t1 startet sind auch automatisch dem main-Thread unterordnet
		t1.start();
		
		System.out.println("main ENDE");
		
		// Programm endet erst, wenn ALLE Threads ihre Aufgabe abgearbeitet haben
	}
}
