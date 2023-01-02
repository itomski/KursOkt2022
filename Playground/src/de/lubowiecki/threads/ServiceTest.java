package de.lubowiecki.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServiceTest {

	public static void main(String[] args) {
		
		System.out.println("main START");
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		service.execute(new SumTool("Z1"));
		service.execute(new SumTool("Z2"));
		service.execute(new SumTool("Z3"));
		service.execute(new SumTool("Z4"));
		service.execute(new SumTool("Z5"));
		service.execute(new SumTool("Z101"));
		service.execute(new SumTool("Z102"));
		service.execute(new SumTool("Z103"));
		service.execute(new SumTool("Z104"));
		service.execute(new SumTool("Z105"));
		
		service.shutdown();

		System.out.println("main ENDE");
	}
}

class SumTool implements Runnable {

	private String name;
	
	private int start;
	
	public SumTool(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 500; i++) {
			try {
				Thread.sleep(10);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			start += i;
		}
		System.out.println(name + ": " + start);
	}
}