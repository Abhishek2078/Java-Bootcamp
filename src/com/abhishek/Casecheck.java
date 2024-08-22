package com.abhishek;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       char ch=in.next().trim().charAt(0);
       if(ch>='a' && ch<='b')
       {
           System.out.println("This is lower case");
       }
       else {
           System.out.println("This is upper case");
       }
        System.out.println(ch);
    }
}
