package de.lubowiecki.vererbung.interfaces;

import java.util.LinkedList;
import java.util.Queue;

public class LaserPrinter {
	
	// Statt konkrete Typen zu benutzen sollen eher Interface-Typen genutzt werden = Loose Coupling
	
	private Queue<Printable> jobs = new LinkedList<>(); // FIFO:: first-in-first-out, Warteschlange
	
	// Hier ist nicht nur eine A4Page erlaubt, sondern alles was Printable ist
	public void addJobs(Printable... docs) {
		for(Printable doc : docs) {
			this.jobs.add(doc);
		}
		
		startPrintProcess();
	}
	
	private void startPrintProcess() {
		
		while(!jobs.isEmpty()) {
			System.out.println("start printig job...");
			// poll holt das nächste Printable-Objekt aus der Warteschlange raus. Es wird aus der Warteschlange entfernt.
			Printable next = jobs.poll();
			next.print();
			System.out.println("...end printig job\n");
		}
	}
}
