package de.lubowiecki.client;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
	
	@FXML
	private TextField input;
	
	@FXML
	private Label output;

    @FXML
    private void showInput() throws IOException {
        String in = input.getText(); // Liest den Inhalt aus dem Textfeld
        input.setText(""); // Textfeld wird geleert
        output.setText(in); // Schreibt einen Text in das Label
    }
}
