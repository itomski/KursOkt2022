package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TimeTest {

	public static void main(String[] args) {
		
		// java.util.Date veraltet
//		Date d1 = new Date();
//		System.out.println(d1);
//		
//		d1 = new Date(2022, 3, 10, 15, 22, 17);
//		System.out.println(d1);
//		
//		d1 = new Date(-10000); // Timestamp
//		System.out.println(d1);
		
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);
		
		ld1 = LocalDate.of(2015, 2, 28);
		System.out.println(ld1);
		
		lt1 = LocalTime.of(23,52,32);
		System.out.println(lt1);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		//ld1 = LocalDate.parse("1985-05-17");
		ld1 = LocalDate.parse("17.05.1985", fmt); // Liest das Datum aus einem String nach vorgegebenen Format ein
		ld1 = ld1.plusDays(20);
		System.out.println(ld1);
		System.out.println(ld1.format(fmt)); // Passt die Ausgabe an das vorgegebene Format an
		
		LocalDateTime ldt1 = LocalDateTime.of(ld1, lt1);
		System.out.println(ldt1);
		
		ldt1 = LocalDateTime.now();
		System.out.println(ldt1);
		
		//ldt1 = LocalDateTime.of(2015, 12, 10, 15, 22, 17);
		ldt1 = LocalDateTime.of(2015, Month.JUNE, 10, 15, 22, 17);
		System.out.println(ldt1);
		
		Month m = ldt1.getMonth();
		int mv = ldt1.getMonthValue(); // als int
		
		System.out.println();
		
		LocalDate ld2 = LocalDate.of(2025, 10, 7);
		LocalDate ld3 = LocalDate.now();
		
		Period p = Period.between(ld3, ld2);
		System.out.println(p);
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		System.out.println(p.get(ChronoUnit.MONTHS));
		//System.out.println(p.get(ChronoUnit.SECONDS));
		
		LocalDate ld4 = ld3.plus(p); // Auf einen Zeitpunkt wird ein Datumsabstand addiert
		System.out.println(ld4);
		
		p = Period.ofMonths(100);
		System.out.println(p);
		System.out.println(p.normalized());
		
		System.out.println();
		
		p = Period.ofDays(100);
		System.out.println(p);
		System.out.println(p.normalized()); // Verteilung auf konkrete Monate ist unbekannt d.h. normalisieren nicht möglich
		
		System.out.println(ChronoUnit.DAYS.between(ld3, ld4));
		
		p = Period.parse("P15Y");
		System.out.println(p);
		//p = p.minusDays(100);
		p = p.minusMonths(10);
		System.out.println(p.normalized());
		p = p.minus(Period.parse("P10D"));
		System.out.println(p.normalized());
		
		p = Period.of(20, 20, 20);
		System.out.println(p);
		
		p = Period.of(20, 20, 20);
		p = p.plusDays(5); // addiert zu einem Feld
		System.out.println(p);
		p = p.withDays(5); // Überschreibt ein Feld
		System.out.println(p);
		
		System.out.println(p.toTotalMonths());
		
		System.out.println();
		
		List<LocalDate> dates = new ArrayList<>();
		dates.add(LocalDate.of(2022, 10, 15));
		dates.add(LocalDate.of(2022, 10, 20));
		dates.add(LocalDate.of(2021, 10, 20));
		dates.add(LocalDate.of(2027, 12, 1));
		dates.add(LocalDate.of(2018, 5, 13));
		
		System.out.println(dates);
		Collections.sort(dates);
		System.out.println(dates);
	}

}
