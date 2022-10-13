package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.sql.RowSetListener;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1); // Autoboxing von int zu Integer, komplex widening von Integer zu Object
		list.add(10); // Autoboxing von int zu Integer, komplex widening von Integer zu Object
		list.add(100l); // Autoboxing von long zu Long, komplex widening von Long zu Object
		list.add(10.5); // Autoboxing von double zu Double, komplex widening von Double zu Object
		list.add("Hallo Welt"); // komplex widening von String zu Object
		list.add(new Person()); // komplex widening von Person zu Object
		
//		Integer i = (Integer) list.get(2);
//		System.out.println(i);
		
		System.out.println();
		
		// Generische Typen dürfen NUR komplex sein
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(123); // Autoboxing von int zu Integer
		
		byte b = 10;
		//intList.add(b); // Autoboxing von byte zu Byte, komplex widening Byte auf Integer, Error
		intList.add((int)b); // erstmal primitive widening, dann Autoboxing von int zu Integer
		int j = intList.get(1); // Autounboxing
		
		
		System.out.println();
		
		// List arbeitet mit einem Index
		// Elemente sind geordner (nicht sortiert)
		
		// [1][2][3][4][5][6][7][X]
		List<String> strList = new ArrayList<>();
		
		// [1]<->[2]<->[X]<->[3]<->[4]<->[5]<->[6]<->[7]
		strList = new LinkedList<>(strList);
		strList.add("Peter"); // Ans Ende hinzufügen
		strList.add(1, "Carol"); // An gewünschter Position hinzufügen
		
		strList = new ArrayList<>(strList);
		strList.add("Bruce");
		strList.set(2, "Natasha"); // Ersetzen
		
		strList.remove(1); // An gewünschter Position entfernen
		strList.remove("Tony"); // Einen gewünschten Wert entfernen
		
		System.out.println(strList);
		
		for (String name : strList) {
			System.out.println(name);
		}
		
	}

}
