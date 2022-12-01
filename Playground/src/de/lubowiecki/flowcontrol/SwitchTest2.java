package de.lubowiecki.flowcontrol;

public class SwitchTest2 {

	public static void main(String[] args) {
		
		
		
		int eingabe = 100;
		
		final int c1; // Runtime-Konstante. Kompiler kennt den Typ aber nicht den genauen Wert. Der Wert wird erst zur Laufzeit verwendet
		c1 = 10;
		
		final int c2 = 20; // Kompiletime-Konstante. Kompiler kennt den Typ und Wert der Variable 
		final int c3 = 30;
		
		switch(eingabe) {
			// case c1: System.out.print("A"); break; // Kompiler-Error
			case c2: System.out.print("B"); break;
			case c3: System.out.print("C"); break;
			case c3 + 1: System.out.print("D"); break;
			default: System.out.print("F");
		}
		
		System.out.println();
		
		// boolean b = true; // Kompiler kennt den Typ  aber nicht den genauen Wert 
		
		//final boolean b = true;  // Kompiletime-Konstante. Kompiler kennt den Typ und Wert der Variable
		
		final boolean b; // Runtime-Konstante. Kompiler kennt den Typ aber nicht den genauen Wert. Der Wert wird erst zur Laufzeit verwendet
		b = true;
		
		int exitCount = 0;
		while(b) {
			System.out.println("Schleife");
			if(++exitCount == 10)
				break;
		}
		
		System.out.println("Nach der Schleife");
		
		
		System.out.println();
		
		char[] commands = {'>', '>', 'L', 'L', 'J', '>', '<', 'R', '#'};
		
		for(char command : commands) {
			
			switch(command) {
				case '>': System.out.print("VOR "); break;
				case '<': System.out.print("ZURÜCK "); break;
				case 'J': System.out.print("SPRUNG "); break;
				case 'L': System.out.print("LINKS "); break;
				case 'R': System.out.print("RECHTS "); break;
				default: System.out.print("NICHTS");
			}
		}
	}

}
