package com.sumit.dsahw.assignment2;

import java.util.Scanner;

import static java.lang.System.exit;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        //Check for Invalid Cases
        int num1 = s.nextInt(), num2 = s.nextInt();
        if (num1 < 0 || num2 < 0) {
            System.out.println("Negative numbers are not allowed");
            exit(1);
        }
        //If num1 is greater than num2 the swap num1 and num2
        if (num1 > num2) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        } else if (num1 == num2) {
            System.out.println("The numbers are same.");
            exit(1);
        }
        //Actual Calculation
        System.out.println("The Armstrong Numbers between "+num1+" & "+num2+" are :");
        for (int i = num1+1; i < num2; i++) {
            int rem,sum=0;                      //rem = reminder
            int temp = i;
            int exponent = digits(temp);
            while (temp > 0) {
                rem = temp % 10;
                sum += power(rem,exponent);
                temp /= 10;
            }
            if (sum == i) System.out.println(i);
        }
    }
    //Find the number of digits
    static int digits(int num) {
        int count = 0;
        while(num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    //Calculate power
    static int power(int base,int exp) {
        int num = base;
        for (int i = 1; i < exp; i++) {
            base *= num;
        }
        return base;
    }
}
