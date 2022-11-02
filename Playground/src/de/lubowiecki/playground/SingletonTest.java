package de.lubowiecki.playground;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.get();
		s1.upCount();
		System.out.println(s1.getCount());
		
		Singleton s2 = Singleton.get();
		System.out.println(s1.getCount());
		s2.upCount();
		System.out.println(s1.getCount());
		
		
		System.out.println(s1 == s2);
		
		//Singleton s3 = new Singleton();
		
		machWas();
		System.out.println(s1.getCount());
		
		// UtilityKlassen:
		// Arrays
		// Collections
		System.out.println(Math.PI);
		
		LocalDate ld = LocalDate.now();
		
		Period p = Period.ofDays(10);
		
		ld.plus(10, ChronoUnit.DAYS);
		ld.plus(p);
		ld.plusDays(10);
		
		// FunctionalInterfaces
		
		// public void run();
		Runnable run = () -> System.out.println("Moin");
		
		run = () -> {
				System.out.println("Moin");
				System.out.println("...");
				int i;
				{
					i = 10;
				}
				System.out.println(i);
		};
	}
	
	static void machWas() {
		Singleton.get().upCount();
	}

}

class Singleton {
	
	private final static Singleton instance = new Singleton();
	
	private int count;
	
	private Singleton() {
	}
	
	public static Singleton get() {
		return instance;
	}

	public int getCount() {
		return count;
	}

	public void upCount() {
		this.count++;
	}
}
