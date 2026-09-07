package com.Maths;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println(isPrime(num));

    }

    static boolean isPrime(int n){

        if (n <= 1){
            return false;
        }

        for (int i = 2 ; i * i <= n ; i++){    // for reducing test case we check whether c <= sqrt(num)
            if (i % n == 0) {                  // but we can write it also like this c*c <= num
                return false;                  // we square both the sides
            }
        }
        return true;
    }
}
