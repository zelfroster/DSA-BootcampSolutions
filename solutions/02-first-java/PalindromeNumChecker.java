package com.sumit.dsahw.assignment2;

import java.util.Scanner;

public class PalindromeNumChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        int n = num;
        int reminder,reverse=0;
        while(n>0) {
            reminder = n % 10;
            reverse = reverse*10 + reminder;
            n /= 10;
        }
        if (reverse == num) System.out.println("The number " + num + " is a Palindrome.");
        else System.out.println("The number "+num+" is not a Palindrome.");
    }
}
