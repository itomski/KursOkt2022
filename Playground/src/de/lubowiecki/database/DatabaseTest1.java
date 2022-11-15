package de.lubowiecki.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest1 {

	private static final String URL = "jdbc:sqlite:data.db";
	
	
	public static void main(String[] args) {
		
		// Connection con = DriverManager.getConnection(URL)
		// Lädt den passenden Treiber und baut die Verbindung zur DB auf
		
		// Statement stmt = con.createStatement()
		// Bereitet eine Anfrage an die DB vor
		
		// stmt.executeQuery("SELECT * FROM users");
		// Führt die Anfrage an die DB aus
		
		try(Connection con = DriverManager.getConnection(URL);
				Statement stmt = con.createStatement()) {
			
			ResultSet results = stmt.executeQuery("SELECT * FROM users");
			
			// id, vorname, nachname, email, passwort
			// 1, Peter, Parker, p.parker@abc.de, geheim
			// 2, Carol, Danvers, c.danvers@abc.de, geheim123
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
