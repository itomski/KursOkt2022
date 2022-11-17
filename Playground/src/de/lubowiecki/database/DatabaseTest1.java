package de.lubowiecki.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DatabaseTest1 {

	public static void main(String[] args) {
		
		UserRepository repo = new UserRepository();
		try {
			
			// Alle abfragen
//			List<User> users = repo.find();
//			for(User u : users) {
//				System.out.println(u.getFirstname() + " " + u.getLastname());
//			}
			
			// Einen abfragen
			User u = repo.findById(3);
			System.out.println(u.getFirstname() + " " + u.getLastname());
			
		}
		catch (UnsupportedOperationException e) {
			System.out.println("Funktion ist noch nicht eingebaut.");
		}
		catch (Exception e) {
			System.out.println("Probleme: " + e.getMessage());
		}
		
		
		System.exit(0);
		
		
		// Connection con = DriverManager.getConnection(URL)
		// Lädt den passenden Treiber und baut die Verbindung zur DB auf
		
		// Statement stmt = con.createStatement()
		// Bereitet eine Anfrage an die DB vor
		
		// stmt.executeQuery("SELECT * FROM users");
		// Führt die Anfrage an die DB aus
		
//		try(Connection con = DriverManager.getConnection(URL);
//				Statement stmt = con.createStatement()) {
			
			// CRUD
			// Create: INSERT
			// Read: SELECT
			// Update: UPDATE
			// Delete: DELETE
			
			// Insert
//			int num = stmt.executeUpdate("INSERT INTO users (firstname, lastname) VALUES('Steve', 'Rogers')"); // executeUpdate: Für Einfügen, Ändern und Löschen
//			if(num > 0) {
//				System.out.println("Wurde gespeichert...");
//			}
//			else {
//				System.out.println("Wurde NICHT gespeichert...");
//			}
			
			// Delete
//			int num = stmt.executeUpdate("DELETE FROM users WHERE id = 3");
//			if(num > 0) {
//				System.out.println("Wurde gelöscht...");
//			}
//			else {
//				System.out.println("Wurde NICHT gelöscht...");
//			}
			
			// Update
//			int num = stmt.executeUpdate("UPDATE users SET firstname = 'Hans'  WHERE id = 1");
//			if(num > 0) {
//				System.out.println("Wurde geändert...");
//			}
//			else {
//				System.out.println("Wurde NICHT geändert...");
//			}
//			
//			
//			// Select
//			ResultSet results = stmt.executeQuery("SELECT * FROM users"); // executeQuery: Für Abfragen
//			
//			final String ROW = "%10s | %10s | %10s \n";
//			
//			while(results.next()) {
//				System.out.printf(ROW, results.getString("id"), results.getString("firstname"), results.getString("lastname"));
//			}
//		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
}
