package de.lubowiecki.playground;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest2 {

	static int alter = 0; 
	
	public static void main(String[] args) {
		
		String s = "Das ist ein Haus von Nikigraus";
//		s = null;
//		System.out.println(s.indexOf("N")); // Bei einer Exception wird die Ausführung sofort abgebrochen
//		System.out.println("ENDE");
		
		try {
			s = null;
			// Hier wird eine Unchecked-Exception geworfen
			System.out.println(s.indexOf("N")); // Bei einer Exception wird der try-Block sofort abgebrochen
			System.out.println("ENDE1");
		}
		catch(Exception ex) { // Fängt eine geworfene Exception
			System.out.println("s ist null!");
			System.out.println(ex.getMessage());
		}
		
		try {
			// Checked-Exception
			FileReader fr = new FileReader("data.txt");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// RuntimeExceptions (Unchecked)
			// NullPointerException
			// ArrayIndexOutOfBoundsException
			// NegativeArraySizeException
			// UnsupportedOperationException
			// IllegalArgumentException
		
		// Checked-Exceptions
		// IOException
		// SQLException
		
		System.out.println("ENDE2");
		
		try {
			setAlter(100);
		}
		catch (Exception e) {
			System.out.println("Eingabe nicht passend");
		}
		
		System.out.println();
		
		try {
			String inhalt = getFileContent("data.txt");
			System.out.println(inhalt);
		} 
		catch (FileNotFoundException e) {
			System.out.println("Datei ist nicht da.");
		} 
		catch (IOException e) {
			System.out.println("Es gibt ein Problem beim Lesen");
		}
		
	}
	
	public static void setAlter(int alter) {
		
		if(alter < 0 || alter > 150)
			throw new IllegalArgumentException(); // Exception wird geworfen
		
		// sonst Zuweisung
		ExceptionTest2.alter = alter;
	}
	
	// throws = Methode wird als gefährlich markiert 
	// d.h. der Verwender dieser Methode ist für die Behandlung verantwortlich
	public static String getFileContent(String filename) throws IOException, FileNotFoundException {
		
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		
		StringBuilder content = new StringBuilder();
		
		String line = null;
		while((line = reader.readLine()) != null) {
			content.append(line);
			content.append("\n");
		}
		
		return content.toString();
		
		// behandeln
//		try {
//			FileReader reader = new FileReader(filename);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	
}
