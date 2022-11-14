package de.lubowiecki.lambdas;

// FunctionalInterfaces MÜSSEN Interfaces sein

@FunctionalInterface // Prüft die Anforderungen eines FunctionalInterface
// Es muss ein SAM (single abstract method) sein
public interface Machbar {
	
	void machWas();

}