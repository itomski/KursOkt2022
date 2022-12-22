package de.lubowiecki.threads;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockTest {

	public static void main(String[] args) {
		
		final Object LOCK1 = new Object();
		final Object LOCK2 = new Object();
		final ReentrantLock LOCK3 = new ReentrantLock(true);
		
		Runnable aufgabe1 = () -> {
			while(true) {
				synchronized (LOCK1) {
					synchronized (LOCK2) {
						System.out.println("AUSGABE 1");
					}
				}
			}
		};
		
		Runnable aufgabe2 = () -> {
			while(true) {
				synchronized (LOCK2) {
					synchronized (LOCK1) {
						System.out.println("AUSGABE 2");
					}
				}
			}
		};
		
		Runnable aufgabe3 = () -> {
			while(true) {
				LOCK3.lock();
				System.out.println("AUSGABE 3");
				LOCK3.unlock();
			}
		};
		
		new Thread(aufgabe1).start();
		new Thread(aufgabe2).start();
		
		try {
			Thread.sleep(2000); // Warten bis ein Deadlock entsteht
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Deadlock finden
		ThreadMXBean tmx = ManagementFactory.getThreadMXBean();
		long[] ids = tmx.findDeadlockedThreads();
		
		for(long id : ids) {
			ThreadInfo info = tmx.getThreadInfo(id);
			System.out.println(info);
			
		}
		
	}
}
