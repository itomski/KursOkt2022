package de.lubowiecki.todos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Todo> todos = new ArrayList<>();
		
		todos.add(new Todo("Müll wegbringen"));
		todos.add(new Todo("Wäsche waschen"));
		
		int suche = 2;
		
		for(Todo t : todos) {
			if(t.getId() == suche) {
				System.out.println(t.getTitle() + " gefunden");
			}
		}
		
		if(todos.size() > 0) {
			Todo t = todos.get(0);
			System.out.println(t.getId());
			System.out.println(t.getTitle());
		}
		
		Todo t = null;
		for(Todo inner : todos) {
			t = inner;
			break;
		}
		
		// Geht bei allen Collections
		Iterator<Todo> itr = todos.iterator();
		Todo t2 = null;
		if(itr.hasNext())
			t2 = itr.next();
		
		
		
	}

}
