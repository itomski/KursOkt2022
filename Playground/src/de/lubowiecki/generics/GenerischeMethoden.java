package de.lubowiecki.generics;

import java.util.Arrays;
import java.util.List;

public class GenerischeMethoden<T> {

	public static void main(String[] args) {
		
		new GenerischeMethoden<String>().run();

	}

	private void run() {
		
		String s1 = machWas("Hallo");
		
		Integer s2 = machWas(123);
		
		List<Integer> iList = Arrays.asList(1,2,3,4,5,10,22);
		Object[] objects = iList.toArray();
		
		Integer[] zahlen = iList.toArray(new Integer[]{});
		
	}
	
	private <T> T machWas(T a) { // T ergibt sich aus dem Eingangsparameter
		return a;
	}
}
