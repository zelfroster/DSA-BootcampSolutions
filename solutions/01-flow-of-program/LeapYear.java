package com.sumit.dsahw;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year to find whether it is a Leap year or not : ");
        int year = s.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The year "+year+" is a Leap Year.");
        } else {
            System.out.println("The year "+year+" is not a Leap Year.");
        }
    }
}
