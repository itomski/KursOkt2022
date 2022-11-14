package de.lubowiecki.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListTest {

	public static void main(String[] args) {
		
		List<Integer> zahlen = new ArrayList<>(Arrays.asList(2,10,1070,25,17,1,99,172,230));
		
		// boolean test(T t);
//		Predicate<Integer> p1 = (z) -> z <= 20;
//		zahlen.removeIf(p1);
//		
//		zahlen.removeIf((butterbrot) -> butterbrot >= 200);
		
		// zahlen.removeIf(Predicate); // Lambda überschreibt die abstrakte Methode (test) des Predicate
		// new Thread(Runnable); // Lambda überschreibt die abstrakte Methode (run) des Runnable
		
		zahlen.removeIf(butterbrot -> {
			System.out.println(butterbrot);
			return false;
		});
		
		//zahlen.removeIf((butterbrot) -> butterbrot <= 20 || butterbrot >= 200);
		
		System.out.println(zahlen);
		
		zahlen.forEach((z) -> System.out.println(z));
		
		MathOp<Double> mo = (a, b) -> a + b;
		System.out.println(mo.run(10.0, 20.0));
		
		//MathOp<Byte> mo2 = (a, b) -> (byte)(a + b);
		
//		mo = (a, b) -> a / b;
//		System.out.println(mo.run(10.0, 20.0));
		
		mo = (a, b) -> a - b;
		mo = (a, b) -> a * b;
		System.out.println();
		
		List<Double> werte = Arrays.asList(10.0, 20.0, 30.0, 22.0, 7.0);
		//System.out.println(runOp(werte, mo));
		//System.out.println(runOp(werte, (a, b) -> b + a + a));
		
		// Die Aktion selbst ist nicht relevant, solange die Eingangs- und Rückgabetypen beachtet werden
		System.out.println(runOp(werte, (a, b) -> 0.0)); 
		
	}
	
	static double runOp(List<Double> zahlen, MathOp<Double> op) {
		
		double val = 0;
		for(Double i : zahlen) {
			val = op.run(val, i);
		}
		
		return val;
	}
}

interface MathOp<T> { // Generische Typen sind immer komplex
	T run(T a, T b);
}

interface IntMathOp {
	int run(int a, int b);
}
