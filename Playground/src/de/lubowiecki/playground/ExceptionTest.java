package de.lubowiecki.playground;

public class ExceptionTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			arr[-5] = 5;
			System.out.println("<<<<");
		}
		catch(ArrayIndexOutOfBoundsException ex) { // wird nur ausgeführt, wenn eine Exception geworfern wird
			System.out.println("Positionierung ist nicht möglich...");
		}
		
		for (int i : arr) {
			System.out.print(i + ", ");
		}

	}

}
