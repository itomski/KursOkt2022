package de.lubowiecki.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RennenTest {
	
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(5);
		
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		new Fahrzeug(latch).start();
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(() -> { latch.countDown(); System.out.println(latch.getCount()); }, 0, 1, TimeUnit.SECONDS);
	}
	
}

class Fahrzeug extends Thread {
	
	private static int count;
	
	private int nr;
	
	private CountDownLatch latch;
	
	public Fahrzeug(CountDownLatch latch) {
		this.latch = latch;
		nr = ++count;
	}
	
	@Override
	public void run() {
		System.out.println(nr + ": steht an der Startlinie");
		
		try {
			latch.await();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nr + ": gibt gas...");
	}
}
