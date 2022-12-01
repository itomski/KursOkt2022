package de.lubowiecki.vererbung.basics;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingTest {

	public static void main(String[] args) {
		
		//Abc a = new Cde();
		Abc a = new Fgh();
		
		
		try {
			Integer i = a.doSomething();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}

interface Abc {
	
	// alle Variablen im Interface sind public static final 
	int doSomething() throws IOException; // alle Methoden (ohne Body) sind public abstract
	
}

abstract class Cde implements Abc {

	public abstract int doSomething();
}

class Fgh implements Abc {

	// Bei Runtime-Exceptions wird nicht geprüft
	// Bei Checked Exceptions...
	public final int doSomething() throws FileNotFoundException { // ...Keine, Gleiche oder Kindexception
		return 20;
	}
}
