package de.lubowiecki.workshop.nov14;

import java.util.ArrayList;
import java.util.List;

public class MusikerTest {

	public static void main(String[] args) {
		
		KlavierSpieler ks1 = new KlavierSpieler("Peter", "Steinway");
		GeigenSpieler gs1 = new GeigenSpieler("Bruce", "Banner");
		
		Musiker m1 = new KlavierSpieler("Bob", "Yamaha");
		Musiker m2 = new GeigenSpieler("Carol", "Danvers");
		
		ks1.musiziere();
		m1.musiziere();
		
		System.out.println();
		
		gs1.musiziere();
		m2.musiziere();
		
		List<Object> band1 = new ArrayList<>();
		band1.add(new KlavierSpieler("Hans", "Schimmel"));
		band1.add(new GeigenSpieler("Peter", "Pamski")); // ERROR: ist kein Klavierspieler
		
		for(Object o : band1) {
			// Über Referenz o kommen wir nicht an die Methode musizieren ran
		}
		
		System.out.println();
		
		List<Musiker> band2 = new ArrayList<>();
		band2.add(ks1);
		band2.add(gs1);
		band2.add(new KlavierSpieler("Hans", "Schimmel"));
		band2.add(new GeigenSpieler("Peter", "Pamski"));
		
		// Es wird einen AnonymeKlasse erzeugt, die von Musiker erbt und diese wrd gleich instanziert
		band2.add(() -> System.out.println("Spielt auf den Nerven")); // als Lambda
		
		band2.add(new Musiker() {
			@Override
			public void musiziere() {
				System.out.println("....");
			}
		}); // als AnonymeKlasse. Hat das Interface nur eine abstrakte Methode würde man heute eher ein Lambda nutzen
		// Hat das Interface mehrere abstrakte Methoden kann man ein Lambda nicht verwenden und muss einen AnonymeKlasse nutzen
		
		band2.add(new PaukenSpieler());
		
		for(Musiker m : band2) {
			m.musiziere(); // Jeder Musiker kann musizieren()
			// Müber eine Referenz vom Typ Musiker kann man nur das sehen, was alle Musiker gemeinsam haben
		}
		
		System.out.println();
		
		MusikerVerwaltung verwaltung = new MusikerVerwaltung();
		verwaltung.add(ks1);
		verwaltung.add(new KlavierSpieler("Hans", "Schimmel"));
		verwaltung.add(new PaukenSpieler());
		verwaltung.musizieren();
		
	}
}
