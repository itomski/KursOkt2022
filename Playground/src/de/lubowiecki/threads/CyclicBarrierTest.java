package de.lubowiecki.threads;

import java.awt.Point;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		
		CyclicBarrier b = new CyclicBarrier(2, () -> System.out.println("Jetzt gehts für alle weiter..."));
		
		Ranger r = new Ranger(new Point(10, 22), new Point(15, 28), b);
		new Thread(r).start();
		
		new Thread(new Ranger(new Point(-18, -30), new Point(10, 22), b)).start();
	}
}

class Ranger implements Runnable {
	
	private Point curPos = new Point();
	
	private Point target1;
	
	private Point target2;
	
	private CyclicBarrier barrier;

	public Ranger(Point target1, Point target2, CyclicBarrier barrier) {
		this.target1 = target1;
		this.target2 = target2;
		this.barrier = barrier;
	}
	
	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		
		try {
			while(!move(target1)) {
					Thread.sleep(500);
			}
			
			System.out.println(t.getName() + ": wartet auf den anderen Ranger.");
			barrier.await(); // Hier wird gewartet, bis ein anderer Thread an gleicher Position ist
			
			//System.out.println("Jetzt gehts für alle weiter...");
			
			if(barrier.isBroken())
				barrier.reset(); // Eine durchgebrochene Barrier wird neu aufgestellt
			
			while(!move(target2)) {
				Thread.sleep(500);
			}
			
			System.out.println(t.getName() + ": wartet auf den anderen Ranger.");
			barrier.await();
			
			System.out.println("Alle Ranger haben ihre Missionen erfüllt.");
			
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public boolean move(Point target) {
		
		Thread t = Thread.currentThread();
		
		if(curPos.x < target.x)
			curPos.x++;
		
		if(curPos.x > target.x)
			curPos.x--;
		
		if(curPos.y < target.y)
			curPos.y++;
		
		if(curPos.y > target.y)
			curPos.y--;
		
		System.out.println(t.getName() + " curPos " + curPos + ", target " + target);
		
		return curPos.equals(target);
	}
}
