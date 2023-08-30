package com.example;

import java.util.Scanner;  // Import the Scanner class


public class UserInputService{
    public static String getUserInput(){
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    String input = scanner.nextLine();  // Read user input
    scanner.close();
    return input;
    }
}

