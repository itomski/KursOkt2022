package de.lubowiecki.workshop.nov14;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public interface FormatHelper {
	
	// alle Eigenschaften im Interface sind per dafault public static final
	
	String TBL_ROW = "| %10s | %12s | %10s |\n";
	
	DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

}
