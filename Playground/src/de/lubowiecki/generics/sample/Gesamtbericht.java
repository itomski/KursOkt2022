package de.lubowiecki.generics.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gesamtbericht<T extends IKosten & IMitarbeiter> {
	
	private List<T> berichte = new ArrayList<>();
	
	public void add(T bericht) {
		berichte.add(bericht);
	}
	
	public void kostenProMitarbeiter() {
		
		Map<String, Double> auswertung = new HashMap<>();
		
		for(T bericht : berichte) {
			
			Double old = auswertung.get(bericht.getMitarbeiterKuerzel());
			
			if(old == null)
				auswertung.put(bericht.getMitarbeiterKuerzel(), bericht.getKosten());
			else
				auswertung.put(bericht.getMitarbeiterKuerzel(), old + bericht.getKosten());
		}
		
		System.out.println(auswertung);
	}
}
