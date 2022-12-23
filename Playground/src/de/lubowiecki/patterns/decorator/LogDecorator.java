package de.lubowiecki.patterns.decorator;

import java.util.logging.Logger;

//Decorator
public class LogDecorator extends AbstractDecorator {
	
	private final Logger LOG = Logger. getLogger(LogDecorator.class.getSimpleName());
	
	public LogDecorator(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		LOG.info("info vor dem print");
		printer.print();
		LOG.info("info nach dem print");
	}
}
