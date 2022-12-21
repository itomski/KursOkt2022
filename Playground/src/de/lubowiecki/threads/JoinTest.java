package de.lubowiecki.threads;

import java.util.Random;

public class JoinTest {

	public static void main(String[] args) {
		
		// Thread.currentThread() liefert eine Referenz auf den Thread, der diese Zeile ausführt
		Thread main = Thread.currentThread();
		
		System.out.println(main.getName() + ": START");
		
//		Thread t1 = new SleepyThread();
//		t1.start();
//		
//		new SleepyThread().start();
//		new SleepyThread().start();
//		new SleepyThread().start();
//		
//		try {
//			t1.join(); // Der Main-Thread wartet darauf, dass t1 fertig ist
//		} 
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		} 
		
		System.out.println();
		
		ChainThread t2 = new ChainThread("Peter", main);
		ChainThread t3 = new ChainThread("Bruce", t2);
		
		Thread t4 = new Thread(new ChainRunnable("Hans", t3));
		
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println(main.getName() + ": ENDE");
	}
}

class SleepyThread extends Thread {
	
	private Random rand = new Random();
	
	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		
		for (int i = 0; i < 3; i++) {
			
			try {
				int sec = rand.nextInt(10) + 1;
				Thread.sleep(sec * 1000);
				System.out.println(t.getName() + ": bin wieder wach. Habe " + sec + " Sekunden gepennt.");
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class ChainThread extends Thread {
	
	private Thread waitFor;
	
	private Random rand = new Random();
	
	public ChainThread(String name, Thread waitFor) {
		super(name);
		this.waitFor = waitFor;
	}
	
	@Override
	public void run() {
		
		try {
			waitFor.join(); // Wartet, bis der Thread hinter waitFor abgearbeitet ist
		}
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		Thread t = Thread.currentThread();
		
		for (int i = 0; i < 3; i++) {
			
			try {
				int sec = rand.nextInt(10) + 1;
				Thread.sleep(sec * 1000);
				System.out.println(t.getName() + ": bin wieder wach. Habe " + sec + " Sekunden gepennt.");
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class ChainRunnable implements Runnable {
	
	private Thread waitFor;
	
	private Random rand = new Random();
	
	private String name;
	
	public ChainRunnable(String name, Thread waitFor) {
		this.name = name;
		this.waitFor = waitFor;
	}
	
	@Override
	public void run() {
		
		try {
			waitFor.join(); // Wartet, bis der Thread hinter waitFor abgearbeitet ist
		}
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for (int i = 0; i < 3; i++) {
			
			try {
				int sec = rand.nextInt(10) + 1;
				Thread.sleep(sec * 1000);
				System.out.println(name + ": bin wieder wach. Habe " + sec + " Sekunden gepennt.");
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
