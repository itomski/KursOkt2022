package de.lubowiecki.uebung4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

// Model
public class ProductManagement {
	
	private static final String FILE_NAME = "data.ser";
	
	private List<Product> products;
	
	public ProductManagement() {
		readFromFile();
	}
	
	public void add(Product product) {
		products.add(product);
		saveToFile();
	}
	
	public List<Product> getAll() {
		return products;
	}
	
	private void readFromFile() {
		
		try {
			// Entweder werden die alten Daten verwendet
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(FILE_NAME)));
			products = (List<Product>) in.readObject();
		}
		catch(Exception e) {
			// ...oder eine neue leere Liste gebaut
			products = new ArrayList<>();
		}
	}
	
	private void saveToFile() {
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(FILE_NAME)));
			out.writeObject(products);
			out.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
