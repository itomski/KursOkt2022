package de.lubowiecki.workshop.nov14;

import java.util.HashSet;
import java.util.Set;

public class MusikerVerwaltung {
	
	private Set<Musiker> musiker = new HashSet<>();
	
	public void add(Musiker m) {
		musiker.add(m);
	}
	
	public void musizieren() {
		for(Musiker m : musiker) {
			m.musiziere();
		}
	}
}
