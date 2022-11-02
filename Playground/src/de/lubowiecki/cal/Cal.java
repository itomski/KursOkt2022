package de.lubowiecki.cal;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Cal {
	
	private Map<LocalDate, String> termine = new TreeMap<>();

	public Map<LocalDate, String> getTermine() {
		return termine;
	}

	public void addTermin(LocalDate datum, String titel) {
		this.termine.put(datum, titel);
	}
	
	// Refactoring
	private String getTermineAsString() {
		
		StringBuilder output = new StringBuilder(termine.size() * 30);
		
		for(LocalDate k : termine.keySet()) {
			output.append(k).append(": ").append(termine.get(k));
			output.append("\n");
		}
		
		return output.toString();
	}
	
	@Override
	public String toString() {
		return getTermineAsString();
	}
}
