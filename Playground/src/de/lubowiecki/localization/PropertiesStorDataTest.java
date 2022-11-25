package de.lubowiecki.localization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

public class PropertiesStorDataTest {

	private static final String CONF_FILE = "config.xml";
	
	public static void main(String[] args) {
		
		// Schreiben
//		Properties prop = new Properties();
//		prop.setProperty("user", "admin");
//		prop.setProperty("password", "geheim");
//		prop.setProperty("host", "123.123.123.1");
//		prop.setProperty("port", "8080");
//		
//		try(FileOutputStream out = new FileOutputStream(CONF_FILE)) {
//			prop.storeToXML(out, "");
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		Properties prop = new Properties();
		
		try(FileInputStream in = new FileInputStream(CONF_FILE)) {
			prop.loadFromXML(in);
			
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
