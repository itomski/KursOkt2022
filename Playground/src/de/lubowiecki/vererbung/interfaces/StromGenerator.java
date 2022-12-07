package de.lubowiecki.vererbung.interfaces;

import java.util.ArrayList;
import java.util.List;

public class StromGenerator {
	
	private List<Stecker> verbraucherListe = new ArrayList<>();
	
	public void anschließen(Stecker verbraucher) {
		verbraucherListe.add(verbraucher);
		verbraucher.verbinden();
	}
	
	public void mitStromBeliefern() {
		
		for(Stecker verbraucher : verbraucherListe) {
			verbraucher.beziehtStrom();
		}
	}
	
	public void ausschalten() {
		
		for(Stecker verbraucher : verbraucherListe) {
			verbraucher.verbindungTrennen();
		}
		
		verbraucherListe.clear();
	}
}
