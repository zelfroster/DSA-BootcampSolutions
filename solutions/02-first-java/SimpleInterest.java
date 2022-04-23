package com.sumit.dsahw.assignment2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t\tInterest Calculator");
        System.out.print("Enter the Principal Amount : ");
        int principal = s.nextInt();
        System.out.print("Enter the Rate : ");
        int rate = s.nextInt();
        System.out.print("Enter the Time in Years : ");
        int time = s.nextInt();
        System.out.print("The Simple Interest for "+principal+" at the rate of "+rate+" %");
        System.out.println(" in "+time+" years is "+(principal*rate*time/100));
    }
}
