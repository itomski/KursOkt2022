package de.lubowiecki.playground;

import java.util.Objects;

import de.lubowiecki.collections.Todo;

public class KontrollstrukturenTest3 {

	public static void main(String[] args) {
		
		// == < > <= >= != <> !
		
		Object a = new Object();
		Object b = new Object();
		
		String s1 = "Moin";
		String s2 = "Moin Moin";
		
		int i1 = 10;
		int i2 = 20;
		Integer i3 = 30; // Wrapper
		Integer i4 = 40; // Wrapper
				
		if(a == b) { // Referenzvergleich, Ist es das gleiche Objekt auf dem Heap?
			System.out.println("gleich");
		}
		
//		if(a > b) { // Bis auf == und != sind bei Objekten keine andere relationalen Operatoren erlaubt
//			System.out.println("größer");
//		}
		
//		if(s1 > s2) { // Bis auf == und != sind bei Strings keine andere relationalen Operatoren erlaubt
//			System.out.println("größer");
//		}
		
		if(i1 > i2) {
			System.out.println("größer");
		}
		
		if(i1 > i3) { // i3 (Wrapper) wird ausgepackt
			System.out.println("größer");
		}
		
		if(i3 > i4) { // i3 und i4 wird ausgepackt
			System.out.println("größer");
		}
		
		if(i1 == i3) { // i3 (Wrapper) wird ausgepackt und ein Wertevergleich erfolgt
			System.out.println("gleich");
		}
		
		if(i3 == i4) { // Referenzvergleich, ist es das gleiche Objekt
			System.out.println("gleich");
		}
		
		Todo t1 = new Todo("Milch kaufen");
		Todo t2 = new Todo("Milch kaufen");
		Object o3 = new Todo("Milch kaufen");
		
		if(t1 == t2) { // Referenzvergleich, ist es das gleiche Objekt
			System.out.println("gleich");
		}
		
		if(t1.equals(t2)) { // Wertevergleich, haben die Objekte gleichen Inhalt. equals muss überschrieben sein
			System.out.println("gleich");
		}
		
		// instanceof ist für Objekttypen gedacht
		if(o3 instanceof Todo) { // Typ vergleich, ist t1 ein Todo (auf dem Heap)
			System.out.println("ist ein TODO");
		}
		
		Integer i5 = 25;
		Integer i6 = 25;
		// Will man bei Wrappertypen mit Wert arbeiten ist es besser equals und compareTo zu verwenden
		if(i5 == i6) { // Referenzvergleich, Ganz-Zahlenwrapper verwenden in Byte-Umfang (-128 und 127) einen Pool (Byte-Literal-Pool)
			System.out.println("i5 == i6: gleich");
		}

		NextA a1 = new NextC(); // C IS-A A, C ist eine Kindklasse von A
		Object o4 = new NextC(); // C IS-A Object, C ist eine Kindklasse von Object
		
		if(o4 instanceof NextC) {
			System.out.println("o4 ist NextC");
		}
		if(o4 instanceof NextB) {
			System.out.println("o4 ist NextB");
		}
		if(o4 instanceof NextA) {
			System.out.println("o4 ist NextA");
		}
		if(o4 instanceof Object) {
			System.out.println("o4 ist Object");
		}
		
		System.out.println(o4.getClass().getName().equals("de.lubowiecki.playground.NextC"));
		System.out.println(o4.getClass().getSimpleName().equals("NextA"));
		
//		java.util.Date d1 = new java.util.Date();
//		java.sql.Date d2 = new java.sql.Date(2022, 10, 8);
		
		
		t1 = null;
		t2 = new Todo("Milch kaufen");
		
		// & bit-weises UND
		// && logisches UND (Short-Circuit)
		
		if(t1 != null && t1.equals(t2)) {
			System.out.println("gleich");
		}
	}
}

class NextA /* extends Object */ {	
}

class NextB extends NextA {	
}

class NextC extends NextB {
	
	private int zahl;

	@Override
	public int hashCode() {
		return Objects.hash(zahl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		NextC other = (NextC) obj;
		return zahl == other.zahl;
	}
}
