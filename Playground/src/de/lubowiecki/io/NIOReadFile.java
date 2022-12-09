package de.lubowiecki.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NIOReadFile {

	public static void main(String[] args) {
		
		Path p = Paths.get("data", "content.txt");
		
//		try(BufferedReader in = Files.newBufferedReader(p)) {
//			
//			String line;
//			while((line = in.readLine()) != null) {
//				System.out.println(line);
//			}
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// Alle Zeilen werden in den Speicher eingelesen
		try {
			List<String> lines = Files.readAllLines(p);
			lines.removeIf(l -> l.isEmpty());
			for(String l : lines) {
				System.out.println(l);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
//		try {
//			// Verwendet dei Stream-API
//			// Es wird zur Laufzeit nur eine Zeile im Speicher festgehalten
//			//Files.lines(p).skip(3).limit(10).forEach(l -> System.out.println(l));
//			Files.lines(p).forEach(l -> System.out.println(l));
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
