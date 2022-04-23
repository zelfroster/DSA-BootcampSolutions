package com.sumit.dsahw.assignment2;

import java.util.Scanner;

import static java.lang.System.exit;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String to check if it is a Palindrome or not : ");
        String str = s.next();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                System.out.println("The string "+str+" is not a Palindrome.");
                exit(1);
            }
        }
        System.out.println("The string "+str+" is a Palindrome.");
    }
}
