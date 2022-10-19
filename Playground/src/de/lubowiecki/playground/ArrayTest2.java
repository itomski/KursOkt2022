package de.lubowiecki.playground;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{2,5,7},
				{6,8,10},
				{22,-7,18}
		};
		
		for(int[] zeile : arr) {
			for(int zelle : zeile) {
				System.out.println(zelle);
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		int[] arr2 = new int[2];
		arr2[0] = 10;
		arr2[1] = 15;
		//{10,15}
		
		int[] arr3 = new int[]{10, 15};
		//{10,15}
		
		int[][] arr4 = new int[][]{{10,15}, {18,22}, {11,7}};
		//{10,15}
		
		System.out.println("----------------");
		
		int[] arr5 = new int[10]; // Leeres Array mit 10 Positionen
		wieGross(arr5);
		wieGross(new int[10]);
		
		arr5 = new int[]{10,7,22}; // befülltes Array mit 3 Positionen
		wieGross(arr5);
		wieGross(new int[]{10,7,22});
		
		int[] a1 = genArray();
		
		for(int i : genArray()) {
			System.out.println(i);
		}
		
		int[] pos = new int[10];
		pos = genArray();
		
	}
	
	public static void wieGross(int[] arr) {
		System.out.println(arr.length);
	}
	
	public static int[] genArray() {
//		int[] arr = new int[10]; // Leeres Array mit 10 Positionen
//		return arr;
		
//		return new int[10]; // Leeres Array mit 10 Positionen
		
//		int[] arr = new int[] {10, 15, 22}; // befülltes Array mit 3 Positionen
//		return arr;
		
		return new int[] {10, 15, 22}; // befülltes Array mit 3 Positionen
	}
}
