package de.lubowiecki.playground;

public class OperatorenTest {

	public static void main(String[] args) {
		
		System.out.println(1 + "ABC" + (7 + 2));
		System.out.println(1 + "ABC" + 7 * 2);
		
		int zahl = 10 | 5;
		System.out.println(zahl);
		
		// 00000101 : 5
		// 00001010 : 10
		// 00001111 : 15
		
		int a = 1;
		int b = a++ + ++a + a++; // 1 + 3 + 3
		System.out.println(a); // 4
		System.out.println(b); // 7
		
		// Promotion
		
		a = 1;
		b = 2;
		long c = 10; // primitive widening von int auf long
		long sum = c + a; // a promoviert von int auf long
		
		byte b2 = 10;
		byte b3 = 5;
		int iSum = b2 + b3; // promotion zu int, erg ist daher auch int
		
		char ch = 'x';
		
		// byte < short < int < long < float < double
		//		   char < int	
		
		iSum = ch + b2;
		System.out.println(iSum);
		System.out.println((int) ch);
		
		sum = ch;
	}

}
