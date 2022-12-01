package de.lubowiecki.flowcontrol;

public class ContinueTest {

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			
			if(i < 10 || i > 90)
				continue;
			
			System.out.println("Moin: " + i);
		}
		
		System.out.println();
		
		s1: for(int i = 0; i < 10; i++) {
			s2: for(int j = 0; j < 10; j++) {
				
				if(i == 4)
					break s1;
				
				System.out.print(i + " : " + j + "; ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[] zahlen = {2,5,9,10,22,1,7};
		
		for(int z : zahlen) {
			
			if(z % 2 == 0)
				continue;
				
			System.out.println(z);
		}
		
	}
	
}
