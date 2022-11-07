package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TodoMapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> todos = new TreeMap<>();
		todos.put(10, "Dies und das...");
		todos.put(20, "Dies und das...");
		todos.put(30, "Dies und das...");
		todos.put(9, "Was anderes...");
		System.out.println(todos);
		
		System.out.println(".....");
		
		
		List<OtherTodo> todos2 = new ArrayList<>();
		todos2.add(new OtherTodo("Wäsche waschen"));
		todos2.add(new OtherTodo("Lernen"));
		
		System.out.println(todos2);
		
		System.out.println();
		
		todos2.get(0).setPrio(2);
		Collections.sort(todos2);
		System.out.println(todos2);
		
		
	}

}

class OtherTodo implements Comparable<OtherTodo> {
	
	private String name;
	private int prio;
	
	public OtherTodo(String name) {
		this.name = name;
		prio = 1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

	@Override
	public String toString() {
		return "OtherTodo [name=" + name + ", prio=" + prio + "]";
	}

	@Override
	public int compareTo(OtherTodo other) {
		return prio - other.prio;
	}
}
