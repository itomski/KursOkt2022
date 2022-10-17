package de.lubowiecki.vererbung3;

import java.util.Queue;

public class Flughafen {
	
	// Queue = Warteschlange
	public void addFlugzeugSammlung(Queue<Landbar> sammlung) {
		
		while (!sammlung.isEmpty()) {
			landen(sammlung.poll()); // poll hollt aus der Warteschlange das nächste Element
		}
	}
	
	private void landen(Landbar obj) {
		System.out.println(obj.identifizieren() + ": möchte landen");
		obj.towerKommunikation();
		obj.fahrwerkAusfahren();
		obj.schubVeringern();
		obj.landen();
		obj.schubVeringern();
		obj.towerKommunikation();
		obj.landebahnVerlassen();
		System.out.println(obj.identifizieren() + ": Erfolgreich gelandet");
	}
	
	private void starten(Startbar obj) {
		System.out.println(obj.identifizieren() + ": möchte starten");
		obj.towerKommunikation();
		obj.landebahnBefahren();
		obj.towerKommunikation();
		obj.schubErhoehen();
		obj.schubErhoehen();
		obj.starten();
		obj.towerKommunikation();
		obj.fahrwerkEinfahren();
		System.out.println(obj.identifizieren() + ": Erfolgreich gestartet");
	}
}
