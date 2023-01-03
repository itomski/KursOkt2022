package de.lubowiecki.threads;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinPoolTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		int[] zahlen = new int[1_000_000_000];
		
		// sequenziell
//		Random rand = new Random();
//		for(int i = 0; i < zahlen.length; i++) {
//			zahlen[i] = rand.nextInt(10) + 1;
//		}
		
		ForkJoinPool pool = new ForkJoinPool();
		RandomAction action = new RandomAction(zahlen, 0, zahlen.length - 1);
		pool.execute(action);
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");

	}
}

class RandomAction extends RecursiveAction {
	
	private final int[] arr;
	
	private final int start;
	
	private final int end;
	
	private static final Random rand = new Random();
	
	public RandomAction(int[] arr, int start, int end) {
		this.arr = arr;
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		
		if((end - start) > 1000) { // wenn zu groß
			int middle = start + ((end - start) / 2);
			RandomAction part1 = new RandomAction(arr, start, middle);
			RandomAction part2 = new RandomAction(arr, middle, end);
			
			part1.fork(); // Part1 parallel starten
			part2.compute();
			part1.join(); // Warten bis Part1 fertig ist
		}
		else { // wenn passend
			for(int i = start; i < end; i++) {
				arr[i] = rand.nextInt(10) + 1;
			}
		}
	}
}


