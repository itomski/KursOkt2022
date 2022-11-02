package de.lubowiecki.playground;

public class ZahlenTest {

	public static void main(String... args) {
		
//		int z1 = Integer.parseInt("808.1");
//		System.out.println(z1);
//		
//		Integer z2 = Integer.valueOf("808.1");
//		System.out.println(z2);
		
		showNumbers("D");
		System.out.println();
		showNumbers("C", 1,7);
		System.out.println();
		showNumbers("B", 1,7,8,99,-12,18);
		System.out.println();
		int[] zahlen = {7,19,22,18,9};
		showNumbers("A",  zahlen);

	}
	
	public static void showNumbers(String s, int... num) {
		// nur wird zu einem array
		
		for(int i : num) {
			System.out.println(i);
		}
	}
}

class A {
	
	A(int i) {
	}
}

class B extends A {
	
	B() {
		super(10);
	}
	
//	void B() { // Kein Konstruktor
//		super(10); // Hier nicht erlaubt
//	}
}
