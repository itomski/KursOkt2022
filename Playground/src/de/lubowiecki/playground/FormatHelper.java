package de.lubowiecki.playground;

import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface FormatHelper {
	
	DateTimeFormatter DATE_FML = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	DateTimeFormatter TIME_FML = DateTimeFormatter.ofPattern("HH:mm:ss");
	Logger LOG = Logger.getGlobal();
}
