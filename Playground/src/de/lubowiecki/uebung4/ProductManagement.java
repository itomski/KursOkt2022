package de.lubowiecki.uebung4;

import java.util.ArrayList;
import java.util.List;

// Model
public class ProductManagement {
	
//	private Product[] products;
//	private int lastInsertedNum = 0;
	
	private List<Product> products;
	
	public ProductManagement() {
		// products = new Product[100];
		products = new ArrayList<>();
	}
	
	public void add(Product product) {
//		products[lastInsertedNum] = product;
//		lastInsertedNum++;
		products.add(product);
	}
	
//	public Product[] getAll() {
//		return products;
//	}
	
	public List<Product> getAll() {
		return products;
	}
}
