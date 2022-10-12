package de.lubowiecki.playground;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4}; // Array mit Größe 4 wird erzeugt und befüllt
		
		int[] arr2 = new int[4]; // Array mit Größe 4 wird erzeugt und mit Standardwerten befüllt
		
		int[] arr3; // Deklaration einer Array-Variable, muss vor der Verwendung Initialisiert werden

		int[] a, b, c; // a,b,c sind int[]
		
		int d, e[], f; // d und f sind int, e ist ein int[]
		
		int[] g, h[], i; // g und i sind int[], h ist ein int[][]
		
		int j[][] = new int[3][2];
		
//		{
//			0 : {0,0},
//			1 : {0,0},
//			2 : {0,0}
//		}
		
		j = new int[3][];
		
		j[0] = new int[4];
		j[1] = new int[2];
		j[2] = new int[6];
		
		j[1][1] = 7;
		j[2][4] = 8;
		
		// der Kompiler prüft nur ob ein Index int ist aber nicht ob das Array ausreichend groß ist
		j[0][4] = 1; // ArrayIndexOutOfBoundsException
		
//		{
//			0 : {0,0,0,0},
//			1 : {0,7},
//			2 : {
//					0: 0,
//					1: 0,
//					2: 0,
//					3: 0,
//					4: 8,
//					5: 0
//				}
//		}
		
		
		
		
	}

}
