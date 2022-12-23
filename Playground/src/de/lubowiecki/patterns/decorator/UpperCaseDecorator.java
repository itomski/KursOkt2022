package de.lubowiecki.patterns.decorator;

public class UpperCaseDecorator extends AbstractDecorator {
		
	public UpperCaseDecorator(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		setContent(getContent().toUpperCase());
		printer.print();
	}
}