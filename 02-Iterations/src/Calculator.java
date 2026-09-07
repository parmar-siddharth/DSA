package com.Iterations;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float ans = 0;

        while(true){
            System.out.println("Enter the operator: ");
            char operator = input.next().trim().charAt(0);

             if (operator == 'X' || operator == 'x') {
                 System.out.println("Exiting......");
                break;
            }

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%' ){
                System.out.println("Enter first number: ");
            float num1 = input.nextFloat();
                System.out.println("Enter second number: ");
            float num2 = input.nextFloat();

            if (operator == '+') {
                ans = num1 + num2;
            }
            else if (operator == '-') {
                ans = num1 - num2;
            }
            else if (operator == '/') {
                if (num1 != 0 || num2 != 0){
                ans = num1 / num2;
                }
            }
            else if (operator == '*') {
                ans = num1 * num2;
            }
            else if (operator == '%') {
                ans = num1 % num2;
            }
                System.out.println("Ans" + " " + num1 + " " + operator + " " + num2 + " " +  "=" + " " + ans );
                System.out.println("Enter X to exit!");
            } else {
                System.out.println("Invalid operation!");
                System.out.println("Enter X to exit!");
                continue;
            }
        }
    }
}
