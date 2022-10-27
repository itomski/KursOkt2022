package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionsTest {
	
	public static void main(String[] args) {
		
//		try {
//			FileInputStream in = new FileInputStream("data.txt");
//			// Exception > IOException > FileNotFoundException
//			int data = in.read();
//			
//		}
//		catch (FileNotFoundException e) {
//			System.out.println("Datei ist nicht da");
//		}
//		catch (IOException e) {
//			System.out.println("Problem beim Lesen");
//		}
		
		
		try {
			System.out.println(readContentFromFile("data_.txt"));
		} 
		catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden...");
		} 
		catch (IOException e) {
			System.out.println("Daten konnten nicht gelesen werden.");
		}
	}
	
	// throws bedeutet der Aufrufer dieser Methode muss sich um die Behandlung kümmern
	public static String readContentFromFile(String filename) throws FileNotFoundException, IOException {
		
		StringBuilder sb = new StringBuilder();
		
		
		FileInputStream in = new FileInputStream(filename);
		
		int i = 0;
		while((i = in.read()) != -1) {
			sb.append((char) i);
		}
		
		return sb.toString();
	}
	
}
