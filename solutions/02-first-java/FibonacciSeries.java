package com.sumit.dsahw.assignment2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms to print the Fibonacci Series : ");
        int num = s.nextInt();
        int a=0,b=1,c;
        System.out.println("0");
        System.out.println("1");
        for (int i = 0; i < num-2; i++) {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if(num == 1) {
            return 1;
        }else return fibonacci(num-1)+fibonacci(num-2);
    }
}