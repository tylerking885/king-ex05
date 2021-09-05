/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution 05
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;                                       // Import declaration for class scanner;

public class Solution05 {
    public static void main(String[] args) {                    // Main method;
        Scanner input = new Scanner(System.in);                 // Enable program to read User data;
        System.out.print("What is the first number? ");         // Prompt user for a number;
        String firstNum = input.nextLine();                     // Set User input to firstNum String variable;
        System.out.print("What is the second number? ");        // Prompt user for a second number;
        String secondNum = input.nextLine();                    // Set User input to secondNum String variable;
        int num1 = Integer.parseInt(firstNum);                  // Convert firstNum String into num1 Integer;
        int num2 = Integer.parseInt(secondNum);                 // Convert secondNum String into num2 Integer;
        int addition = num1 + num2;                             // Set addition integer variable to addition case;
        int subtraction = num1 - num2;                          // Set subtraction integer variable to subtraction case;
        int multiply = num1 * num2;                             // Set multiply integer variable to multiplication case;
        int divide = num1 / num2;                               // Set divide Integer variable to division case;
        System.out.printf("%s + %s = %d%n", firstNum, secondNum, addition);     // Print the addition scenario;
        System.out.printf("%s - %s = %d%n", firstNum, secondNum, subtraction);  // Print the subtraction scenario;
        System.out.printf("%s * %s = %d%n", firstNum, secondNum, multiply);     // Print the multiplication scenario;
        System.out.printf("%s / %s = %d%n", firstNum, secondNum, divide);       // Print the division scenario;
    }
}
