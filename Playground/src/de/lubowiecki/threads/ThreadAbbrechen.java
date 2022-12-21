package de.lubowiecki.threads;

public class ThreadAbbrechen {

	public static void main(String[] args) {
		
		Runnable aufgabe = () -> {
			
			Thread t = Thread.currentThread();
			
			while(true) {
				if(t.isInterrupted()) break; // Schleife abbrechen, wenn der Thread abgebrochen wird
				
				System.out.println(t.getName() + ": Bin noch da...");
				
				try {
					Thread.sleep(200);
				} 
				catch (InterruptedException e) {
					System.out.println(t.getName() + ": Was?... ich bin jetzt wach..."); // Wenn im Schlaf abgebrochen
					t.interrupt(); // Setzt das Abbruch-Falg auf true
				}
			}
		};
		
		Thread t1 = new Thread(aufgabe);
		t1.start();
		
		try {
			Thread.sleep(5000); // Main-Thread schläft
			
			// Setzt das Abbruch-Falg für den Thread auf true, es sei denn, der Thread schläft gerade
			// Schläft der Thread beim Abbruch, wird das Flag nicht gesetzt sondern ne InterruptedException geworfen
			// und der Thread wacht auf
			t1.interrupt(); // Die Auführung von t1 abbrechen
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
