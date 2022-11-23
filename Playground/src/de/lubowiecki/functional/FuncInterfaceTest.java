package de.lubowiecki.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import de.lubowiecki.playground.Person;

public class FuncInterfaceTest {
	
	private static final Consumer<Person> NUR_NACHNAMEN = p -> System.out.println(p.getLastName());
	

	public static void main(String[] args) {
		
		Printable plain = s -> System.out.println(s);
		Printable html = s -> System.out.println("<h1>" + s + "</h1>");
		Printable upperCase = s -> System.out.println(s.toUpperCase());
		Printable upperHtml = s -> System.out.println("<h1>" + s.toUpperCase() + "</h1>");

		printOut("Hallo Welt", upperHtml);
		
		System.out.println();
		
		Listable plainList = c -> {
			for(String s : c) {
				System.out.println(s);
			}
		};
		
		Listable shortList = c -> {
			for(String s : c) {
				System.out.println(s.charAt(0) + ".");
			}
		};
		
		Listable getFirst = c -> {
			for(String s : c) {
				System.out.println(s);
				break;
			}
		};
		
		List<String> l1 = Arrays.asList("Peter", "Bruce", "Carol", "Steve");
		list(l1, getFirst);
		
		
		Morphable<String> m1 = s -> s.trim().toUpperCase().substring(0, 3);
		Morphable<Integer> m2 = i -> i * i;
		
		System.out.println(m1.morph("   Das ist ein Haus von Nikigraus  "));
		System.out.println(m2.morph(10));

		System.out.println();
		
		List<String> l2 = Arrays.asList("Peter", "Bruce", "Carol", "Steve", "Natasha");
		
		// Consumer: void accept(T t);
		Consumer<String> cons1 = s -> System.out.println(s);
		
		Consumer<String> cons2 = s -> {
			if(s.equals("Bruce")) return;
			System.out.println(s);
		};
		
		Consumer<String> cons3 = s -> {
			if(s.length() <= 5) return;
			System.out.println(s);
		};
		
		l2.forEach(cons3);
		
		System.out.println();
		
		List<Person> personen = new ArrayList<>();
		personen.add(new Person("Peter", "Parker"));
		personen.add(new Person("Bruce", "Banner"));
		personen.add(new Person("Carol", "Danvers"));
		personen.add(new Person("Natasha", "Romanov"));
		
		//personen.forEach(p -> System.out.println(p));
		//personen.forEach(p -> System.out.println(p.getFirstName() + " " + p.getFirstName()));
		//personen.forEach(p -> System.out.println(p.getFirstName().charAt(0) + ". " + p.getFirstName()));
		personen.forEach(NUR_NACHNAMEN);
		
		
		RandNumber w6 = () -> (int) Math.floor(Math.random() * 6) + 1;
		
//		System.out.println(w6.generate());
//		System.out.println(w6.generate());
//		System.out.println(w6.generate());
//		System.out.println(w6.generate());
//		System.out.println(w6.generate());
//		System.out.println(w6.generate());
//		System.out.println(w6.generate());
		
		RandNumber w100 = () -> (int) Math.floor(Math.random() * 100) + 1;
		
		Random rand = new Random();
		w100 = () -> rand.nextInt(100);
		
		//w100 = () -> new Random().nextInt(100);
		
//		System.out.println(w100.generate());
//		System.out.println(w100.generate());
//		System.out.println(w100.generate());
//		System.out.println(w100.generate());
//		System.out.println(w100.generate());
//		System.out.println(w100.generate());
//		System.out.println(w100.generate());
//		System.out.println(w100.generate());
		
//		for(int i = 0; i < 1_000_000; i++) {
//			System.out.println(w100.generate());
//		}
		
		w100 = () -> FuncInterfaceTest.roll(100);
		w6 = () -> FuncInterfaceTest.roll(6);
		
		showRoll(1000, w6);
		
		System.out.println();
		
		// Streams
		//IntStream.generate(() -> rand.nextInt(100)).forEach(i -> System.out.println(i));
		
		Nix n = () -> {};
		
	}
	
	public static void printOut(String s, Printable p) {
		p.print(s);
	}
	
	public static void list(Collection<String> c, Listable l) {
		l.printElements(c);
	}
	
	public static int roll(int size) {
		return (int) Math.floor(Math.random() * size) + 1;
	}
	
	public static void showRoll(int times, RandNumber r) {
		for(int i = 0; i < times; i++)
			System.out.println(r.generate());
	}
}

@FunctionalInterface
interface Printable {
	
	void print(String s);
	
}

@FunctionalInterface
interface Listable {
	
	void printElements(Collection<String> c);
	
}

@FunctionalInterface
interface Morphable<T> {
	
	T morph(T t);
	
}

@FunctionalInterface
interface RandNumber {
	
	int generate();
	
}

@FunctionalInterface
interface Nix {
	
	void doSomething();
	
}