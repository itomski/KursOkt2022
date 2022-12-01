package de.lubowiecki.flowcontrol;

public class WhileTest {

	public static void main(String[] args) {
		
		// Kopfgesteuert
		int i = 0;
		while(true) {
			if(i > 10)
				break;
			
			System.out.println(++i); // 1 .... 11
		}
		
		System.out.println();
		
		// Fußgesteuert
		i = 0;
		do {
			System.out.println("Moin Moin");
			
			if(++i == 5)
				break;
			
		}
		while(true);

	}

}
