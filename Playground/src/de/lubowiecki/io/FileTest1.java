package de.lubowiecki.io;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FileTest1 {

	public static void main(String[] args) {
		
		
		File dir = new File("test");
		File file = new File(dir, "data.txt");
		
		// File file = new File("test/data.txt");
		
		if(!dir.exists()) {
			dir.mkdir(); // Erzeugt ein Vezeichnis
			//dir.mkdirs(); // Erzeugt mehrere Vezeichnisse
		}
		
		File temp = null;
		
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			
			temp = File.createTempFile(".log_", "_" + LocalDateTime.now().toString(), dir);
			
			System.out.println(dir);
			System.out.println("DIR: " + dir.isDirectory());
			System.out.println("FILE: " + dir.isFile());
			
			System.out.println();
			
			System.out.println(file);
			System.out.println("DIR: " + file.isDirectory());
			System.out.println("FILE: " + file.isFile());
			System.out.println("MOD: " + file.lastModified());
			System.out.println("HIDDEN: " + file.isHidden());
			
			System.out.println();
			
			System.out.println(temp);
			System.out.println("DIR: " + temp.isDirectory());
			System.out.println("ABS: " + temp.isAbsolute());
			System.out.println("FILE: " + temp.isFile());
			System.out.println("MOD: " + temp.lastModified());
			System.out.println("HIDDEN: " + temp.isHidden());
			System.out.println("E: " + temp.canExecute());
			System.out.println("R: " + temp.canRead());
			System.out.println("W: " + temp.canWrite());
			
			System.out.println("SPACE: " + temp.getUsableSpace());
			
			//Relativ: test/data.txt (Ausgehend vom Ort, von dem aus das Programm gestartet wird)
			//Absolut: c:\test\data.txt (WIN) (Bleibt immer der gleiche Ort)
			//Absolut: /test/data.txt (UNIX)
			
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.getParent());
			
			System.out.println();
			
			for(String f: dir.list()) {
				System.out.println(f);
			}
			
			temp.deleteOnExit();
			// file.delete(); // Kann für Dateien oder leere Verzeichnisse verwendet werden
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
