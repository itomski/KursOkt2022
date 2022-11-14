package de.lubowiecki.workshop.nov14;

import static de.lubowiecki.workshop.nov14.FormatHelper.TBL_ROW;
import static de.lubowiecki.workshop.nov14.FormatHelper.DATE_FMT;
//import static de.lubowiecki.workshop.nov14.FormatHelperAlsClass.DATE_FMT;

import java.time.LocalDate;

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		System.out.printf(TBL_ROW, "Stadt", "Einwohner", "Bezirke");
		System.out.printf(TBL_ROW, "Hamburg", 1_900_000, 10);
		System.out.printf(TBL_ROW, "Berlin", 3_900_000, 25);
		
		System.out.println(LocalDate.now().format(DATE_FMT));
		
		System.out.println();
		
		System.out.printf(FormatHelperAlsClass.TBL_ROW, "Stadt", "Einwohner", "Bezirke");
		System.out.println(LocalDate.now().format(FormatHelperAlsClass.DATE_FMT));
		//FormatHelperAlsClass fhac = new FormatHelperAlsClass(); // Error: privater Konstruktor
		
	}

}
