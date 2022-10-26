package de.lubowiecki.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import de.lubowiecki.collections.Thing;

public class IOToFileTest {
	
	public static void main(String[] args) {
		
		try {
			//objekteSchreiben();
			objekteLesen();
			//textSchreiben();
			//textLesen();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("ENDE");
	}
	
	public static void objekteLesen() throws IOException, ClassNotFoundException {
		
		// InputStream lesen von Bytes
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("objekte.ser"));
		ObjectInputStream objIn = new ObjectInputStream(in);
		List<Thing> list = (List<Thing>) objIn.readObject(); // Objekt lesen und casten
		System.out.println(list);
	}
	
	public static void objekteSchreiben() throws IOException {
		
		List<Thing> sachen = new ArrayList<>();
		sachen.add(new Thing("Hammer", 10.0));
		sachen.add(new Thing("Zange", 2.5));
		sachen.add(new Thing("Tasse", 0.25));
		
		
		// OutputStream schreiben von Bytes
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("objekte.ser")); // Basiert auf dem FileOutputStream
		
		// serialisiert = Objekte in Text übersetzen
		ObjectOutputStream objOut = new ObjectOutputStream(out); // Objekte werden automatisch serialisiert und geschrieben
		objOut.writeObject(sachen); // die komplette Liste inkl. Inhalt wird serialisiert
		objOut.flush();
	}
	
	
	public static void textLesen() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("text.txt"));
		
		String row;
		while((row = in.readLine()) != null) {
			System.out.println(row);
		}
	}
	
	public static void textSchreiben() throws IOException {
		
			// Writer schreiben von Zeichen
			// Reader lesen von Zeichen
			
			// Ist die Datei beim Schreiben nicht verfügbar, wird es erstellt
			//FileWriter fw = new FileWriter("text.txt"); // Verbindung mit der Datei, Inhalt wird beim Schreiben überschrieben
			FileWriter fw = new FileWriter("text.txt", true); // Datei wird beim Schreiben erweitert
			//fw.write("Hallo"); // Schreibt Zeichen für Zeichen 
			BufferedWriter bw = new BufferedWriter(fw); // Basiert auf dem FileWriter
			bw.write("Das ist das Haus von Nikigraus!"); // Schreibt mehrere Zeichen auf einen Schlag
			bw.newLine(); // Erzeugt einen Zeilenumbruch in der Datei
			bw.flush(); // Schreibt den Inhalt des Puffers auch wenn er noch nicht voll ist
	}
}
