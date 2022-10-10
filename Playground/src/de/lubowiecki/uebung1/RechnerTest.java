package de.lubowiecki.uebung1;

import java.util.Scanner;

public class RechnerTest {
	
	public static void main(String[] args) {
		//ohneProtokoll();
		mitProtokoll();
		
	}
	

	private static void ohneProtokoll() {
		
		final Scanner scanner = new Scanner(System.in);
		
		double a;
		double b;
		
		while(true) {
			
			System.out.print("\nOperation: ");
			String op = scanner.next();
			
			if(op.equalsIgnoreCase("exit")) break;
			
			System.out.print("\na: ");
			a = scanner.nextDouble();
			
			System.out.print("\nb: ");
			b = scanner.nextDouble();
			
			if(op.equalsIgnoreCase("add")) {
				System.out.println(Rechner.add(a, b));
			}
			else if(op.equalsIgnoreCase("multi")) {
				System.out.println(Rechner.multi(a, b));
			}
			else if(op.equalsIgnoreCase("sub")) {
				System.out.println(Rechner.sub(a, b));
			}
			else if(op.equalsIgnoreCase("div")) {
				System.out.println(Rechner.div(a, b));
			}
			
		}
		
		System.out.println("\nENDE");
	}
	
	private static void mitProtokoll() {
		
		ProtokollRechner rechner = new ProtokollRechner();
		
		final Scanner scanner = new Scanner(System.in);
		
		double a;
		double b;
		
		while(true) {
			
			System.out.print("\nOperation: ");
			String op = scanner.next();
			
			if(op.equalsIgnoreCase("exit")) break;
			
			else if(op.equalsIgnoreCase("protokoll")) {
				System.out.println(rechner.getProtokoll());
				continue;
			}
			
			System.out.print("\na: ");
			a = scanner.nextDouble();
			
			System.out.print("\nb: ");
			b = scanner.nextDouble();
			
			if(op.equalsIgnoreCase("add")) {
				System.out.println(rechner.add(a, b));
			}
			else if(op.equalsIgnoreCase("multi")) {
				System.out.println(rechner.multi(a, b));
			}
			else if(op.equalsIgnoreCase("sub")) {
				System.out.println(rechner.sub(a, b));
			}
			else if(op.equalsIgnoreCase("div")) {
				System.out.println(rechner.div(a, b));
			}
		}
		
		System.out.println("\nENDE");
	}
}
