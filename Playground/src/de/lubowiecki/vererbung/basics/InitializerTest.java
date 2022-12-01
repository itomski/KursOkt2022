package de.lubowiecki.vererbung.basics;

public class InitializerTest {

	public static void main(String[] args) {
		
		Person p = new Manager();
		
		System.out.println();
		
		Manager m = new Manager();
		
		
		// RuntimeException kann IMMMER behandelt werden
		try {
			//...
		}
		catch(RuntimeException e) {
			
		}
		
		// Exception kann IMMMER behandelt werden
		try {
			//...
		}
		catch(Exception e) {
			
		}
		
		// Bei anderen Checked-Exception
		// muss im TRY die Möglichkeit besten, dass eine solche Exception auftauchen kann
//		try {
//			//...
//		}
//		catch(IOException e) { // Error
//			
//		}
		
		int[] arr = {1,2,3,4,5};
		Object o = arr;
		System.out.println(arr instanceof Object);
		
		Double d = 10.0;
		Integer i = 10;
		
		Double d2 = d + i;
		
		System.out.println(((Double)(d + i)).intValue());
		
		
	}

}

class Person {
	
	static {
		System.out.println("S Person");
	}
	
	{
		System.out.println("I Person");
	}
	
	Person() {
		System.out.println("C Person");
	}
}

class Manager extends Person {
	
	static {
		System.out.println("S Manager");
	}
	
	{
		System.out.println("I Manager");
	}
	
	Manager() {
		System.out.println("C Manager");
	}
	
}