package de.lubowiecki.exceptions;

public class ExceptionPropagationTest {

	public static void main(String[] args) throws Exception {
//		try {
			new ExceptionPropagationTest().doSomething1();
//		}
//		catch(Exception e) {
//			System.out.println("gefangen");
//		}
	}
	
	public void doSomething1() throws Exception {
		System.out.println(1);
		doSomething2();
	}
	
	public void doSomething2() throws Exception {
		System.out.println(2);
		doSomething3();
	}
	
	public void doSomething3() throws Exception {
		System.out.println(3);
		doSomething4();
	}
	
	public void doSomething4() throws Exception {
		System.out.println(4);
		doSomething5();
	}
	
	public void doSomething5() throws Exception {
		System.out.println(5);
		throw new Exception("Bla bla bla");
	}

}
