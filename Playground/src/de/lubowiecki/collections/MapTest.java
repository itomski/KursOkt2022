package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		// Alle Collections:
		// Veränderbar (löschen, einfügen, verändern, ersetzen)
		// Generisch (darf nicht primitiv sein)
		
		// Arbeiten mit ein Index
		// Sind geordnet (Einfügereihenfolge)
		// Wahlfreienzugriff über den Index
		List<String> list = new ArrayList<>();
		list.add("Peter");
		
		// Map
		    // key  // value
		Map<String, Integer> einwohner = new HashMap<>();
		einwohner.put("Hamburg", 1_900_000);
		einwohner.put("Berlin", 3_700_000);
		einwohner.put("Kiel", 350_000);
		einwohner.put("München", 1_600_000);
		einwohner.put("Kiel", 600_000); // Wenn key vorhanden, wird der Wert geändert
		
		//System.out.println(einwohner.get("Hamburg"));
		System.out.println(einwohner);
		
		System.out.println(einwohner.get("Plön"));
		System.out.println(einwohner.getOrDefault("Plön", -1));
		System.out.println(einwohner.getOrDefault("Hamburg", -1));
		
		einwohner.putIfAbsent("Kiel", 200_000); // wird nur hinzugefügt, wenn noch nicht vorhanden
		System.out.println(einwohner);
		
		System.out.println();
		
		kücheAufräumen("Peter");
		
		System.out.println();
		
		kücheAufräumen("Bruce");
		
		System.out.println();
		
		kücheAufräumen("Natasha");
		
	}
	
	public static Map<String, String> machWas() {
		Map<String, String> namen = new HashMap<>();
		namen.put("Spriderman", "Peter Parker");
		namen.put("Black Widow", "Natasha Romanov");
		namen.put("Hulk", "Bruce Banner");
		return namen;
	}
	
	public static void kücheAufräumen(String name) {
		System.out.println(name + ": Küche aufräumen");
		System.out.println(name + ": Boden saugen");
		System.out.println(name + ": Boden wischen");
		System.out.println(name + ": Müll rausbringen");
		System.out.println(name + ": Geschirr abwaschen");
		System.out.println(name + ": Flächen reinigen");
		System.out.println(name + ": Schränke ausseifen");
	}
}
