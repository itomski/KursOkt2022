package de.lubowiecki.fahrzeuge;

public class FahrzeugSimulation {

	public static void main(String[] args) {
		
		// Als Benutzen möchte ich die Bewegung in eines Autos simulieren
		// Ich möchte einen Kofferraum be- und entpacken können
		// Ich möchte den Motor starten und stoppen können
		// Ich möchte beschleunigen und abbremsen können
		
		// Auto
		// Motor
		// Kofferraum
		
//		Motor m = new Motor();
//		m.start();
//		System.out.println(m.istAn());
//		
//		m.beschleunigen(10);
//		System.out.println(m.getGeschwindigkeit());
//		m.beschleunigen(10);
//		System.out.println(m.getGeschwindigkeit());
//		m.beschleunigen(10);
//		System.out.println(m.getGeschwindigkeit());
//		m.beschleunigen(10);
//		System.out.println(m.getGeschwindigkeit());
//		m.abbremsen(10);
//		System.out.println(m.getGeschwindigkeit());
//		m.abbremsen(10);
//		System.out.println(m.getGeschwindigkeit());
//		m.abbremsen(10);
//		System.out.println(m.getGeschwindigkeit());
//		
//		System.out.println(m);
		
//		m.stop();
//		System.out.println(m.istAn());
		
//		Kofferraum k = new Kofferraum();
//		System.out.println("Voll: " + k.istVoll());
//		
//		k.beladen("Werkzeug");
//		k.beladen("Kiste Cola");
//		System.out.println("Voll: " + k.istVoll());
		
//		k.entladen();
//		System.out.println("Voll: " + k.istVoll());
		
//		System.out.println(k);
		
		
		Auto a = new Auto();
		a.start();
		//a.stop();
		a.beladen("Werkzeug");
		a.beschleunigen(100);
		System.out.println(a); // Konvertiert Auto in einen String
		
		a.abbremsen(50);
		System.out.println(a);
		
		a.stop();
		a.entladen();
		System.out.println(a);
	}
}
