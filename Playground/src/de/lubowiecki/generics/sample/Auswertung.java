package de.lubowiecki.generics.sample;

import java.time.LocalDate;
import java.time.LocalTime;

public class Auswertung {

	public static void main(String[] args) {
		
		LocalDate heute = LocalDate.now();
		LocalTime jetzt = LocalTime.now();
		
		InspektionBericht b1 = new InspektionBericht(heute, jetzt, "Alles kaputt", 100.0, "PP");
		InspektionBericht b2 = new InspektionBericht(heute, jetzt, "Alles O.K.", 50.0, "PP");
		InspektionBericht b3 = new InspektionBericht(heute, jetzt, "Läuft nicht. Ursache noch unbekannt.", 200.0, "BB");
		
		BeratungsBericht b4 = new BeratungsBericht(heute, jetzt, "Immo-Finanzierung", "Kunde ist begeistert", 200, "CD");
		BeratungsBericht b5 = new BeratungsBericht(heute, jetzt, "Fahrzeug-Finanzierung", "Kunde ist schaut sich an Alternativen um", 100, "CD");
		BeratungsBericht b6 = new BeratungsBericht(heute, jetzt, "Sparbuch", "Unbekannt", 0, "SR");
		
		ReparaturBericht b7 = new ReparaturBericht("Tank, Motor", 5000, "BB");
		ReparaturBericht b8 = new ReparaturBericht("Reifen", 200, "PP");
		
		Gesamtbericht<InspektionBericht> gb1 = new Gesamtbericht<>();
		gb1.add(b1);
		gb1.add(b2);
		gb1.add(b3);
		gb1.kostenProMitarbeiter();
		
		System.out.println();
		
		Gesamtbericht<BeratungsBericht> gb2 = new Gesamtbericht<>();
		gb2.add(b4);
		gb2.add(b5);
		gb2.add(b6);
		gb2.kostenProMitarbeiter();
		
		System.out.println();
		
		Gesamtbericht<ReparaturBericht> gb3 = new Gesamtbericht<>();
		gb3.add(b7);
		gb3.add(b8);
		gb3.kostenProMitarbeiter();
		
	}
}
