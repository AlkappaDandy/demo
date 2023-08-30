package com.example;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileReader {
    
  public static String readJsonFile(String filename){
    String jsonString = "";
   
    try {      
    File myObj = new File(filename);
    Scanner myReader = new Scanner(myObj);
    while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        jsonString = jsonString + data;
    }
    myReader.close();
    } catch (FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
    return jsonString;
}
}