package de.lubowiecki.playground;

public class StackUndHeapTest {

	public static void main(String[] args) {
		
		int i = 10;
		
		String s1 = "Moin";
		String s2 = "Moin";
		
		machWas();
		
		String s3 = s2; // Objekte werden per Referenz weitergegeben/verlinkt
		
		s2 = "Tach auch";
		s3 = s2;
		s1 = null;
		
		int j = i; // primitive Datentypen werden per Kopie weitergegeben
		

	}
	
	public static void machWas() {
		
		String s1 = "Xyz";
		String s2 = "Abc";

	}

}
