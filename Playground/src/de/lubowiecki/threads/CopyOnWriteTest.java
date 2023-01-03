package de.lubowiecki.threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteTest {

	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<>();
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Peter");
		list.add("Carol");
		list.add("Bruce");
		list.add("Natasha");
		list.add("Steve");
		
		for(String s : list) {
			System.out.println(s);
			list.remove(s);
		}
		
		// Führt zum Problem
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			list.remove(i);
//		}
		
		// OK
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			itr.remove();
//		}
		
		
	}

}
