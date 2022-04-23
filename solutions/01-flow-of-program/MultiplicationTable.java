package com.sumit.dsahw;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
