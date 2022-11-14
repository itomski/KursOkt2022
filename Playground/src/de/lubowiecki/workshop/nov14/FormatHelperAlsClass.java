package de.lubowiecki.workshop.nov14;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatHelperAlsClass {
		
	public static final String TBL_ROW = "| %10s | %12s | %10s |\n";
	
	public static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	
	private FormatHelperAlsClass() {}
	
	
}
