package de.lubowiecki.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocalizationTest {

	public static void main(String[] args) {
		
		Locale l = new Locale("de"); // deutsch
		l = new Locale("de", "DE"); // deutsch für Deutschland
		l = Locale.forLanguageTag("de_DE");
		
		l = Locale.getDefault(); // Wird vom Rechner abgefragt
		
		//Locale.setDefault(Locale.UK);
		
		double zahl = 15200.958765;
		NumberFormat fmt1 = NumberFormat.getInstance(); // Verwendet das Dafault 
		NumberFormat fmt2 = NumberFormat.getInstance(Locale.JAPAN); // Verwendet das vorgegebene Locale
		NumberFormat fmt3 = NumberFormat.getInstance(Locale.FRANCE);
		
		System.out.println(fmt1.format(zahl)); // format:  zahl in String umwandeln
		System.out.println(fmt2.format(zahl));
		System.out.println(fmt3.format(zahl));
	
		try {
			zahl = fmt1.parse("215,99").doubleValue(); // parse: String in Zahl umwandeln
			System.out.println(zahl);
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		Locale.setDefault(Locale.ITALY);
		
		Locale.Builder lb = new Locale.Builder();
		
		Locale locB = lb.setLanguage("de").setRegion("DE").build();
		locB = lb.build();
		locB = lb.build();
		lb.setLanguage("en");
		locB = lb.build();
		
		for(Locale loc : Locale.getAvailableLocales()) {
			//System.out.print(loc.getDisplayLanguage(Locale.FRENCH) + " ");
			System.out.print(loc.getDisplayLanguage() + " ");
			//System.out.print(loc.getDisplayCountry(Locale.FRENCH) + " ");
			System.out.print(loc.getDisplayCountry() + " ");
			//System.out.print(loc.getDisplayScript(Locale.FRENCH) + "\n");
			System.out.print(loc.getDisplayScript() + "\n");
		}
	}

}
