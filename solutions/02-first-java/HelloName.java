package com.sumit.dsahw.assignment2;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = s.next();
        System.out.println("Namaste! "+name+"\nHave a beautiful Day :D");
    }
}
