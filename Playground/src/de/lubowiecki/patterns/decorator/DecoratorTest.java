package de.lubowiecki.patterns.decorator;

public class DecoratorTest {
	
	public static void main(String[] args) {
		
		//Printer p = new UpperCaseDecorator(new LogDecorator(new BasicPrinter()));
		//Printer p = new BasicPrinter();
		Printer p = new UpperCaseDecorator(new BasicPrinter());
		
		p.setContent("Das ist das Haus von Nikigraus");
		p.print();
		
	}
}