package de.lubowiecki.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ReminderTest {

	public static void main(String[] args) {
		
		Runnable reminder = () -> {
			Thread t = Thread.currentThread();
			
			System.out.println(t.getName() + ": Check your emails!");
			
			try {
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(t.getName() + ": checked!");
		};
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		//service.scheduleAtFixedRate(reminder, 0, 2, TimeUnit.SECONDS); // Alle 2 Sek startet einen neue Ausführung
		service.scheduleWithFixedDelay(reminder, 0, 2, TimeUnit.MILLISECONDS); // 2 Sek zwischen den Ausführungen
		
		

	}

}
