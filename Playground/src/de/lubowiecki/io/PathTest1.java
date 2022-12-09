package de.lubowiecki.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest1 {

	public static void main(String[] args) {
		
		// Relative Pfade
		Path p1 = Paths.get("data", "content.txt");
		Path p2 = Paths.get("."); // aktuelles Verzeichnis
		Path p3 = Paths.get("../../"); // bewegt sich zwei Ordner nach oben

		// Absolut
		Path p4 = Paths.get("/"); // Absoluter Pfad auf UNIX
		Path p5 = Paths.get("C:\\"); // Absoluter Pfad auf WIN
		
		System.out.println("-----------------");
		
		Path p = FileSystems.getDefault().getPath(".");
		System.out.println(p); // relativ
		System.out.println(p.toAbsolutePath()); // absolut
		
		Path d1 = Paths.get("src/de/lubowiecki/io");
		Path d2 = Paths.get(".");
		
		System.out.println(d1.relativize(d2)); // relativer Pfad von d1 zu d2
		System.out.println(d2.relativize(d1)); // relativer Pfad von d2 zu d1
		
		Path f1 = Paths.get("Test.java");
		System.out.println(d1.resolve(f1)); // verbindet 2 Pfade, d1 = Parent, f1 = Child
		System.out.println(d1.resolveSibling(f1)); // verbindet 2 Pfade, d1 = Sibling, f1 = Sibling
		
		System.out.println(d1.getNameCount());
		System.out.println(d1.getName(2));
		System.out.println(d1.getFileName());
		
		Path ap = d1.toAbsolutePath();
		System.out.println(ap.getRoot()); // Unter WIN Laufwerkbuchstabe
		System.out.println(d1.getRoot()); // bei relativen Pfaden eine null
		
		System.out.println();
		
		d1 = Paths.get("src/de/lubowiecki/io");
		d2 = Paths.get("../../moeller");
		
		Path d3 = d1.resolve(d2);
		System.out.println(d3);
		System.out.println(d3.normalize());
		
		System.out.println(d3.normalize().getParent().getParent());
		
		// IO zu NIO
		File f = new File("data.txt"); // relativ
		Path p6 = f.toPath(); // File zu Path
		f = p6.toFile(); // Path zu File
		
		System.out.println(p6);
		System.out.println(p6.toAbsolutePath());
		
		try {
			p6 = p6.toRealPath(); // Prüft, ob Datei verfügbar ist
			System.out.println(p6);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
