package com.sumit.dsahw;

import java.util.Scanner;

public class StopX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,sum=0;
        while (true) {
            n = s.nextInt();
            if (n=='x') break;
            sum += n;
        }
        System.out.println("Sum of the numbers entered "+sum);
    }
}
