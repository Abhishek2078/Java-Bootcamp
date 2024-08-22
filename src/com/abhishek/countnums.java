package com.abhishek;

public class countnums {
    public static void main(String[] args) {
        int n = 45536;
      int count=0;
       while(n>0)
        {
           int rem=n%10;
        if(rem==5)
       {
             count++;
           }
        n = n / 10;// this is not the modulus operation as it will remove the reminder
         }
        System.out.println(count);
         }
    }
