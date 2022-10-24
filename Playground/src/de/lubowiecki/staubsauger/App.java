package de.lubowiecki.staubsauger;

public class App {

	public static void main(String[] args) {
		
		System.out.println("START");
		
		Staubsauger sauger = new Staubsauger();
		
		try {
			sauger.saugen(10);
			System.out.println("Stand: " + sauger.getBeutelInhalt());
			sauger.saugen(20);
			System.out.println("Stand: " + sauger.getBeutelInhalt());
			sauger.saugen(22);
			System.out.println("Stand: " + sauger.getBeutelInhalt());
			sauger.saugen(5);
			System.out.println("Stand: " + sauger.getBeutelInhalt());
		}
		catch(BeutelVollException e) {
			System.out.println("Der Beutel ist voll: " + sauger.getBeutelInhalt());
		}
		
		
		System.out.println("ENDE");
	}
}
