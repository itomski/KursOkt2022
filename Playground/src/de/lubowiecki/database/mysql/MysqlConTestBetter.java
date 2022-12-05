package de.lubowiecki.database.mysql;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class MysqlConTestBetter {

	public static void main(String[] args) {
		
		try {
//			ImmobilienRepository repo = new ImmobilienRepository();
//			List<Immobilie> list = repo.getAll("xitel");
			
			ImmobilienService service = new ImmobilienService();
//			
			for(Immobilie i : service.getSortedByTitelDesc()) {
				System.out.println(i.getTitel());
			}
			
//			Immobilie i = repo.getOne(10);
//			System.out.println(i.getTitel());
			
			//Optional<Immobilie> opt = repo.getOne(10);
//			if(opt.isPresent()) 
//				System.out.println(opt.get().getId());
			
			//opt.ifPresent(i -> System.out.println(i.getTitel()));
			
			//opt.ifPresentOrElse(i -> System.out.println(i.getTitel()), () -> System.out.println("Nicht da"));
			
			
//			Immobilie immo = new Immobilie();
//			immo.setTitel("Nette Wohnung");
//			immo.setBeschreibung("Nett aber ziemlich runtergerockt...");
//			immo.setGroesse(100);
//			immo.setPreis(200_000);
//			
//			if(repo.insert(immo)) {
//				System.out.println(immo.getId());
//			}
			
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		// new ImmobilienRepository().showAll();
		
	}

}
