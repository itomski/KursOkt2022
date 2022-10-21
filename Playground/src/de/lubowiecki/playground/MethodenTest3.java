package de.lubowiecki.playground;

public class MethodenTest3 {

	public static void main(String[] args) {
		int zahl = 100;
		System.out.println("Main: " + zahl);
		machWas(zahl);
		System.out.println("Main: " + zahl);
		
		System.out.println();
		
		Person p = new Person("Peter", "Parker");
		System.out.println("Main: " + p);
		machWas(p);
		System.out.println("Main: " + p);
		
		System.out.println();
		
		Person p2 = new Person("Peter", "Parker");
		Person p3 = p2;
		
		// p2 und p3 zeigen auf das gleiche Objekt
		
		System.out.println();
		
		String str = "Hallo";
		System.out.println("Main: " + str);
		machWas(str);
		System.out.println("Main: " + str);
		
		System.out.println();
		
		String str2 = "Hallo";
		String str3 = str2;
		System.out.println(str2 == str3);
		str3 = str3.toLowerCase();
		System.out.println(str2.equals(str3));
		System.out.println(str2 == str3);
		
		System.out.println();
		
		Person p4 = new Person("Peter", "Parker");
		Person p5 = p4;
		System.out.println(p4 == p5);
		p4.setLastName("Banner");
		System.out.println(p4.equals(p5));
		System.out.println(p4 == p5);
		
		System.out.println(p4.getFirstName() == p5.getFirstName()); // Referenzvergleich da String
		System.out.println(p4.getFirstName().equals(p5.getFirstName())); // Inhaltsvergleich
		System.out.println(p4.getId() == p5.getId()); // Wertvergleich da int
		
		int[] x = new int[]{1,2,3,4};
		int[] y = new int[]{1,5,8,9};
		
		System.out.println(x[0] == y[0]); // Wertvergleich da int
		System.out.println(x == y); // Referenzvergleich, da Array
		
	}
	
	// primitive Datentypen werden als Kopie weitergegeben
	public static void machWas(int i) {
		System.out.println("Methode: " + i);
		i += 20;
	}
	
	// komplexe Datentypen (Objekte) werden als Referenz weitergegeben
	public static void machWas(Person x) {
		System.out.println("Methode: " + x);
		x.setFirstName("Bruce");
	}
	
	public static void machWas(String s) {
		System.out.println("Methode: " + s);
		s = s.toLowerCase();
	}
}
