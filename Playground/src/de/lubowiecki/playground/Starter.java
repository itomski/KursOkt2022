package de.lubowiecki.playground;

/**
 * Das ist der Einstieg in mein Playground
 * @author Tomasz Lubowiecki
 * @version 1.0
 *
 */
public class Starter {
	
	/**
	 * Hier gehts los...
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte b = 100;
		short s = 100;
		
		b += 100; // b = (byte)(b + 100)
		b++; // b = (byte)(b + 1)
		System.out.println(b);
		
		
		int i = 10;
		long l = i; // primitive Widening
		int j = (int) l; // Cast
		
		//i = true; // boolen ist nicht kompatibel mit int
		
		//s ist eine Referenz
		{
			String s1 = "Moin";
			String s2 = "Moin";
		}
		String s3 = new String("Moin");
		
		
		String s4 = "Hallo";
		Object o = s4; // komplex widening
		s4 = (String) o; // Cast
		
		
	}
}
