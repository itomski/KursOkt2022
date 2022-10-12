package de.lubowiecki.uebung4;

import java.time.LocalDate;

// Model
public class Product {
	
	private String name;
	private String description;
	private double price;
	private LocalDate createdAt;

	public Product() {
		createdAt = LocalDate.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + ", createdAt="
				+ createdAt + "]";
	}
}
