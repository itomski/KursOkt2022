package de.lubowiecki.playground;

public class ObejectChainingTest {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		c.up();
		c.up();
		c.up();
		c.up(10);
		c.up();
		int a = c.get();
		System.out.println(a);
		
		System.out.println();
		
		CounterChain cc = new CounterChain();
		int b = cc.up().up().up().up(10).up().get();
		System.out.println(b);
		
		String s = " Hallo ".trim().substring(2).toUpperCase();
		System.out.println(s);

	}
}

class Counter {
	
	private int count;
	
	public void up() {
		count++;
	}
	
	public void up(int num) {
		count += num;
	}

	public int get() {
		return count;
	}
}

class CounterChain {
	
	private int count;
	
	public CounterChain up() {
		count++;
		return this;
	}
	
	public CounterChain up(int num) {
		count += num;
		return this;
	}

	public int get() {
		return count;
	}
}
