package de.lubowiecki.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Broker implements Observer {
	
	private final String name;
	
	private final Strategy strategy;
	
	private Action action;
	
	public Broker(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
		this.action = Action.BUY;
	}

	@Override
	public void update(Observable o, Object arg) {
		
		// Reaktion des Beobachters auf Veränderungen an dem zu beobachtenden Objekt
		
		Stock stock = (Stock) o;
		
		switch(strategy) {
		
			case RISKY:
				System.out.println(name + ": Kauft " + stock.getName());
				action = Action.BUY;
				break;
				
			case NORMAL:
				System.out.println(name + ": Hält " + stock.getName());
				action = Action.HOLD;
				break;
				
			case CAREFUL:
				System.out.println(name + ": Verkauft " + stock.getName());
				action = Action.SELL;
				break;	
		
		}
	}
}
