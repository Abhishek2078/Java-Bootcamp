package com.abhishek;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int ans=0;
        while(true)
        {System.out.println("Enter The Operators");
            char op=in.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' ||op=='%')
            {
                // input two numbers
                System.out.println("Enter Two Numbers");
                int num1=in.nextInt();
                int num2= in.nextInt();
                if(op=='+')
                {
                    ans=num1+num2;
                }
                if(op=='-')
                {
                    ans=num1-num2;
                }
                if(op=='*')
                {
                    ans=num1*num2;
                }
                if(op=='/')
                {
                   if(num2 !=0){
                       ans=num1/num2;
                   }
                }
                if(op=='%')
                {
                    if(num2 !=0){
                        ans=num1%num2;
                    }
                }
                else if (op=='x'|| op=='X') {
                    break;

                }
                else {
                    System.out.println("invalid Operator");
                }
            }
            System.out.println(ans);
        }

    }
}
