package de.lubowiecki.cal;

import java.time.LocalDate;

public class CalApp {
	
	private Cal cal = new Cal();

	public static void main(String[] args) {
		
		new CalApp().run();
		
	}

	private void run() {
		
		cal.addTermin(LocalDate.now().plusDays(1), "Bowling mit Hulk");
		cal.addTermin(LocalDate.now().plusDays(7), "Essen mit Carol");
		cal.addTermin(LocalDate.now().plusDays(14), "Teammeeting bei S.H.I.E.L.D");
		cal.addTermin(LocalDate.now().plusDays(2), "Teammeeting bei S.H.I.E.L.D");
		
		System.out.println(cal); // toString
		
	}
}
