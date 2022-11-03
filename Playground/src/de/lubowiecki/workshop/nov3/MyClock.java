package de.lubowiecki.workshop.nov3;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MyClock {
	
	private static final DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	
	// Methode verwendet nur Klassenvariablen - kann daher statisch sein
	public static String now() {
		return LocalTime.now().format(FMT);
	}
	
	// Methode verwendet nur Methodenparameter - kann daher statisch sein
	public static String howLongTo(LocalTime time) {
		return Duration.between(LocalTime.now(), time).getSeconds() + "s";
	}

}
