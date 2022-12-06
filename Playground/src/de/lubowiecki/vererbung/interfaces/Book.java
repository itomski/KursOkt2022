package de.lubowiecki.vererbung.interfaces;

public class Book implements Printable {

	private final String title;
	
	private final String content;
	
	public Book(String title, String content) {
		this.title = title;
		this.content = content;
	}

	@Override
	public void print() {
		System.out.println(title + ": " + content);
	}
}
