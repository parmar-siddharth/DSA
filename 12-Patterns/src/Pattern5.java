package com.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 1; row < 2*n; row++) {
            int totalColsinRows = row <= 5 ? row : 2*n - row ;
            for (int col = 1; col <= totalColsinRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
