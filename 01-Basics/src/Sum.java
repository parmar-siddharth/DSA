package com.Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int a = input.nextInt();
//        System.out.println("Enter the second number");
//        int b = input.nextInt();
//        int sum = a + b;
//        System.out.println("Sum is "+ sum);
        //output: Sum is 5410826


        // what if write float value as input
        // output: error

        // if we change int to float and then give float values as input
        // float sum = a + b;

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int a = input.nextInt();
//        System.out.println("Enter the second number");
//        int b = input.nextInt();
//        float  sum = a + b;
//        System.out.println("Sum is "+ sum);

        //output : Sum is 100.0

        // what will happen if we change the input variable data type to float
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = input.nextFloat();
        System.out.println("Enter the second number");
        float b = input.nextFloat();
        float  sum = a + b;
        System.out.println("Sum is "+ sum);

        // output: Sum is 104.520004

    }
}
