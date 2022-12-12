package de.lubowiecki.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FinalVarLampdaTest {
	
	public static int sZahl = 100;
	public int iZahl = 200;
	
	
	public static void main(String[] args) {
		
		new FinalVarLampdaTest().run();
		
	}
	
	public void run() {
		
		int lZahl = 300;
		
		// void accept(T t);
		Consumer<Integer> cons = i -> System.out.print(i + ", ");
		cons.accept(1000);
		
		// boolean test(T t);
		Predicate<Integer> pred = i -> i < 100;
		if(pred.negate().test(1000)) {
			System.out.println("Größer wie 100");
		}
		
		List<Integer> zahlen = Arrays.asList(2, 17, 22, 99, 105, 200, 15, 1000, 189, 3, 2, 0, -100);
		
		// stream macht aus einer Liste einen Steram
		zahlen.stream().filter(pred).forEach(cons); // Gibt zahlen aus
		
		System.out.println();
		
		// filter -> werte die false ergeben werden entfernt
		// map -> beschreibt eine änderung am wert oder typ
		// collect -> sammelt das was übrigbleibt zu einer Collection/List
		List<Double> gefilterteZahlen =  zahlen.stream().filter(pred).map(i -> i + 0.0).collect(Collectors.toList());
		System.out.println(gefilterteZahlen);
		
	}
	
//	public void machWas(int i) {
//		return i; // Geht nicht, weil void erwartet wird
//	}
}
