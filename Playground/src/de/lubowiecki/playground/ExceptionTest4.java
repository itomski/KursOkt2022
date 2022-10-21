package de.lubowiecki.playground;

import java.util.Scanner;

public class ExceptionTest4 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("START");
		
		System.out.print("Eingabe: ");
		
		int alter = scanner.nextInt();
		
//		if(checkAlter(alter)) {
//			System.out.println("OK!");
//		}
//		else {
//			System.out.println("NÖ!");
//		}
//		
//		System.out.println();
		
//		try {
//			Ticket t = createTicket(alter);
//			System.out.println("Hier dein Tiecket!");
//		}
//		catch (IllegalArgumentException e) {
//			System.out.println("Dein Alter passt nicht!");
//		}
		
		try {
			Ticket t = createTicket(alter);
			System.out.println("Hier dein Tiecket!");
		}
		catch (ZuJungException e) {
			System.out.println("Du bist zu jung.");
		}
		catch (ZuAltException e) {
			System.out.println("Du bist zu alt.");
		}
	}
	
	private static boolean checkAlter(int a) {
		if(a < 16 || a > 150)
			return false;
		
		return true;
	}
	
//	private static Ticket createTicket(int a) {
//		if(a < 16 || a > 150)
//			throw new IllegalArgumentException();
//		
//		return new Ticket();
//	}
	
	private static Ticket createTicket(int a) {
		if(a < 16)
			throw new ZuJungException();
		
		if(a > 150)
			throw new ZuAltException();
		
		return new Ticket();
	}
}

class Ticket {
}

class ZuJungException extends RuntimeException {	
}

class ZuAltException extends RuntimeException {	
}


