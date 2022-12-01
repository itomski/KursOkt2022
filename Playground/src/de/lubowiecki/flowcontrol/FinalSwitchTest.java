package de.lubowiecki.flowcontrol;

public class FinalSwitchTest {

	public static void main(String[] args) {
		
		final int zahl = 100;
		
		final int z1 = 10;
		final int z2 = 20;
		
		
		switch(zahl) {
			case 10: System.out.println("A"); break; 
			case 15 + 0: System.out.println("B"); break; 
			case z1 + z2 * 200: System.out.println("C"); break;
		}
		
//		while(true) {
//			continue;
//			System.out.println();
//		}
		
	}
	
//	public void machWas(final int i) {
//	}

}
