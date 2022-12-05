package de.lubowiecki.database.mysql;

import java.sql.SQLException;
import java.util.List;

// Enthält die Geschäftslogik
public class ImmobilienService {
	
	private ImmobilienRepository repo;
	
	public ImmobilienService() throws SQLException {
		repo = new ImmobilienRepository();
	}
	
	public List<Immobilie> getSortedByTitel() throws SQLException {
		return repo.getAll(false, "titel");
	}
	
	public List<Immobilie> getSortedByGroesse() throws SQLException {
		return repo.getAll(false, "groesse");
	}
	
	public List<Immobilie> getSortedByTitelDesc() throws SQLException {
		return repo.getAll(true, "titel");
	}
	
	public void showAll() throws SQLException {
		
		for(Immobilie i : repo.getAll(false)) {
			System.out.println(i.getId());
			System.out.println(i.getTitel());
			System.out.println(i.getBeschreibung());
			System.out.println(i.getGroesse());
			System.out.println(i.getPreis());
			System.out.println();
		}
	}
}
