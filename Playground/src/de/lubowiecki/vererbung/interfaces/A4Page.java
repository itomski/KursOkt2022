package de.lubowiecki.vererbung.interfaces;

public class A4Page implements Printable {
	
	private String content;
	
	public A4Page(String content) {
		this.content = content;
	}
	
	public void print() {
		System.out.println(content);
	}
}
