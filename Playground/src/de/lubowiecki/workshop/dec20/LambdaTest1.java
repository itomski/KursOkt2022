package de.lubowiecki.workshop.dec20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class LambdaTest1 {

	public static void main(String[] args) {
		
		// Basis für Lambdas sind FunctionalInterfaces
		// FunctionalInterfaces: ist ein Interface mit nur einer abstrakten Methode
		// Lambda-Ausdruck ist die dynamische Definition der abstrakten Methode 
		
		// Aufruf einer statischen Methode
		System.out.println(Machbar.verbindeStrings("A", "B"));
		
		Handwerk hw = new Handwerk();
		System.out.println(hw.gibtZufallsString()); // Die implementierte Methode verhält sich IMMER gleich
		// Es gibt keine Möglichkeit das Verhalten der Methode zu ändern
		
		Machbar m = () -> "Das ist mein Text"; // Dynamische Implementierung des Interface, es ist keine Klasse nötig
		System.out.println(m.gibtZufallsString());
		
		
		m = () -> "Das ist mein Text..." + 10;
		System.out.println(m.gibtZufallsString());
		
		// Aus dem Interface gibt es eine Vorgabe für Anzahl und Typen der Parameter und den Rückgabetyp
		m = () -> "Das ist ein Haus von Nikigraus..." + 10 + "...";
		System.out.println(m.gibtZufallsString());
		
		System.out.println();
		
		Calculator c1 = (a, b, c) -> a * b * c;
		
		c1 = (a, b, c) -> (a + b) / c;
		
		System.out.println(c1.op(5, 7, 8));
		
		System.out.println();

		
		List<Integer> zahlen = new ArrayList<>(); // Muss einen Wrappertyp verwenden - Collections können keine primitiven verwenden
		zahlen.add(100);
		zahlen.add(200);
		zahlen.add(10);
		zahlen.add(25);
		zahlen.add(70);
		
		// Mit Klassen
		//zahlen.removeIf(new WennKleinerAls100()); // Was soll entfernt werden?
		//zahlen.removeIf(new WennGroesserAls100()); // Was soll entfernt werden?
		
		// Mit Lambdas
		// Predicate: boolean test(Integer t)
		// Predicate ist nicht unser Interface, sondern es wird von Java bereitgestellt
		//zahlen.removeIf((t) -> t < 100);
		//zahlen.removeIf((t) -> t > 100);
		zahlen.removeIf((t) -> t == 100);
		
		Predicate p;
		
		System.out.println(zahlen);
		
		// Java stellt vorbereitete FunctionalInterfaces zur Verfügung, die man für eigene Lambdas benutzen kann 
		
		// Eingangstyp und Rückgabetyp sind Wrapper Double
		BinaryOperator<Double> op = (d1, d2) -> d1 * d2;
		System.out.println(op.apply(10.0, 20.5));
		//System.out.println(op.apply(10, 20)); // 10 und 20 primitiv, Autoboxing zu Integer, Integer ist kein Double = Error
		
		// Eingangstyp und Rückgabetyp sind primitiver double
		DoubleBinaryOperator dblOp = (i1, i2) -> i1 * i2;
		System.out.println(dblOp.applyAsDouble(10, 20)); // 10 und 20 primitiv, primitiv Widening zu primitiv double
		
	}
}

// Functional Interface
interface Calculator {
	double op(double a, double b, double c);
}

class WennKleinerAls100 implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t < 100;
	}
}

class WennGroesserAls100 implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t > 100;
	}
}


// Jedes mal, wenn die Methode was anderes machen soll, müsste eine neue Klasse mit einer neuen Implementierung geschrieben werden
class Handwerk implements Machbar {

	@Override
	public String gibtZufallsString() {
		// Methode muss ausprogrammiert werden, bevor Objekte von Handwerk gebaut werden können
		return "Tut sein Werk...";
	}
}


interface Machbar {
	
	// absrakte Methode: ist nicht ausprogrammiert
	// Muss später vor der Verwendung überschrieben werden d.h. ausprogrammiert werden
	String gibtZufallsString(); // <---- IST WICHTIG FÜR LAMBDAS
	
	// statische Methoden sind ausprogrammiert - gehören dem Interface
	// Kann nur Konstanten des Interface und Methoden-Parameter verarbeiten
	static String verbindeStrings(String str1, String str2) {
		//return str1.concat(str2); // Ergebnis landet nicht im Pool
		return str1 + str2; // // Ergebnis landet im Pool
	}
	
	// default Methoden sind ausprogrammiert - gehören dem Objekt
	// Muss später vor der Verwendung NICHT überschrieben werden, ist bereits ausprogrammiert
	default String verbindeAndersStrings(String str1, String str2) {
		return str1 + " " + str2;
	}
}
