package de.lubowiecki.vererbung2;

public class UpAndDownCastingTest {
	
	public static void main(String[] args) {
		
		Object o = "Hallo"; // Up-Casting
		String s = (String) o; //Down-Casting
		
		// Nach oben: Generalisierung
		// Nach unten: Spezialisierung
		// Object > CharSequence > String
		
		
	}

}
