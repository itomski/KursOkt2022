package de.lubowiecki.workshop.jan1;

import java.awt.Point;

public class Person implements Runnable {

	private String name;
	
	private Point curPos; // wo befinde ich mich gerade
	
	private Point target; // wo will ich hin
	
	private boolean wait = true;
	
	public Person(String name, int x, int y) {
		this.name = name;
		curPos = new Point(x, y);
		target = curPos;
	}
	
	public void setTarget(int x, int y) {
		target = new Point(x, y);
		wait = false;
		synchronized (this) {
			notify();
		}
	}

	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		
		while(true) {
			if(t.isInterrupted())
				break;
			
			try {
				wait = move();
				
				if(!wait) {
					System.out.println(name + ": pos " + curPos);
				}
				else {
					System.out.println(name + ": ziel erreicht. wartet");
					
					synchronized (this) {
						wait();
					}
				}
				
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				t.interrupt();
			}
		}
	}
	
	public boolean move() {
		
		if(curPos.x < target.x)
			curPos.x++;
		
		if(curPos.x > target.x)
			curPos.x--;
		
		if(curPos.y < target.y)
			curPos.y++;
		
		if(curPos.y > target.y)
			curPos.y--;
		
		return curPos.equals(target);
	}
	
	

}
