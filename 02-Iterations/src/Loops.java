package com.Iterations;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*

        syntax of for loop:

        for(initialization; condition; increment/decrement){
        // body
        }
         */

//        for (int num = 1; num <= 5; num += 1){
//            System.out.println(num);
//        }

        // print number 1 to n

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++ ){
            System.out.print(i + " ");
        }

        //while loop
        /*
        syntax for while loop:

        intialization;
        while (condition){
        //body
        increment/decrement;
        }

         */
        int number = 1;
        while (number <= 5){
            System.out.println(number);
            number += 1;
        }


        //do while
        /*
        syntax of do while:

        do{

        } while (condition);
         */
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x<10);

        // do while at least executes ones

    }
}
