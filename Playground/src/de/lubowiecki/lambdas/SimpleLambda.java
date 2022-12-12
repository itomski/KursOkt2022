package de.lubowiecki.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SimpleLambda {
	
	public static void main(String[] args) {
		
		// Ab Java 8
		// Baut eine Anonyme Klasse und überschreibt die exec-Methode
		MathOperation add = (a, b) -> a + b;
		MathOperation multi = (a, b) -> a * b;
		MathOperation div = (x, y) -> x / y;
		
		double erg = add.exec(100, 200);
		erg = multi.exec(100, 200);
		erg = div.exec(100, 200);
		
		// Vor Java 8
		// Anonyme Klasse überschreibt exec und wird instanziert
		MathOperation sub = new MathOperation() {
			
			public double exec(double a, double b) {
				return a - b;
			}
		};
		
		erg = sub.exec(100, 200);
		
		// Um einen Lambdaausdruck zu schreiben bracht es ein Interface mit einer einzigen abstrakten Methode
		// Java bring eine Reihe vorbereiteter Interfaces mit, die man verwenden kann
		
		
		Converter<String, Integer> strToInteger = s -> {
			
			try {
				return Integer.parseInt(s);
			}
			catch(Exception e) {
				return 0;
			}
		};
		
		int zahl = strToInteger.exec("1275xyx");
		
		// Ein von Java bereitgestelltes FunctionalInterface
		Function<String, Integer> func = s -> {
			
			try {
				return Integer.parseInt(s);
			}
			catch(Exception e) {
				return 0;
			}
		};
		
		zahl = func.apply("1275xyx");
		
		BinaryOperator<Double> nextAdd = (a, b) -> a + b;
		erg = nextAdd.apply(100.0, 200.0);
		
		
		// Bis Java 8
		List<String> namen = new ArrayList<>(Arrays.asList("Peter", "Bruce", "Steve", "Carol"));
		
		// Ab Java 9
		//namen = List.of("Peter", "Bruce", "Steve", "Carol");
		
		// Arbeitet mit einem Predicate
		// Predicate ist ein Build-In-Functional-Interface
		// Alle uild-In-Functional-Interfaces liegen in java.util.function 
		
		// Predicate: boolean test(T t);
		Predicate<String> p = (s) -> s.startsWith("S");
		namen.removeIf(p);
		//namen.removeIf(s -> s.startsWith("S"));
		
		// Consumer: void accept(T t);
		Consumer<String> c = s -> System.out.println(s);
		Object o = c;
		
		namen.forEach(c);
		//namen.forEach(s -> System.out.println(s));
		
		
	}
}

@FunctionalInterface // optionale Angabe - prüft ob das Interface nur eine abstrakte Methode hat
interface MathOperation {
	
	double exec(double a, double b);
	
	// double otherExec(double a, double b); // im einem FunctionalInterface nur eine abstrakte Methode erlaubt
	
}

@FunctionalInterface
interface Converter<T, R> {
	
	R exec(T in);
	
}
