package com.recursion;

public class NumbersWithRecursion {
    public static void main(String[] args) {
        //write a func that takes in a number and print it
        // print first 5 numbers
        print(1);
    }
    static void print(int n){
        if (n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}

