package com.BitManipulation;

public class OddEven {
    static void main(String[] args) {
        oddEven(4);
    }
    static void oddEven(int num) {
//        int lastDigit = num % 10;
        if((num & 1) == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
