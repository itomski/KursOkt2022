package de.lubowiecki.uebung4;

// Model
public class ProductManagement {
	
	private Product[] products;
	private int lastInsertedNum = 0;
	
	public ProductManagement() {
		products = new Product[100];
	}
	
	public ProductManagement(int size) {
		products = new Product[size];
	}
	
	public void add(Product product) {
		products[lastInsertedNum] = product;
		lastInsertedNum++;
	}
	
	public Product[] getAll() {
		return products;
	}
}
