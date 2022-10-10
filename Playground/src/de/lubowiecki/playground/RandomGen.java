package de.lubowiecki.playground;

import java.util.Random;

public class RandomGen {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int w6 = rand.nextInt(6) + 1;
		System.out.println(w6);
		
		w6 = (int) Math.floor(Math.random() * 6) + 1;
		System.out.println(w6);
		
	}
}
