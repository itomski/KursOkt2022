package de.lubowiecki.database.mysql;

public class MysqlConTestBetter {

	public static void main(String[] args) {
		
		ImmobilienRepository repo = new ImmobilienRepository();
		repo.showAll();
		
		// new ImmobilienRepository().showAll();
		
	}

}
