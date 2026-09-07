package com.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern11(int n){
        for (int row = 1; row < 2*n; row++) {
            int totalRowsInCol = row <= 5 ? row : 2*n-row;
            //spaces
            for (int space = 0; space < n - totalRowsInCol; space++) {
                System.out.print(" ");
            }
            //cols
            for (int col = 1; col <= totalRowsInCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
