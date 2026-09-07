package com.Iterations;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int num =  input.nextInt();
        int reverse = 0;

        while(num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("Reversed number is :" + reverse);
    }
}
