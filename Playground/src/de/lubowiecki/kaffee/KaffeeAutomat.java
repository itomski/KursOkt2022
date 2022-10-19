package de.lubowiecki.kaffee;

import java.util.ArrayList;
import java.util.List;

public class KaffeeAutomat {
	
	private double summeGeld; // Instanzvariable
	
	private static final double PREIS = 1.20; // Klassenvariable
	
	private List<Muenze> muenzen = new ArrayList<>();
	
	public void geldEinwerfen(Muenze geld) {
		//summeGeld += geld.getWert();
		muenzen.add(geld);
	}
	
	public double getSummeGeld() {
		
		double summe = 0;
		
		// m ist die aktuelle Münze
		// muenzen ist die Sammlung aller Münzen
		for(Muenze m : muenzen) {
			summe += m.getWert();
		}
		return summe;
	}
	
	public boolean kaffeeAnfordern() {
		// TODO: richtig verbuchen ggfl. Münzen wechseln
		if(summeGeld >= PREIS) {
			summeGeld -= PREIS;
			return true;
		}
		return false;
	}
	
//	public boolean geldRueckgabe() {
//		// TODO: Weitere Münzenwerte definieren
//		if(summeGeld == 0) {
//			return false;
//		}
//		summeGeld = 0;
//		return true;
//	}
	
	public List<Muenze> geldRueckgabe() {
		List<Muenze> rueckgabe = new ArrayList<>(muenzen);
		muenzen.clear(); // Leert eine Liste
		return rueckgabe;
	}
}
