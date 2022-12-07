package de.lubowiecki.patterns.composite;

public class Circle extends AbstractGeoElement {

	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [x=");
		builder.append(getX());
		builder.append(", y=");
		builder.append(getY());
		builder.append(", radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString();
	}
}
