package de.lubowiecki.products;

import java.util.Scanner;

public class App {

	private CrudUserRepository repository;
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		new App().run();
	}

	private void run() {
		
		System.out.print("Eingabe: ");
		String eingabe = scanner.nextLine();
		
		// Controller
		switch(eingabe.trim().toLowerCase()) {
		
			case "l":
				// TODO: anzeigen
				repository.findAll();
				break;
				
			case "s":
				// TODO: anzeigen
				int id = scanner.nextInt();
				repository.find(id); // TODO: anzeigen
				break;
				
			case "c":
				// TODO: daten abfragen
				User u = new User();
				// TODO: mit Settern befüllt
				repository.create(u);
				break;
				
		
		}
	}
}
