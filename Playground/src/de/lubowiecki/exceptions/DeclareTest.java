package de.lubowiecki.exceptions;

public class DeclareTest {

	public static void main(String[] args) {
		new DeclareTest().run();
	}

	private void run() {
		System.out.println("start: run");
		try {
			doSomething1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ende: run");
	}
	
	public void doSomething1() throws Exception {
		System.out.println("start: doSomething1");
		doSomething2();
		System.out.println("ende: doSomething1");
	}
	
	public void doSomething2() throws Exception {
		System.out.println("start: doSomething2");
		doSomething3();
		System.out.println("ende: doSomething2");
	}

	public void doSomething3() throws Exception {
		System.out.println("start: doSomething3");
		doSomething4();
		System.out.println("ende: doSomething3");
	}
	
	public void doSomething4() throws Exception {
		System.out.println("start: doSomething4");
		throw new Exception("Es gibt ein Problem");
		//System.out.println("ende: doSomething4");
	}
	
}
