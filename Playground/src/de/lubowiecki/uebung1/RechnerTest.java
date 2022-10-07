package de.lubowiecki.uebung1;

import java.util.Scanner;

public class RechnerTest {

	public static void main(String[] args) {
		
		final Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Welche Operation?");
			
			String op = scanner.next();
			
			if(op.equalsIgnoreCase("add")) {
				System.out.println("Zahlen abfragen und addieren");
			}
			else if(op.equalsIgnoreCase("multi")) {
				System.out.println("Zahlen abfragen und multiplizieren");
			}
			else if(op.equalsIgnoreCase("sub")) {
				System.out.println("Zahlen abfragen und sub");
			}
			else if(op.equalsIgnoreCase("div")) {
				System.out.println("Zahlen abfragen und div");
			}
			else if(op.equalsIgnoreCase("exit")) {
				break;
			}
		}
	}

}
