package de.lubowiecki.playground;

public class DestructorTest {
	
	public static void main(String[] args) {
		
		Thing t1 = new Thing();
		Thing t2 = new Thing(12.3, "Vorschlaghammer");
		Thing t3 = new Thing(0.25, "Tasse");

		// toString: Konvertiert ein Objekt in einen String
		System.out.println(t1); // Bei Ausgabe wird automatisch toString ausgeführt
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println(t3.hashCode());
		
		System.out.println();
		
		String s1 = "Hallo";
		String s2 = new String("Hallo");
		String s3 = new String("Hallo");
		String s4 = new String("Hallo");
		String s5 = new String("Hallo");
		String s6 = new String("Hallo");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
		t1 = null;
		t2 = null;
		t3 = null;
		
		System.gc();
		
	}

}
