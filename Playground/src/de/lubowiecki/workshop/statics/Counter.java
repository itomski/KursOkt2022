package de.lubowiecki.workshop.statics;

public class Counter {

	public static void main(String[] args) {
		
		Thing t1 = new Thing("Hammer");
		Thing t2 = new Thing("Zange");
		Thing t3 = new Thing("Feile");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

	}

}

class Thing {
	
	private static int count;
	
	private String name;
	private int nr;
	

	public Thing(String name) {
		this.name = name;
		nr = ++count;
	}
	
	@Override
	public String toString() {
		return name + ", " + nr;
	}
}