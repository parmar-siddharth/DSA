package com.functions;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int result = sum();
        System.out.println(result);
    }

    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number first: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
