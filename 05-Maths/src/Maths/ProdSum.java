package com.Maths;
// Leetcode Q no 1281
import java.util.Scanner;

public class ProdSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        int product = 1;
        int sum = 0;

        while (number > 0){
            int lastDigit = number % 10;
            product = product * lastDigit ;
            sum = sum + lastDigit;
            number = number / 10;
        }
        int subtractValue = product - sum;
        System.out.println("Product of digits - sum of digits = " + subtractValue);
    }
}