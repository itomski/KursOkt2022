package de.lubowiecki.playground;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjectTest {

	public static void main(String[] args) {
		
		Object o = new Object();
		o.equals(o);
		
		List<Integer> al1 = Arrays.asList(1,2,3,4); // fix-size
		List<Integer> al2 = Arrays.asList(1,2,3,4);
		List<Integer> al3 = Arrays.asList(1,2,3,4);
		
		System.out.println(al1.equals(al2));
		System.out.println(al1.equals(null));
		System.out.println(al1.hashCode());
		System.out.println(al2.hashCode());

		System.out.println();
		
		System.out.println(al1.equals(al1));
		
		System.out.println();
		System.out.println(al1.equals(al2));
		System.out.println(al2.equals(al1));
		
		System.out.println();
		System.out.println(al1.equals(al2));
		System.out.println(al2.equals(al3));
		System.out.println(al1.equals(al3));
		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.equals(al);
//		al.hashCode();
	}

}
