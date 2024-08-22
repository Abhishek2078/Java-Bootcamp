package com.abhishek;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        int n= in.nextInt();
//        int a=0;
//        int b=1;
//        int count=2;
//        while(count<=n)
//        {
//            int temp=b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);
        int n = 10; // Number of terms to be printed
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}