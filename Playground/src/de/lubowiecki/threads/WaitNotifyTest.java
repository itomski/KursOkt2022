package de.lubowiecki.threads;

public class WaitNotifyTest {

	private Object LOCK = new Object();
	
	public static void main(String[] args) {
		new WaitNotifyTest().init();
	}

	private void init() {
		
		alarmTask();
		
		try {
			
			System.out.println("DAVOR");
			
			synchronized (LOCK) {
				// wait und notify können auf dem Synchro-Object aufgerufen werden
				LOCK.wait(); // Der Thread, der diese Zeile aufruft wartet bis er benachrichtigt wird
				System.out.println("NACH DEM WAIT");
			}
			
			System.out.println("DANACH");
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void alarmTask() {
		
		Runnable aufgabe = () -> {
			
			try {
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (LOCK) {
				LOCK.notify(); // Benachrichtige einen anderen wartenden Thread für deiesn LOCK
			}
		};
		
		new Thread(aufgabe).start();
		
	}
}
