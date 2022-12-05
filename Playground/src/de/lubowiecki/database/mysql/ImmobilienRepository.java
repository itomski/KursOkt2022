package de.lubowiecki.database.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Enthält die Datenhaltung
public class ImmobilienRepository {
	
	private static final String TABLE = "immobilien";
	

	public ImmobilienRepository() throws SQLException  {
		createTable();
	}
	
	public boolean insert(Immobilie immo) throws SQLException {
		
		final String SQL = "INSERT INTO " + TABLE + " (id, titel, beschreibung, groesse, preis)"
						 + " VALUES(NULL, ?, ?, ?, ?)";
		
		try(Connection dbh = DatabaseUtils.createConnection(); 
				PreparedStatement stmt = dbh.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {
			
			stmt.setString(1, immo.getTitel());
			stmt.setString(2, immo.getBeschreibung());
			stmt.setInt(3, immo.getGroesse());
			stmt.setDouble(4, immo.getPreis());
			stmt.execute();
			
			ResultSet keys = stmt.getGeneratedKeys();
			if(keys.next()) {
				immo.setId(keys.getLong(1));
				return true;
			}
			
			return false;
		}
	}
	
	public List<Immobilie> getAll(boolean desc, String... cols) throws SQLException {
		
		try(Connection dbh = DatabaseUtils.createConnection(); Statement stmt = dbh.createStatement()) {
			
			String order = "";
			
			if(cols.length > 0) {
				order += " ORDER BY ";
				order += String.join(",", cols);
				order += (desc) ? " DESC" : "";
			}	
				
			final String SQL = "SELECT * FROM " + TABLE + order;
			
			ResultSet results = stmt.executeQuery(SQL);
			
			List<Immobilie> immobilien = new ArrayList<>();
			
			while (results.next()) {
				immobilien.add(create(results));
			}
			
			return immobilien;
		}
	}
	
	public Optional<Immobilie> getOne(long id) throws SQLException {
		
		try(Connection dbh = DatabaseUtils.createConnection(); Statement stmt = dbh.createStatement()) {
					
			final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;
			
			ResultSet results = stmt.executeQuery(SQL);
			
			if(results.next()) {
				return Optional.of(create(results));
			}
			
			return Optional.empty();
		}
	}
	
//	public Immobilie getOne(long id) throws SQLException {
//		
//		try(Connection dbh = DatabaseUtils.createConnection(); Statement stmt = dbh.createStatement()) {
//					
//			final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;
//			
//			ResultSet results = stmt.executeQuery(SQL);
//			
//			if(results.next()) {
//				return create(results);
//			}
//			
//			return null;
//		}
//	}
	
	public boolean createTable() throws SQLException {
		
		try(Connection dbh = DatabaseUtils.createConnection(); Statement stmt = dbh.createStatement()) {
					
			final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " ("
								 + "id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,"
								 + "titel VARCHAR(50),"
								 + "beschreibung TEXT,"
								 + "groesse MEDIUMINT(8) UNSIGNED NOT NULL DEFAULT '0',"
								 + "preis DOUBLE UNSIGNED NOT NULL DEFAULT '0'"
							 + ")";
			
			return stmt.executeUpdate(SQL) > 0;
		}
	}
	
	
	
	public Immobilie create(ResultSet result) throws SQLException {
		
		Immobilie i = new Immobilie();
		i.setId(result.getLong("id"));
		i.setTitel(result.getString("titel"));
		i.setBeschreibung(result.getString("beschreibung"));
		i.setGroesse(result.getInt("groesse"));
		i.setPreis(result.getDouble("preis"));
			
		return i;
		
	}
}
