package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class FinalyTest {
	
	public static void main(String[] args) {
		
//		FileInputStream in = null;
//		
//		try {
//			in = new FileInputStream("data.txt");
//			int i = in.read();
//			System.out.println(i);
//		}
//		catch (FileNotFoundException e) {
//			System.out.println("Die Datei ist nicht da.");
//		}
//		catch (IOException e) {
//			System.out.println("Es gibt ein Problem beim Lesen");
//		}
//		catch (Exception e) {
//			System.out.println("Es gibt ein Problem");
//		}
//		finally {
//			if(in != null)
//				try {
//					in.close();
//				} catch (IOException e) {
//					System.out.println("Bereits geschlossen");
//				}
//		}
		
		// Try-With-Resources seit Java 1.7
//		try(FileInputStream in = new FileInputStream("data.txt")) {
//			int i = in.read();
//			System.out.println(i);
//			// Vor dem verlassen des try wird die Resource automatisch geschlossen
//		}
//		catch (FileNotFoundException e) {
//			System.out.println("Die Datei ist nicht da.");
//		}
//		catch (IOException e) {
//			System.out.println("Es gibt ein Problem beim Lesen");
//		}
//		catch (Exception e) {
//			System.out.println("Es gibt ein Problem");
//		}
//		
//		try {
//			System.out.println(readFromFile("dat_a.txt"));
//		} 
//		catch (IOException e) {
//			System.out.println("Probleme");
//		}
		
//		try {
//			writeToDB("Dies und das", "nachrichtensys", "root", "geheim");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(switchButton(true));
		
	}
	
	public static String readFromFile(String name) throws IOException {
		
		FileInputStream in = null;
		
		try {
			System.out.println("TRY");
			in = new FileInputStream(name);
			int i = in.read();
			return i + "";
		}
		finally { // Egal ob eine Exception auftaucht oder nicht, vor dem Verlassen der Methode wird finally ausgeführt
			System.out.println("FINALLY");
			if(in != null)
				try {
					in.close();
				} catch (IOException e) {
					System.out.println("Bereits geschlossen");
				}
		}
	}
	
	public static void writeToDB(String text, String dbName, String dbUser, String dbPassword) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		// Die Resourcen müssen Closable sein d.h. müssen eine close-Methode haben
		try(Connection con = DriverManager.getConnection(url, dbUser, dbPassword);
				Statement stmt = con.createStatement()) {
			
			// SQL
			stmt.execute("INSERT INTO nachrichten (text) VALUES(text = '" + text +"')");

			// Statement und Connection werden beide über ihre close-Methoden automatisch geschlossen
		}
	}
	
	public static String switchButton(boolean an) {
		
		try {
			if(an)
				return "AUS";
			
			else
				return "AN";	
		}
		finally { // Wird immer vor dem Verlassen der Methode ausgeführt
			System.out.println("erledigt");
		}
	}
	
}
