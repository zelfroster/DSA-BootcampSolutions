package com.sumit.dsahw.assignment2;

import java.util.Scanner;

public class LargerTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = s.nextInt(), num2 = s.nextInt();
        //Approach 1
//        System.out.println("The greater number is "+Math.max(num1,num2));
        //Approach 2
        System.out.print("The greater number is ");
        if (num1 > num2) System.out.println(num1);
        else System.out.println(num2);
    }
}
