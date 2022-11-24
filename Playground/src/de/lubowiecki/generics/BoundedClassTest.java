package de.lubowiecki.generics;

public class BoundedClassTest {

	public static void main(String[] args) {
		
		BoundedClass<Byte> bc1 = new BoundedClass<>();
		byte x = 10;
		byte y = 20;
		System.out.println(bc1.add(x, y));
		
		BoundedClass<Double> bc2 = new BoundedClass<>();
		System.out.println(bc2.add(10.0, 20.0));
		
//		BoundedClass<String> bc3 = new BoundedClass<>();
//		System.out.println(bc3.add("10", "20"));
		
		BoundedClass2<String> bc = new BoundedClass2();
		System.out.println(bc.append("Hallo"));
		System.out.println(bc.append(" Hallo"));

	}
}

// Ist ein Bound vorhanden wird beim generischen Typ nicht mehr von Object ausgegangen
// sondern von mind. der Typ des Bounds

class BoundedClass<T extends Number> { // Als generische Typen sind nur Typen erlaubt, die Number extenden
	
	public double add(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}
}

class BoundedClass2<T extends CharSequence> { // Als generische Typen sind nur Typen erlaubt, die CharSequence implementieren
	
	private T value;
	
	public String append(T value) {
		if(this.value == null)
			this.value = value;
		else	
			this.value = (T) this.value.toString().concat(value.toString());
		
		return this.value.toString();
	}
}
