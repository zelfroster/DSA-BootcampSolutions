package com.sumit.dsahw.assignment2;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Choose from the following -\n1. (+) Addition\n2. (-) Subtraction\n");
        System.out.print("3. (*) Multiplication\n4. (/) Division\nEnter the symbol to perform an operation : ");
        char operator = s.next().charAt(0);
        System.out.print("Enter Two Numbers : ");
        int num1 = s.nextInt(), num2 = s.nextInt();
        switch (operator) {
            case '+' -> {
                System.out.println("Result after performing the following operation");
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
            }
            case '-' -> {
                System.out.println("Result after performing the following operation");
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
            }
            case '*' -> {
                System.out.println("Result after performing the following operation");
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
            }
            case '/' -> {
                System.out.println("Result after performing the following operation");
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 / num2));
            }
            default -> System.out.println("Wrong Operator Chosen");
        }
    }
}
