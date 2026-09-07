package com.Maths;
// Leetcode Q no 2119
import java.util.Scanner;

public class DoubleRev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(DoubleReverse(num));
    }
    static boolean DoubleReverse(int num) {
        if (num == 0){
            return true;
    }
        return num % 10 != 0;
    }
}
