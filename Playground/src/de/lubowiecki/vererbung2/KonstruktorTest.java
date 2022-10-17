package de.lubowiecki.vererbung2;

public class KonstruktorTest {

	public static void main(String[] args) {
		
		A a = new B(); // Jedes B ist auch ein A
		//A a = new A(); // Jedes B ist auch ein A
		B b = (B)a; // Nicht jedes A ist automatisch ein B
		System.out.println("OK");
		
		System.out.println();
		
		Mensch m = new Student(); // Jeder Student IS-A Mensch
		//Student s = m; // Error: Nicht jeder Mensch ist ein Student - Aber einige
		Student s = (Student)m; // Ein Cast ist nötig. Ist m auf dem Heap kein Student gibt's eine ClassCastException

	}
}

class A {
	
}

class B extends A {
	
}

class Mensch {
	
	// Stellt man einen eigenen Konstruktor bereit, wird kein default Konstruktor mehr von Java bereitgestellt
	public Mensch(int alter) { // C1
		super(); // Verwendet den parameterlosen Konstruktor von Object
	}
	
	public Mensch() {
	}
}

// Konstruktoren werden NICHT vererbt!!!!

class Student extends Mensch {
	
//	public Student() { // C2
//		super(); // Verwendet C1
//	}
}
