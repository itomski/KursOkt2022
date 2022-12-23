package de.lubowiecki.patterns.observer;

import java.util.Random;

public class ObserverTest {

	public static void main(String[] args) {
		
		Stock aktie1 = new Stock("Tesla", 119.96);
		Stock aktie2 = new Stock("Uniper", 2.81);
		
		Broker b1 = new Broker("Peter", Strategy.CAREFUL);
		Broker b2 = new Broker("Bruce", Strategy.NORMAL);
		Broker b3 = new Broker("Carol", Strategy.RISKY);
		Broker b4 = new Broker("Steve", Strategy.RISKY);
		
		aktie1.addObserver(b1);
		aktie1.addObserver(b2);
		aktie1.addObserver(b3);
		
		aktie2.addObserver(b2);
		aktie2.addObserver(b3);
		aktie2.addObserver(b4);
		
		
		Random rand = new Random();
		
		while(true) {
			aktie1.changePrice(rand.nextDouble(-0.1, 0.1));
			aktie2.changePrice(rand.nextDouble(-0.05, 0.05));
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
