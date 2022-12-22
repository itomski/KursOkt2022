package de.lubowiecki.arrays;

import java.util.Arrays;

public class MultiDimensonTest {

	public static void main(String[] args) {
		
		// Größe eines Arrays wird auf der rechten Seite eingegeben
		int[] arr = new int[10];
		
		// Größe der ersten Dimension muss angegeben werden
		// Größe der zeiten Dimension KANN angegeben werden, MUSS aber nicht
		int[][] arr2 = new int[10][10]; // 10 x Arrays mit Größe von 10
		System.out.println(Arrays.toString(arr2));
		
		arr2 = new int[10][]; // 10 x keine Array, null 
		System.out.println(Arrays.toString(arr2));

		int[][] arr3 = {{0,0},{0,0},{0,0}}; // wie  new int[3][2]
		
		arr3 = new int[][]{{1,2},{3,4},{5,6,7,8},{0,0,10,20,30}};
		
		//System.out.println(arr3[1][2]); // ArrayIndexOutOfBoundsException
		
		System.out.println(arr3[0][1]); // 2
		System.out.println(arr3[3][3]); // 20
		
		int arr4[][][] = {{{0,1,2},{0,1},{7,9,15,22}},{}, {{100,200,300},{500,900,10,22}}};
		
		//System.out.println(arr4[1][1][1]); // ArrayIndexOutOfBoundsException
		System.out.println(arr4[2][1][1]); // 900
		System.out.println(arr4[0][0][1]); // 1
		
		arr4[0][0][1] = 100;
		
		System.out.println();
		
		for(int[][] a : arr4) {
			for(int[] b : a) {
				for(int c : b) {
					System.out.print(c + ", ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
