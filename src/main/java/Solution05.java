/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String firstNum = input.nextLine();
        System.out.print("What is the second number? ");
        String secondNum = input.nextLine();
        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        System.out.printf("%s + %s = %d%n", firstNum, secondNum, addition);
        System.out.printf("%s - %s = %d%n", firstNum, secondNum, subtraction);
        System.out.printf("%s * %s = %d%n", firstNum, secondNum, multiply);
        System.out.printf("%s / %s = %d%n", firstNum, secondNum, divide);
    }
}
