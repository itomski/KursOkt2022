package de.lubowiecki.workshop.dec15;

import java.util.Random;
import java.util.stream.IntStream;

public class Utils {
	
	private static final Random rand = new Random();
	
	private Utils() {
	}
	
	static int[] genZahnArray(int nr) {
		
//		int[] zaehne = new int[32];
//		for(int i = 0; i < zaehne.length;) {
//			zaehne[i] = ++i;
//		}
//		return zaehne;
		
		return IntStream.iterate(1, i -> i + 1).limit(nr).toArray();
	}
	
	static int istKrank(int nr) {
		return rand.nextInt(nr) + 1;
	}
}
