package de.lubowiecki.vererbung.interfaces;

public class TestPrinter {

	public static void main(String[] args) {
		
		A4Page p1 = new A4Page("Das ist das Haus von Nikigraus");
		A4Page p2 = new A4Page("Ich hatte ein Haus in Afrika...");
		A4Page p3 = new A4Page("Als Gregor Samsa eines Morgens aus unruhigen Träumen erwachte...");
		
		LaserPrinter printer = new LaserPrinter();
		
		printer.addJobs(p1, p2, p3);
		
		printer.addJobs(new Book("Kochen ohne Fett", "...")); // Error: ist keine A4Page
		
		// Zukünftig muss nicht immer der Printer angepasst werden,
		// sondern Objekte, die gedückt werden sollen müssen das Interface Printable implementieren
		
	}
}
