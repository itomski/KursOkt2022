package de.lubowiecki.kaffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KaffeeAutomat {
	
	private static final double PREIS = 1.20; // Klassenvariable
	
	private List<Muenze> muenzen = new ArrayList<>();
	
	private Logger logger;
	
	{ // Initializer = wird direkt vor dem Konstruktor ausgeführt
		logger  = Logger.getLogger(getClass().getName());
		logger.setLevel(Level.OFF);
	}
	
	public void geldEinwerfen(Muenze geld) {
		muenzen.add(geld);
		logger.log(Level.INFO, muenzen.toString());
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
		
		double einzahlung = getSummeGeld();
		if(einzahlung >= PREIS) {
			double rest = einzahlung - PREIS;
			muenzen = geldWechseln(rest);
			return true;
		}
		return false; // Münzen in Münzfach werden nicht verändert
	}
		
	private List<Muenze> geldWechseln(double wert) {
		
		List<Muenze> wechselGeld = new ArrayList();
		
		int anzahl = (int)(wert / 2.0);
		while(anzahl > 0) {
			wechselGeld.add(Muenze.get2Eur());
			anzahl--;
		}
		wert = wertRichtigRunden(wert % 2.0);
		
		anzahl = (int)(wert / 1.0);
		while(anzahl > 0) {
			wechselGeld.add(Muenze.get1Eur());
			anzahl--;
		}
		wert = wertRichtigRunden(wert % 1.0);
		
		anzahl = (int)(wert / 0.5);
		while(anzahl > 0) {
			wechselGeld.add(Muenze.get50Cent());
			anzahl--;
		}
		wert = wertRichtigRunden(wert % 0.5);
		
		anzahl = (int)(wert / 0.2);
		while(anzahl > 0) {
			wechselGeld.add(Muenze.get20Cent());
			anzahl--;
		}
		wert = wertRichtigRunden(wert % 0.2);
		
		anzahl = (int)(wert / 0.1);
		while(anzahl > 0) {
			wechselGeld.add(Muenze.get10Cent());
			anzahl--;
		}
		wert = wertRichtigRunden(wert % 0.1);
		
		logger.info(wechselGeld.toString());
		
		return wechselGeld;
	}
	
	private double wertRichtigRunden(double wert) {
		String zahlAlsString = String.format(Locale.ENGLISH, "%.2f", wert);
		return Double.parseDouble(zahlAlsString);
	}
	
	public List<Muenze> geldRueckgabe() {
		List<Muenze> rueckgabe = new ArrayList<>(muenzen);
		muenzen.clear(); // Leert eine Liste
		logger.info(muenzen.toString()); // Verwendet automatisch Level.INFO
		return rueckgabe;
	}
}
