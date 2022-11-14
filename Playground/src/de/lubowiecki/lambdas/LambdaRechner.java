package de.lubowiecki.lambdas;

import java.util.Scanner;

public class LambdaRechner {
	
	private final DoubleOp ADD = (a, b) -> a + b;
	private final DoubleOp SUB = (a, b) -> a - b;
	private final DoubleOp DIV = (a, b) -> a / b;
	private final DoubleOp MULTI = (a, b) -> a * b;
	
	private final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		new LambdaRechner().run();
	}

	private void run() {
		
		System.out.println("Operation: [add/sub/div/multi]: ");
		
		DoubleOp selected = null;
		
		switch(scanner.nextLine().trim().toLowerCase()) {
			
			case "add":
				selected = ADD;
				break;
				
			case "div":
				selected = DIV;
				break;
				
			case "sub":
				selected = SUB;
				break;
				
			case "multi":
				selected = MULTI;
				break;
				
			default:
				System.out.println("Falsche Auswahl");
				System.exit(0);
		}
		
		System.out.print("A: ");
		double a = Double.parseDouble(scanner.nextLine());
		
		System.out.print("\nB: ");
		double b = Double.parseDouble(scanner.nextLine());
		
		System.out.println(selected.doIt(a, b));
		
	}
}
