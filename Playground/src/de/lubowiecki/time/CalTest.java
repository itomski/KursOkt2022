package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CalTest {
	
	public static void main(String[] args) {
		
		TreeMap<LocalDateTime, String> cal = new TreeMap<>();
		
		cal.put(LocalDateTime.of(2022, 10, 15, 17, 25), "Essen mit Carol");
		cal.put(LocalDateTime.of(2022, 12, 1, 9, 0), "Essen mit Steve");
		cal.put(LocalDateTime.of(2023, 1, 5, 18, 15), "Essen mit Natasha");
		cal.put(LocalDateTime.of(2022, 11, 27, 15, 30), "Essen mit Bruce");
		
//		for(String s : cal.values()) {
//			System.out.println(s);
//		}
		
		for(Map.Entry<LocalDateTime, String> t : cal.entrySet()) {
			System.out.println(t.getKey() + ": " + t.getValue());
		}
		
		System.out.println();
		
		TreeMap<LocalDateTime, List<String>> cal2 = new TreeMap<>();
		
		LocalDateTime zeitpunkt = LocalDateTime.of(2022, 10, 15, 17, 25);
		cal2.put(zeitpunkt, new ArrayList<>());
		cal2.get(zeitpunkt).add("Essen mit Peter");
		cal2.get(zeitpunkt).add("Besprechung mit Peter");
		
		System.out.println(cal2.get(zeitpunkt));
		
		// cal2.subMap(zeitpunkt1, zeitpunkt2) // Liefert einen passenden Ausschnitt aus der Original Map
		
		//TreeMap<LocalDate, TreeMap<LocalTime, List<String>>> cal3;
		
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task("Putzen", "....", LocalDate.of(2022, 11, 16), LocalTime.of(9, 15)));
		tasks.add(new Task("Putzen", "....", LocalDate.of(2022, 11, 15), LocalTime.of(9, 15)));
		tasks.add(new Task("Nachrichten schauen", "....", LocalDate.of(2022, 11, 15), LocalTime.of(9, 15)));
		tasks.add(new Task("Training", "....", LocalDate.of(2022, 11, 15), LocalTime.of(10, 30)));
		
		Collections.sort(tasks);
		
		for(Task t : tasks) {
			System.out.println(t);
		}
		
		
		System.out.println();
		
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		
		//LocalDateTime ldt = LocalDateTime.of(ld, lt);
		LocalDateTime ldt = ld.atTime(lt);
		
		ld.plus(10, ChronoUnit.DAYS);
		ld.plusDays(10);
		
		ld.plus(2, ChronoUnit.YEARS);
		ld.plusYears(2);
		
		long l = ld.getLong(ChronoField.DAY_OF_MONTH); // Tag des Monats als Zahl
		l = ld.getLong(ChronoField.DAY_OF_WEEK); // Wochentag als Zahl
		l = ld.getLong(ChronoField.DAY_OF_YEAR); // Tag des Jahres als Zahl
		
	}
}

class Task implements Comparable<Task> {
	
	private String title;
	
	private String description;
	
	private LocalDate date;
	
	private LocalTime time;
	
	public Task(String title, String description, LocalDate date, LocalTime time) {
		this.title = title;
		this.description = description;
		this.date = date;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
	public int compareTo(Task other) {
		return LocalDateTime.of(date, time).compareTo(LocalDateTime.of(other.date, other.time));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Task [title=");
		builder.append(title);
		builder.append(", description=");
		builder.append(description);
		builder.append(", date=");
		builder.append(date);
		builder.append(", time=");
		builder.append(time);
		builder.append("]");
		return builder.toString();
	}
}
