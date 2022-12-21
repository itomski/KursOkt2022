package de.lubowiecki.threads;

import java.util.ArrayList;
import java.util.List;

public class GameLoop {
	
	public static void main(String[] args) {
		
		final int STRECKE = 1000;
		List<LoopHund> hunde = new ArrayList<>();
		
		hunde.add(new LoopHund("Peter", STRECKE));
		hunde.add(new LoopHund("Bruce", STRECKE));
		hunde.add(new LoopHund("Carol", STRECKE));
		hunde.add(new LoopHund("Steve", STRECKE));
		
		while(true) {
			
			for(LoopHund hund : hunde)
				hund.move();
			
			try {
				Thread.sleep(10);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
