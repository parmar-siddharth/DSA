package com.Bitwise;

public class isOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(2));
    }
    static String isOdd(int n){
        if ((n & 1) == 1){
            return "odd";
        }
        return "Even";
    }
}
