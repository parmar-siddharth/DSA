package com.Basics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt() ;

        //if condition
        if (count == 10){
            System.out.println("if condition is true");
        }

        //while loop
        int i = 1;
        while (i <= 5){
            System.out.println(i);
            i++;
        }

        //for loop
        for (int j = 0; j < 5; j++) {
            System.out.println("value is " + j);
        }
    }
}
