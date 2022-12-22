package de.lubowiecki.workshop.dec21;

public class RoboterTest {

	public static void main(String[] args) {
		
		// Roboter-Klasse entwerfen
		//	- Aktionen nach Zufall ausführen
		// 		- Aktionen
		//		- Zufallsgenerator
		//  - Endlos Aktionen ausführen
		// 		- Schleife
		//  - Parallel, d.h. im Thread starten
		//  - Zwei weitere Instanzen des Roboters parallel starten
		
		HaushaltsRoboter r2d2 = new HaushaltsRoboter("R2-D2");
		new Thread(r2d2).start(); // start führt automatisch und parallel die run-Methode des Runnables aus
		
		HaushaltsRoboter c3po = new HaushaltsRoboter("C-3PO");
		new Thread(c3po).start();
		
		HaushaltsRoboter bb8 = new HaushaltsRoboter("BB-8");
		new Thread(bb8).start();
		
		
//		Powerbank bank = new Powerbank(new LadeAktion());
//		Powerbank bank = new Powerbank(() -> System.out.println("Kann nicht geladen werden. Ist kaputt"));
//		bank.load();

	}
}
