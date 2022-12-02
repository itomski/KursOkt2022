package de.lubowiecki.database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
	
	private static final String HOST = "localhost";
	private static final int PORT = 8889; // 3306
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String DB_NAME = "testdb";
	private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME;
	
	
	private DatabaseUtils() {
	}
	
	public static Connection createConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
