package de.lubowiecki.playground;

public class MethodenReihenfolge {
	
	public static void main(String[] args) {
	
		int erg = operationA(10, operationB(20, operationC(30, 40)));
		
		double erg2 = Math.ceil(Math.floor(10.99) + Math.round(17.55) * operationA(10, 20));
		
	}
	
	public static int operationA(int a, int b) {
		System.out.println("operationA");
		return a + b;
	}
	
	public static int operationB(int a, int b) {
		System.out.println("operationB");
		return a + b;
	}
	
	public static int operationC(int a, int b) {
		System.out.println("operationC");
		return a + b;
	}

}
