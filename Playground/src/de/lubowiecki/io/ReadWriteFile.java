package de.lubowiecki.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadWriteFile {
	
	private final File DIR = new File("data");
	
	private final File FILE = new File(DIR, "content.txt");
	
	private final File SER_FILE = new File(DIR, "objects.ser");
	

	public static void main(String[] args) {
		
		System.out.println("START");
		
		ReadWriteFile rw = new ReadWriteFile();
		
		try {
			//rw.writeLineToFile("Dies und das");
			//System.out.println(rw.readLinesFromFile());
			
//			List<String> vornamen = new ArrayList<>();
//			vornamen.add("Peter");
//			vornamen.add("Bruce");
//			vornamen.add("Carol");
//			rw.writeObjectToFile(vornamen);
			
			List<String> data = rw.readObjectFromFile();
			System.out.println(data);
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
//		System.out.println(rw.tryTest("..."));
		
//		try {
//			System.out.println(rw.div(-10, 0));
//		}
//		catch (IllegalArgumentException e) {
//			System.out.println("Falsche Eingabe");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Div durch 0");
//		}
		
		System.out.println("ENDE");
	}

	private void writeLineToFile(String line) throws IOException {
		
		if(!DIR.exists())
			DIR.mkdir();
		
		if(!FILE.exists())
			FILE.createNewFile();
		
		try(BufferedWriter out = new BufferedWriter(new FileWriter(FILE, true))) {
			out.append(line); // Erweitert den Inhalt
			out.newLine();
			//out.write(line); // Ersetzt den Inhalt
		}
	}
	
	private String readLinesFromFile() throws FileNotFoundException, IOException {
		
		StringBuilder sb = new StringBuilder();
		
		// BufferedReader ist ein High-Level-Reader, 
		// braucht einen Low-Level (FileReader) als Basis
		try(BufferedReader in = new BufferedReader(new FileReader(FILE))) {
			
			String line = null;
			while((line = in.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
		}
		
		return sb.toString();
	}
	
	
	private List<String> readObjectFromFile() throws ClassNotFoundException, IOException {
		
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(SER_FILE)))) {
			
			List<String> namen = (List<String>) in.readObject();
			return namen;
		}
	}
	
	private void writeObjectToFile(List<String> namen) throws IOException {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(SER_FILE)))) {
			out.writeObject(namen);
		}
	}
	

	private boolean tryTest(String name) {
		try {
			System.out.println("TRY");
			if(name == null)
				throw new IllegalArgumentException();
			
			return true;
		}
		catch(Exception e) {
			System.out.println("CATCH");
			return false;
		}
		finally {
			System.out.println("FINALLY"); // Wird IMMER ausgeführt
		}
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws IllegalArgumentException
	 */
	private int div(int a, int b) throws IllegalArgumentException, ArithmeticException {
		
		if(a < 0 || b < 0)
			throw new IllegalArgumentException("a und b dürfen nicht kleiner als 0 sein");
		
		
		return a / b;
	}
}
