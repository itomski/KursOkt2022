package de.lubowiecki.playground;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		
		// Früher
		Date jetzt = new Date();
		System.out.println(jetzt);
		
		jetzt = new Date(2022, 10, 12, 13, 29, 28); // Monat beginnt mit 0
		System.out.println(jetzt);
		
		// Jetzt
		LocalDate jetzt2 = LocalDate.now(); // aktuelles Datum
		jetzt2 = LocalDate.of(2023,2,28); // gewünschtes Datum
		System.out.println(jetzt2);
		
		System.out.println();
		
		LocalTime jetzt3 = LocalTime.now();
		jetzt3 = LocalTime.of(13, 17, 22);
		System.out.println(jetzt3);
		
		LocalDateTime jetzt4 = LocalDateTime.now();
		jetzt4 = LocalDateTime.of(jetzt2, jetzt3);
		jetzt4 = LocalDateTime.of(2022, 5, 17, 18, 37);
		System.out.println(jetzt4);
		
	}
}
