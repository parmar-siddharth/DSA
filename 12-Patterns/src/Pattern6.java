package com.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for (int row = 0; row < n; row++) {
            for (int spc = 0; spc < row; spc++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
