package de.lubowiecki.todos;

public class Todo {
	
	private static int count;
	
	private int id;
	private String title;
	
	public Todo(String title) {
		id = ++count;
		this.title = title;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + "]";
	}
}
