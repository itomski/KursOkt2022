package de.lubowiecki.playground;

public class Thing {

	private double weight;
	
	private String name;

	public Thing() {
		weight = 10;
	}
	
	public Thing(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Gewicht: " + weight + "kg, Name: " + name;
	}
	
//	@Override
//	protected void finalize() throws Throwable {
//		System.out.println("UGHHHHH.... ARRRRRR!!!");
//	}
}
