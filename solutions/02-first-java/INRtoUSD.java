package com.sumit.dsahw.assignment2;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter money amount in Rupees(INR) : ");
        double INR = s.nextDouble();
        System.out.println("The money in dollar(USD) is "+INR/76.475);
    }
}
