package de.lubowiecki.database.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImmobilienRepository {

	// TODO: Von direker ausgabe auf eine List mit Immobilien-Objekten umstellen
	public void showAll() {
		try(Connection dbh = DatabaseUtils.createConnection(); Statement stmt = dbh.createStatement()) {
					
			final String SQL = "SELECT * FROM immobilien";
			
			ResultSet results = stmt.executeQuery(SQL);
			
			// Auf Liste mit Immonilien umstellen
			while (results.next()) {
				System.out.println(results.getLong("id"));
				System.out.println(results.getString("titel"));
				System.out.println(results.getString("beschreibung"));
				System.out.println(results.getInt("groesse"));
				System.out.println(results.getDouble("preis"));
				System.out.println();
			}
		} 
		catch (SQLException e) {
			System.out.println("Problem beim Verbinden mit der Datenbank: " + e.getMessage());
		}
	}
}
