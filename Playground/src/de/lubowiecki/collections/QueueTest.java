package de.lubowiecki.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		Queue<String> aufgaben = new LinkedList<>();
		aufgaben.offer("Müll rausbringen"); // offer fügt ein Element an das Ende der Warteschlange hinzu
		aufgaben.offer("Staub saugen");
		aufgaben.offer("Wäsche waschen");
		aufgaben.offer("Mit dem Hund spazieren gehen");
		
		while(!aufgaben.isEmpty()) {
			System.out.println(aufgaben.poll()); // poll entfernt ein Element am Anfang der Warteschlange
		}
	}
	
}
