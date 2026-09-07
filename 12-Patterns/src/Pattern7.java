package com.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {

            // spaces
            for (int s = 0; s < n - row - 1; s++) {
                System.out.print(" ");
            }

            // stars (odd count)
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
