package de.lubowiecki.patterns.adapter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	
	private ExecutorService service;
	
	public Server() {
		service = Executors.newSingleThreadExecutor();
	}
	
	public boolean receive(Message m) {
		
		service.execute(() -> {
			m.compute();
			
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		return true;
	}
	
	public void stop() {
		service.shutdown();
	}
}
