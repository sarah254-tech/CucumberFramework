package com.neotech.practice;

import java.io.File;

public class FilePath {

	public static void main(String[] args) {
	
		File file = new File("path/to/file.xlsx");
		if(!file.exists()) {
			System.out.println("File does not exist: "+ file.getAbsolutePath());
		}
		
		String filePath = "C:\\Users\\hp\\eclipse-workspace\\CucumberFramework8\\src\\test\\resources\\testdata\\Excel.xlsx";
        File file1 = new File(filePath);

        if (file.exists()) {
            System.out.println("File exists: " + file1.getAbsolutePath());
        } else {
            System.err.println("File not found: " + file1.getAbsolutePath());
        }
	}

}
