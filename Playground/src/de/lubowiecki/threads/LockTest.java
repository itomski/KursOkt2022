package de.lubowiecki.threads;

public class LockTest {
	
	public static void main(String[] args) {
		
		Page page = new Page();
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10_000; i++) {
				page.write("Das ");
				page.write("ist ");
				page.write("ein ");
				page.write("Haus ");
				page.write("von ");
				page.write("Nikigraus \n");
			}
		});
		
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10_000; i++) {
				page.write("Hamburg! ");
				page.write("Wir ");
				page.write("haben ");
				page.write("ein ");
				page.write("Problem \n");
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(() -> {
			//for (int i = 0; i < 100; i++) {
				System.out.println(page.read());
			//}
		}).run();
	}
}

class Page {
	
	private String content;
	
	// Als LOCK kann jedes Objekt in Java verwendet werden
	private String readLock = "TEXT1"; // t3
	private Object writeLock = new Object(); // t2
	
	public void write(String str) {
		synchronized (writeLock) {
			content += str;
		}
	}
	
	public String read() {
		synchronized (readLock) {
			return content;
		}
	}
}

