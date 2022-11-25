package de.lubowiecki.localization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MultiLangApp {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.JAPAN);
		Locale lang = Locale.US;
		
		// Reihenfolge
		// _de_DE
		// _de
		// standard auf diesem Rechner
		// Sprachdatei ohne Endung
		// Exception
		ResourceBundle bundle = ResourceBundle.getBundle("de.lubowiecki.localization.labels", lang);
		
		//final NumberFormat NUM_FMT = NumberFormat.getInstance(lang);
		final NumberFormat NUM_FMT = NumberFormat.getCurrencyInstance(lang);
		
		Locale.setDefault(lang);
		DecimalFormat DEC_FMT = new DecimalFormat("###,###.##");
		
		System.out.println(bundle.getString("start"));
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(bundle.getString("name.question"));
		System.out.print(bundle.getString("name.label"));
		String name = s.nextLine();
		System.out.println(bundle.getString("welcome.hi") + " " + name + ". " + bundle.getString("welcome"));
		
		System.out.print(bundle.getString("price.label"));
		String priceStr = s.nextLine();
		
		double price = 0;
		
		try {
			price = NUM_FMT.parse(priceStr).doubleValue();
			System.out.println(NUM_FMT.format(price));
			System.out.println("Inkl. MwSt " + DEC_FMT.format(price * 1.19));
			
			
//			price = DEC_FMT.parse(priceStr).doubleValue();
//			System.out.println(DEC_FMT.format(price));
//			System.out.println("Inkl. MwSt " + DEC_FMT.format(price * 1.19));
		} 
		catch (ParseException e) {
			System.out.println("Ungültige Zahl!");
		}
		
		System.out.println(bundle.getString("end"));
		System.out.println(bundle.getString("txt"));

	}
}
