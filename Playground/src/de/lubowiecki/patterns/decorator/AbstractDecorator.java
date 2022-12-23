package de.lubowiecki.patterns.decorator;

public abstract class AbstractDecorator implements Printer{

	protected Printer printer;
	
	@Override
	public void setContent(String str) {
		printer.setContent(str);
	}

	@Override
	public String getContent() {
		return printer.getContent();
	}
}
