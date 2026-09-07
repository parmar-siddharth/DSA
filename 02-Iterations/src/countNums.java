package com.Iterations;

import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        System.out.print("Enter a digit to count : ");
        int digit = input.nextInt();

        int count = 0;

        while(num > 0){
            int lastDigit = num % 10;

            if (lastDigit == digit){
                count++;
            }

            num = num/10;
        }
        System.out.println("Total occurences are " + count);
    }
}
