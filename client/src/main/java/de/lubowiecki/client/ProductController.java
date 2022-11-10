package de.lubowiecki.client;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProductController implements Initializable { // Initializable bietet die Möglichkeit Tätigkeiten beim Starten der GUI auszuführen
	
	@FXML
	private TextField name;
	
	@FXML
	private TextArea description;
	
	@FXML
	private TextField amount;
	
	@FXML
	private TextField price;
	
	@FXML
	private TableView<Product> tblProducts;
	
	private ProductManagement management = new ProductManagement();

    @FXML
    private void save() throws IOException {
    	Product product = new Product();
    	product.setName(name.getText());
    	product.setDescription(description.getText());
    	product.setAmount(Integer.parseInt(amount.getText()));
    	product.setPrice(Double.parseDouble(price.getText()));
    	management.add(product);
    	clearForm();
    	show();
    }
    
    private void show() {
//    	String row = "%s, %s, %s, %d, %.2f \n";
//    	
//    	StringBuilder sb = new StringBuilder();
//    	for(Product p : management.getAll()) {
//    		sb.append(String.format(row, p.getName(), p.getDescription(), p.getCreatedAt(), p.getAmount(), p.getPrice()));
//    	}
//    	output.setText(sb.toString());
    	
    	//List<Product> productList = management.getAll();
    	//tblProducts.setItems(FXCollections.observableList(productList));
    	tblProducts.setItems(FXCollections.observableList(management.getAll()));
    }
    
    private void clearForm() {
    	name.clear();
    	description.clear();
    	amount.clear();
    	price.clear();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		show();
	}
}
