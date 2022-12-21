package de.lubowiecki.wohkshop.dec21;

import java.util.Random;

public class HaushaltsRoboter implements Runnable {
	
	private final Action AUFLADEN = new LadeAktion();
	
	private final String name;
	
	private Random rand = new Random();
	
	public HaushaltsRoboter(String name) {
		this.name = name;
	}
	
	public void runRandAction() {
		getRandomAction().execute();
	}
		
	private Action getRandomAction() {
		
		int selection = rand.nextInt(6) + 1;
		
		switch(selection) {
			case 1: return () -> System.out.println(name + ": Hallo");
			case 2: return () -> System.out.println(name + ": Wäscht dreckige Wäsche");
			case 3: return () -> System.out.println(name + ": Bewegt sich im Haus");
			case 4: return () -> System.out.println(name + ": Saugt die Böden");
			case 5: return () -> System.out.println(name + ": Bügelt die Wäsche");
			case 6: return AUFLADEN;
			default: throw new RuntimeException();
		
		}
	}

	@Override
	public void run() {
		while(true) {
			runRandAction();
			
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
