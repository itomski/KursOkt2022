package de.lubowiecki.playground;

public class KontrollstrukturenTest2 {

	public static void main(String[] args) {
		
		NextWochentag tag = NextWochentag.MO; 
		
		schleife:
		while(true) {
			
			switch(tag) {
			
				case MO:
					System.out.println("MO");
					break;
					
				case DI:
					System.out.println("DI");
					break;
					
				case MI:
					break schleife;	
			
			}
		}
	}

}

enum NextWochentag {
	MO, DI, MI, DO, FR, SA, SO;
}