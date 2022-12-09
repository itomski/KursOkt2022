package de.lubowiecki.io;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import java.util.function.BiPredicate;

public class NIOLukeFileWalker {

	public static void main(String[] args) {
		
		Path path = Paths.get("");
		
		// Durchlaufen
//		try {
//			Files.walk(path)
//				//.filter(p -> p.toString().endsWith(".java"))
//				.forEach(p -> System.out.println(p)); // FileVisitOption.FOLLOW_LINKS = SymLinks folgen
//			
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// Suchen
		try {
			// p - die gefundenen Verzeichnisse/Files als Path-Objekte
			// a - Attribute von dem Path-Object
			//BiPredicate<Path, BasicFileAttributes> pred = (p, a) -> a.size() > 10_000;
			
			// System.currentTimeMillis() // liefert die aktuelle Zeit im Millisekunden
			// 1000 * 60 * 60 = 1 Stunde
			// a.lastModifiedTime().to(TimeUnit.MILLISECONDS) // Bearbeitungszeit wird in Millisekunden konvertiert
			
			BiPredicate<Path, BasicFileAttributes> pred = (p, a) -> a.lastModifiedTime().to(TimeUnit.MILLISECONDS) > System.currentTimeMillis() - 1000 * 60 * 60;
			
			// path - Startpunkt für die Suche
			Files.find(path, Integer.MAX_VALUE, pred) // Integer.MAX_VALUE = Tiefe, Bis zur welcher Tiefe im Verzeichnissen gesucht werden soll
				.forEach(p -> System.out.println(p)); // p - die gefundenen Verzeichnisse/Files als Path-Objekte
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
