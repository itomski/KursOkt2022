package de.lubowiecki.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		
		Map<String, Integer> einwohner = new HashMap<>();
		einwohner.put("hamburg", 1_900_000);
		einwohner.put("kiel", 300_000);
		einwohner.put("münchen", 1_600_000);
		einwohner.put("berlin", 3_200_000);
		
		// Lesen
		System.out.println(einwohner.get("kiel"));
		int anzahl = einwohner.get("berlin");
		
		einwohner.put("berlin", 4_600_000); // Wert hinter dem Schlüssel wird überschrieben
		
		einwohner.putIfAbsent("berlin", 3_600_000); // Wert wird eingefügt, wenn noch nicht da
		
		einwohner.getOrDefault("köln", 0); // 0 wenn köln als Schlüssel nicht da ist, ansonsten der Wert dahinter
		
		System.out.println();
		// läuft die Werte durch
		for(int e : einwohner.values()) {
			System.out.println(e);
		}
		
		System.out.println();
		// läuft die Schlüssel durch
		for(String k : einwohner.keySet()) {
			System.out.println(k);
		}
		
		System.out.println();
		// läuft die Schlüssel durch
		for(String k : einwohner.keySet()) {
			System.out.println(k + ":" + einwohner.get(k));
		}
		
		System.out.println();
		// läuft die Entry durch, Jedes Entry hat ein key und value
		for(Map.Entry<String, Integer> e : einwohner.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}
}
