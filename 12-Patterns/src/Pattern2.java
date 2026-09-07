package com.patterns;

public class Pattern2 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            //for every row run the column
            for (int column = 1; column <= row ; column++) {
                System.out.print("* ");
            }
            // when 1 row is printed, we need to add new line
            System.out.println();
        }
    }
}
/*
no of lines = no of rows = no of outer for loop
 */
