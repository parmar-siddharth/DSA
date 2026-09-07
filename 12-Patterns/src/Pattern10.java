package com.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern10(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalColsInRow = row >= n ? 2*n-row-1: row;
            //first inner loop
            for (int col = 0; col < n - totalColsInRow ; col++) {
                System.out.print("*");
            }
            //spaces
            for (int space = 0; space < totalColsInRow*2; space++) {
                System.out.print(" ");
            }
            //second inner loop
            for (int col = 0; col < n - totalColsInRow ; col++) {
                System.out.print("*");
            }
            //line break
            System.out.println();
        }
    }
}
