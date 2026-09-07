package com.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        pattern17(4);
    }
    static void pattern17(int n){
        for (int row = 1; row < 2*n ; row++) {
            int totalRowsInCols = row <= n ? row : 2*n - row;
            for (int space = 1; space <= n-totalRowsInCols; space++) {
                System.out.print(" ");
            }
            for (int col = totalRowsInCols; col >= 1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= totalRowsInCols; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
