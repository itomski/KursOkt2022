package de.lubowiecki.database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Alles in einem
public class MysqlConTest {
	
	private static final String HOST = "localhost";
	private static final int PORT = 8889; // 3306
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String DB_NAME = "testdb";
	private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME;
	
	
	public static void main(String[] args) {
		new MysqlConTest().run();
	}

	private void run() {
		
		try(Connection dbh = createConnection(); Statement stmt = dbh.createStatement()) {
			
			final String SQL = "SELECT * FROM immobilien";
			
			ResultSet results = stmt.executeQuery(SQL);
			
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
	
	public static Connection createConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
