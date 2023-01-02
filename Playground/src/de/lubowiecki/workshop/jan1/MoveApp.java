package de.lubowiecki.workshop.jan1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MoveApp {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		List<Person> personen = new ArrayList<>();
		
		personen.add(new Person("Peter", 10, 15));
		personen.add(new Person("Carol", 18, 32));
		personen.add(new Person("Bruce", 25, 11));
		personen.add(new Person("Natasha", 0, 0));
		
		for(Person p : personen) {
			service.execute(p);
		}
		
		app: while(true) {
			
			switch(scanner.nextLine().trim().toUpperCase()) {
				case "P": break;
				
				case "X":
					for(Person p : personen) {
						p.setTarget(10, 10);
					}
					break;
					
				case "Y":
					for(Person p : personen) {
						p.setTarget(0, 0);
					}
					break;
					
				case "Z":
					for(Person p : personen) {
						p.setTarget(20, 20);
					}
					break;	
				
				case "Q": break app;
			}
		}
		
		service.shutdownNow();
	}
}
