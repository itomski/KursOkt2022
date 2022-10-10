package de.lubowiecki.playground;

public class MethodenTest2 {

	public static void main(String[] args) {

		int w6 = machWas();
		System.out.println(w6);
		
		System.out.println();
		
		int[] w6Liste = machWasAnderes(10);
		for(int erg : w6Liste) {
			System.out.println(erg);
		}

	}
	
	public static int machWas() {
		int erg = /* Zufallswert */ 5;
		return erg;
	}
	
	public static int[] machWasAnderes(int size) {
		int[] erg = new int[size];
		/* Array mit Zufalleswerten befüllen */
		return erg;
	}
}
