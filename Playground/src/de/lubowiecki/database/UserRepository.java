package de.lubowiecki.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// CRUD
public class UserRepository {
	
	private static final String TABLE = "users";
	
	/**
	 * Speichert ein User-Objekt als Datensatz in der Datenbank.
	 * Enthält das Objekt eine ID größer als 0 findet eine Update statt.
	 * Anderenfalls ein Insert
	 * @param u
	 * @return
	 * @throws SQLException
	 */
	public boolean save(User u) throws SQLException {
		
		if(u.getId() > 0) {
			return update(u);
		}
		
		return insert(u);
	}
	
	/**
	 * Speichert ein User-Objekt als Datensatz in der Datenbank. Die neu vergebene ID wird in das Objekt geschrieben
	 * @param u
	 * @return
	 * @throws SQLException
	 */
	private boolean insert(User u) throws SQLException {
		
		final String SQL = "INSERT INTO " + TABLE + " (id, firstname, lastname) "
						 + "VALUES(null, '" + u.getFirstname() + "', '" + u.getLastname() + "')";
		
		try(Connection con = DatabaseUtils.getConnection();
				Statement stmt = con.createStatement()) {
			
			if(stmt.executeUpdate(SQL) > 0) {
				
				// Abfrage der zuletzt vergebenen ID
				ResultSet keys = stmt.executeQuery("SELECT last_insert_rowid()");
				if(keys.next()) {
					u.setId(keys.getInt("last_insert_rowid()"));
					return true;
				}
			}
			return false;
		}
	}
	
	/**
	 * Updatet einen User-Datensatz in der Datenbank
	 * @param u
	 * @return
	 * @throws SQLException
	 */
	private boolean update(User u) throws SQLException {
		
		final String SQL = "UPDATE " + TABLE
						 + " SET firstname ='" + u.getFirstname() + "', lastname = '" + u.getLastname() + "' WHERE id = " + u.getId();

		try(Connection con = DatabaseUtils.getConnection();
				Statement stmt = con.createStatement()) {
			
			return stmt.executeUpdate(SQL) > 0;
		}
		
	}
	
	/**
	 * Löscht einen User-Datensatz aus der Datenbank auf Basis eines User-Objekts
	 * @param u
	 * @return
	 * @throws SQLException
	 */
	public boolean delete(User u) throws SQLException {
		return delete(u.getId());
	}
	
	/**
	 * Löscht einen User-Datensatz aus der Datenbank auf Basis einer ID
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public boolean delete(int id) throws SQLException {
		
		final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;
		
		try(Connection con = DatabaseUtils.getConnection();
				Statement stmt = con.createStatement()) {
			
			return stmt.executeUpdate(SQL) > 0;
		}
	}
	
	/**
	 * Fragt alle User Datensätze aus der Datenbank ab und liefrt sie als eine Liste von User-Objekten zurück
	 * Werden keine Datensätze gefunden, wird eine leere Liste zurückgegeben.
	 * @return
	 * @throws SQLException
	 */
	public List<User> find() throws SQLException {
		
		final String SQL = "SELECT * FROM " + TABLE;
		
		List<User> users = new ArrayList<>();
		
		// Verbindung zur DB aufbauen
		try(Connection con = DatabaseUtils.getConnection();
				Statement stmt = con.createStatement()) {
			
			// Relationale-Daten aus der DB abfragen
			ResultSet results = stmt.executeQuery(SQL);
			
			while(results.next()) {
				// Relationale-Daten in User-Objekte verpacken und in eine Liste ablegen
				users.add(create(results));
			}
		}
		
		// Liste mit User-Objekten an den Aufrufer der find-Methode zurückgeben
		return users;
	}
	
	/**
	 * Fragt einen User Datensatz aus der Datenbank ab und diesen als ein User-Objekt zurück
	 * Wird kein passender Datensatz gefunden, wird eine NULL zurückgegeben.
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public User findById(int id) throws SQLException {
		
		final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;
		
		try(Connection con = DatabaseUtils.getConnection();
				Statement stmt = con.createStatement()) {
			
			ResultSet results = stmt.executeQuery(SQL);
			
			if(results.next()) {
				return create(results);
			}
			
			// TODO: statt NULL lieber ein Optional zurückgeben
			return null;
		}
	}
	
	/**
	 * Mappt ein ResultSet auf ein User-Objekt ab
	 * @param result
	 * @return
	 * @throws SQLException
	 */
	private User create(ResultSet result) throws SQLException {
		return new User(result.getInt("id"), result.getString("firstname"), result.getString("lastname"));
	}
}
