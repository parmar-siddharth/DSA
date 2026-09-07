package com.Iterations;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of term: ");

        int a = 0;
        int b = 1;
        int n = input.nextInt();



            if (n==0){
                System.out.println(a);
            }
            else if (n==1){
                System.out.println(b);
            }
            else {
                for ( int i=2; i <= n ; i++ ){
                    int next = a + b;
                    a = b;
                    b = next;
                }
            }
                System.out.println(b);

    }
}
