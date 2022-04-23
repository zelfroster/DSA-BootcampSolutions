package com.sumit.dsahw;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println("Sum of "+n1+" & "+n2+" is : "+(n1+n2));
    }
}
