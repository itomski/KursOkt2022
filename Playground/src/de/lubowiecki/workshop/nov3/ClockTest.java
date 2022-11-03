package de.lubowiecki.workshop.nov3;

import java.time.LocalTime;

public class ClockTest {

	public static void main(String[] args) {
		// Statische Methode wird direkt über die Klasse verwendet
		// Instanzierung nicht nötig
		System.out.println(MyClock.now());
		
		System.out.println(MyClock.howLongTo(LocalTime.of(18, 0)));

	}

}
