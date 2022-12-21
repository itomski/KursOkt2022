package de.lubowiecki.threads;

public class Hunderennen {

	public static void main(String[] args) {
		
		final String namen[] = {"Peter", "Bruce", "Carol", "Steve"};
		final int STRECKE = 1000;
		
		for(String name : namen) {
			new Thread(new Hund(name, STRECKE)).start();
		}
	}
}
