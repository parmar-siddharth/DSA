package com.functions;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {

        // Swap two numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int num1 = in.nextInt();
        System.out.println("Enter second numbers: ");
        int num2 = in.nextInt();

        int temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println("Num1 is: " + num1 + " " + "Num2 is: " + num2);


    }
}
