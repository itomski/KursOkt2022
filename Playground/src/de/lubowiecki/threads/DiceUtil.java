package de.lubowiecki.threads;

import java.util.Random;

public class DiceUtil {
	
	private static final Random rand = new Random();
	
	private DiceUtil() {
	}
	
	public static int roll(Dice dice) {
		return rand.nextInt(dice.getPips()) + 1;
	}
}
