package de.lubowiecki.playground;

public class LongStaticMethodTest {
	
	public static void main(String[] args) {
		
		long a = 10l;
		long b = 9l;
		
		// Wie Modulo
		System.out.println(Long.remainderUnsigned(a, b)); // Rest
		System.out.println(Long.divideUnsigned(a, b)); // Wie oft passt es rein
		
		Integer i = Integer.decode("011"); // Beachtet andere Zahlensysteme und liefert Integer
		System.out.println(i);
		i = Integer.parseInt("011"); // Verarbeitet nur Dezimal-Schreibweise und liefert ein int. Führende 0 wird ignoriert.
		System.out.println(i);
		
		// 0121 // Oktal -> 17 (0-7) (1 x 64 + 2 x 8 + 1 x 1)
		// 11 // Dezimal -> 11 (1 x 10 + 1 x 1)
		// 0b101 // Binär -> 5 (0 - 1)
		// 0x23 // Hexadezimal -> 36 (0-9abcdef)  (2 x 16 + 1 x 3)
		
		int z = 011; // 9, da Oktal
		
		StringBuilder sb = new StringBuilder(100);
		sb.append("ABCDEFGH");
		sb.setLength(4); // Kürzt NICHT die capacity
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.trimToSize(); // Kürzt die capacity
		System.out.println(sb.capacity());
		
		//System.out.println(sb.charAt(10)); // StringIndexOutOfBoundsException
		System.out.println(sb.charAt(2)); // OK
		
		
	}

}
