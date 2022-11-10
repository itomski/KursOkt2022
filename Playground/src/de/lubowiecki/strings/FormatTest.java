package de.lubowiecki.strings;

public class FormatTest {

	public static void main(String[] args) {
		
		String s = "Hallo";
		s = s.concat(" Welt");
		
		s = "Hallo Welt";
		
		s = "Hallo";
		
		s = s +  " Welt";
		
		String name = "Peter";
		int alter = 28;
		
		System.out.println("Hallo, mein Name ist " + name + " und ich bin " + alter + " Jahre alt.");
		
		// %s = String
		// %d = Dezimal (byte, short, int, long)
		// %f = Floatingpoint
		// %b = boolean
		// %n = New Line
		
		// Ausgabe in der Konsole
		System.out.printf("Hallo, mein Name ist %s und ich bin %d Jahre alt.%n", name, alter);
		
		// Keine Ausgabe auf der Konsole
		// Ferziger String ist die Rückgabe der Methode
		String str = String.format("Hallo, mein Name ist %s und ich bin %d Jahre alt.%n", name, alter);
		
		System.out.printf("Ganzzahl: %d \n", 123);
		System.out.printf("Floatingpoint: %f \n", 123.0);
		System.out.printf("Hex: %x \n", 123);
		System.out.printf("char: %c \n", 'x');

		System.out.printf("Ganzzahl: %20d* \n", 1234567890); // 20 Stellen werden für die Zahl reserviert, rechts orientiert
		System.out.printf("Ganzzahl: %-20d* \n", 1234567890); // 20 Stellen werden für die Zahl reserviert, links orientiert
		System.out.printf("Ganzzahl: %020d* \n", 1234567890); // 20 Stellen werden für die Zahl reserviert, rechts, mit 0 aufgefüllt
		
		// Beim Nachkommastelle wird die Schreibweise des Landes verwendet. Java ermittelt es vom Betriebssystem
		System.out.printf("Ganzzahl: %20f* \n", 123.54321); // 20 Stellen werden für die Zahl reserviert, rechts
		
		System.out.printf("Fließkommazahl: %20.2f * \n", 123.5);
		System.out.printf("Fließkommazahl: %f * \n", 123.59743000123);
		System.out.printf("Fließkommazahl: %e * \n", 123.59743);
		
		// Änderung der Position
		System.out.printf("%2$s %4$s %1$s %3$s", 1, 2, 3, 4);
		
		System.out.println();
		
		String row = "| %-10s | %10s | %10s | %10s | %15s |\n";
		System.out.printf(row, "Vorname", "Nachname", "Alter", "Stadt", "Held");
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf(row, "Peter", "Parker", "35", "New York", "Spiderman");
		System.out.printf(row, "Bruce", "Banner", "45", "New York", "Hulk");
		System.out.printf(row, "Carol", "Danvers", "32", "New York", "Cap. Marvel");
		
		
	}
}
