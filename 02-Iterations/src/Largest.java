package com.Iterations;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // find the largest of the three numbers
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }

        System.out.println("maximum number is " + max);


        System.out.println(Math.max(55,98));
    }
}
