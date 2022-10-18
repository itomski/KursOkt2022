package de.lubowiecki.uebung6b;

import java.util.ArrayList;
import java.util.List;

public class Tiergehege {
	
	private List<Sozialisiert> liste = new ArrayList<>();
	
	public void aufnehmen(Sozialisiert obj) {
		liste.add(obj);
	}
	
	public List<Sozialisiert> getListe() {
		return liste;
	}
	
	public void starteFuetterung() {
		for(Sozialisiert s : liste) {
			s.frisst();
		}
	}
	
	public void starteNachtruhe() {
		for(Sozialisiert s : liste) {
			s.schlaeft();
		}
	}
}
