package de.lubowiecki.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class FunctionInterfacesTest {

	public static void main(String[] args) {
		
		// Aufgabe
		// Schreibe und Teste 3 Predicates, 3 Consumer, 3 Supplier und 3 Functions
		
		
		
		// Consumer verarbeitet Werte/Objekte
		
		List<String> namen = Arrays.asList("Peter", "Bruce", "Carol", "Natasha");
		
		//  void accept(T t)
		Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
		Consumer<String> c2 = s -> System.out.println(s.toLowerCase());
		Consumer<String> c3 = s -> System.out.printf("%10s \n", s.toLowerCase());
		
		namen.forEach(c3);
		//namen.forEach(c2.andThen(c1));
		
		System.out.println();
		
		List<Client> kunden = Arrays.asList(new Client("peter", "parker"), new Client("carol", "Danvers"), new Client("Bruce", "Banner"));
		
		kunden.forEach(c -> System.out.println(c.getFirstName().toUpperCase().charAt(0) + ". " + c.getLastName()));
		
		System.out.println();
		
		kunden.forEach(c -> System.out.printf("| %-10s | %-10s | \n", c.getFirstName(), c.getLastName()));

		System.out.println();

		// Ein Eingangsparameter
		Function<Client, String> func = c -> c.getFirstName() + " " + c.getFirstName(); // Typänderung
		
		Function<Client, Client> func3 = c -> { // Änderung des Zustandes/Wertes
			c.setFirstName(c.getFirstName().toUpperCase());
			c.setLastName(c.getLastName().toLowerCase());
			return c;
		};
		
		// Funktion mit einem identischen Typ für Eingabe und Ausgabe
		UnaryOperator<Client> func4 = c -> { // Änderung des Zustandes/Wertes
			c.setFirstName(c.getFirstName().toUpperCase());
			c.setLastName(c.getLastName().toLowerCase());
			return c;
		};
		
		Client c = new Client("Peter", "Parker");
		String str = func.apply(c);
		System.out.println(str);
		
		// Zwei Eingangsparameter
		BiFunction<String, String, Client> func2 = (vorname, nachname) -> new Client(vorname, nachname);
		c = func2.apply("Bruce", "Banner");
		
		System.out.println();
		
		Random rand = new Random();
		IntSupplier randSup = () -> rand.nextInt(6);
		
		// Fabrik
		Supplier<Client> clientSup = () -> {
			final String[] vornamen = {"Peter", "Bruce", "Carol", "Steve", "Tony", "Natasha"};
			final String[] nachnamen = {"Parker", "Banner", "Danvers", "Rogers", "Stark", "Romanov"};
			return new Client(vornamen[randSup.getAsInt()], nachnamen[randSup.getAsInt()]);
		};
		
		Client c4 = clientSup.get();
		System.out.println(c4.getFirstName() + " " + c4.getLastName());
		
		System.out.println();
		
		Stream.generate(clientSup).limit(10).forEach(client -> System.out.printf("| %-10s | %-10s | \n", client.getFirstName(), client.getLastName()));
		
	}
}

class Client {
	
	private String firstName;
	
	private String lastName;

	public Client(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
