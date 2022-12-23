package de.lubowiecki.patterns.decorator;

// Komponente
public interface Printer {
	
	public void setContent(String str);
	
	public String getContent();
	
	public void print();
}
