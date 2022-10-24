package de.lubowiecki.collections;

import java.util.Objects;

public class Thing implements Comparable<Thing> {

	private String name;
	
	private double weight;
	
	public Thing() {
	}
	
	public Thing(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public int hashCode() {
		System.out.println("HASHCODE");
		return Objects.hash(name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("EQUALS");
		
		// Ist es das gleiche Objekt auf dem Speicher?
		if (this == obj)
			return true;
		
		// Ein Vergleich mit NULL soll immer false liefern
		if (obj == null)
			return false;
		
		// Sind beide Objekte Instanzen gleicher Klasse?
		if (getClass() != obj.getClass())
			return false;
		
		Thing other = (Thing) obj;
		// Ist der Inhalt gleich?
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Thing [name=");
		builder.append(name);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Thing other) { // Beschreibt eine natürliche Reihenfolge
		//return name.compareTo(other.name);
		return Double.compare(weight, other.weight); // von klein zu groß
		// return Double.compare(other.weight, weight); // von groß zu klein
	}
}
