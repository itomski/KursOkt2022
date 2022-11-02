package de.lubowiecki.collections;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {
	
	public static void main(String[] args) {
		
		// FIFO
		
		Queue<String> aufgaben = new LinkedList<>();
		aufgaben.offer("Müll rausbringen"); // offer fügt ein Element an das Ende der Warteschlange hinzu
		aufgaben.offer("Staub saugen");
		aufgaben.offer("Wäsche waschen");
		aufgaben.offer("Mit dem Hund spazieren gehen");
		
		while(!aufgaben.isEmpty()) {
			System.out.println(aufgaben.poll()); // poll entfernt ein Element am Anfang der Warteschlange
		}
		
		System.out.println();
		
		// Stack - LIFO
		Deque<String> stack = new LinkedList<>();
		stack.offer("Müll rausbringen"); // offer fügt ein Element an das Ende der Warteschlange hinzu
		stack.offer("Staub saugen");
		stack.offer("Wäsche waschen");
		stack.offer("Mit dem Hund spazieren gehen");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pollLast()); // pollLast entfernt ein Element am Ende der Warteschlange
		}
		
		System.out.println();
		
		// Stack über Collections
		Queue<String> lifo = Collections.asLifoQueue(stack);
		lifo.add("Aufgabe 1");
		lifo.add("Aufgabe 2");
		System.out.println(lifo.poll());
		System.out.println(lifo.poll());
		
		System.out.println();
		
		// Veraltet
		Stack<String> realStack = new Stack<>();
		realStack.push("Aufgabe 1");
		realStack.push("Aufgabe 2");
		System.out.println(realStack.pop());
		System.out.println(realStack.pop());
		
	}
	
}
