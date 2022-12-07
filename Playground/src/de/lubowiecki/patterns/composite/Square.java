package de.lubowiecki.patterns.composite;

public class Square extends AbstractGeoElement {
	
	private int height;
	
	private int width;

	public Square(int x, int y, int height, int width) {
		super(x, y);
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Square [x=");
		builder.append(getX());
		builder.append(", y=");
		builder.append(getY());
		builder.append(", height=");
		builder.append(height);
		builder.append(", width=");
		builder.append(width);
		builder.append("]");
		return builder.toString();
	}
}
