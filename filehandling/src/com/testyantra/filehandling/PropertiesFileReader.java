package com.testyantra.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {

		String path = "db.properties";
		FileReader reader = null;

		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
//			String name = properties.getProperty("name");
//			String company = properties.getProperty("company");
//			String language = properties.getProperty("language");
			
			String name = properties.getProperty("url");
			String company = properties.getProperty("user");
			String language = properties.getProperty("password");

			System.out.println("Name: "+name);
			System.out.println("Company: "+company);
			System.out.println("Language: "+language);

		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
