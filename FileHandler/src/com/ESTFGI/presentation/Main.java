package com.ESTFGI.presentation;

import com.ESTFGI.beans.DataClass;
import com.ESTFGI.beans.FileHandler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHandler fileHandler = new FileHandler();

		// Create a DataClass object
		DataClass data = new DataClass("ilyasss ", 25);

		try {
			// Create a file from the DataClass object
			String filePath = "C:\\Users\\Admin\\Documents\\9raya\\data.dat";
//			fileHandler.create(data, filePath);

			// Load data from the file and convert it to a DataClass object
			DataClass loadedData = fileHandler.load(filePath);

			// Print the loaded data
			System.out.println("Name: " + loadedData.getName());
			System.out.println("Age: " + loadedData.getAge());
			
		} catch (Exception e) {
			System.err.println("error "+e);
		}
	}

}
