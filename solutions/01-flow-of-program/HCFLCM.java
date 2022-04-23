package com.sumit.dsahw;

import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println("The HCF of "+n1+" & "+n2+" is "+HCF(n1,n2));
        System.out.println("The LCM of "+n1+" & "+n2+" is "+LCM(n1,n2));

        //Another Simple way to find LCM without using LCM method
        System.out.println("The LCM of "+n1+" & "+n2+" is "+(n1*n2/HCF(n1,n2)));
    }
    public static int HCF(int n1, int n2) {
        if (n1 > n2) {
            while (true) {
                int r = n1%n2;
                if (r==0) return n2;
                else {
                    n1 = n2;
                    n2 = r;
                }
            }
        }
        else {
            return HCF(n2,n1);
        }
    }
    public static int LCM(int n1, int n2) {
        if (n1%n2 != 0) return n1*n2;
        else {
            int hcf = HCF(n1,n2);
            return (n1/hcf)*(n2/hcf)*hcf;
        }
    }
}
