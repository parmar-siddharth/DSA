package com.Maths;

import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check whether its armstrong number or not: ");
        int n = input.nextInt();
        System.out.println(armStrong(n));
    }
    /*
    Armstrong number : when a number is equal to sum of its digits with each digit raised to the power of total
    no of digits in that number
     */

    // for 3 digit no :
    /*
    static boolean armStrong(int n){
        int orignalNum = n;
        int sum = 0;

       while (n>0){
           int rem = n % 10;
           sum = sum + rem*rem*rem;
           n = n/10;
       }
        return sum == orignalNum;
    }
     */

    //for all number (general case)
    static boolean armStrong(int n){
        int orignalNum = n;
        int sum = 0;
        int digit = String.valueOf(n).length();

        while (n>0){
            int rem = n % 10;
            sum += Math.pow(rem,digit);
            n = n/10;
        }
        return sum == orignalNum;
    }

}
