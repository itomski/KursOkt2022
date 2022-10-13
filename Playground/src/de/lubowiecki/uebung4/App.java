package de.lubowiecki.uebung4;

import java.util.Scanner;

// Controller und View
public class App {

	public static void main(String[] args) {
		
		final Scanner scanner = new Scanner(System.in);
		
		final ProductManagement management = new ProductManagement();
		
		while(true) {
			Product p = new Product();
			
			System.out.print("Name: ");
			p.setName(scanner.next());
			
			scanner.nextLine(); // fix
			System.out.print("\nBeschreibung: ");
			p.setDescription(scanner.nextLine());
			
			System.out.print("\nPreis: ");
			p.setPrice(scanner.nextDouble());
			
			management.add(p);
			
			System.out.print("Weiter? [j/n]: ");
			if(scanner.next().trim().equalsIgnoreCase("n")) break; 
		}
		
		System.out.println();
		
		System.out.printf("%-12s | %-20s | %-10s | %s \n", "Name", "Beschreibung", "Seit", "Preis");
		System.out.println("-----------------------------------------------------------------");
		
		for (Product product : management.getAll()) {
			if(product != null) {
				String s = String.format("%-12s | %-20s | %10s | %10.2f EUR \n", 
							product.getName(),
							product.getDescription(),
							product.getCreatedAt(),
							product.getPrice());
				System.out.println(s);
			}

// printf = sofortige Ausgabe auf der Konsole			
//				System.out.printf("%-12s | %-20s | %10s | %10.2f EUR \n", 
//									product.getName(),
//									product.getDescription(),
//									product.getCreatedAt(),
//									product.getPrice());
			
		}
	}
}
