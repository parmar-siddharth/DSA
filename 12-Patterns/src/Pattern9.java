package com.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        for (int row = 0; row < n; row++) {
            //spaces
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            //inner loop
            for (int col = 0; col < n-row ; col++) {
                System.out.print("* ");
            }
            //line break
            System.out.println();
        }
    }
}
