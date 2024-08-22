package com.abhishek;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
//        if(a>b)
//        {
//            max=a;
//            System.out.println("A is maximum");
//        } else if (b>c) {
//            max=b;
//            System.out.println("B is Maximum");
//
//        }
//        else {
//            max=c;
//            System.out.println("C Is maximum");
//        }
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
