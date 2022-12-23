package de.lubowiecki.patterns.decorator;

// Erste Implementierung der Komponente
public class BasicPrinter implements Printer {

	private String content;
	
	@Override
	public void print() {
		System.out.println(content);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
