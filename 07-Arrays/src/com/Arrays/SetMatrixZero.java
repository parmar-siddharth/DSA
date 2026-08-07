package com.Arrays;

import java.util.Arrays;

public class SetMatrixZero {
    static void main(String[] args) {
        int[][] arr = {
                {0,1,1},
                {1,1,1},
                {1,1,0}
        };
        System.out.println(Arrays.deepToString(arr));
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    /*
    static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        //first pass 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i, m);
                    markCol(matrix, j, n);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    static void markRow(int[][] matrix, int row, int m) {
        for (int i = 0; i < m; i++) {
            if (matrix[row][i] != 0) {
                matrix[row][i] = -1;
            }
        }
    }

    static void markCol(int[][] matrix, int col, int n) {
        for (int j = 0; j < n; j++) {
            if (matrix[j][col] != 0) {
                matrix[j][col] = -1;
            }
        }
    }
     */

    /*
    static void setZeroes(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    col[i] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
            
        }
    }

     */

    static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean zeroInFirstCol = false;
        for (int row = 0; row < n; row++) {
            if (matrix[row][0] == 0) zeroInFirstCol = true;
            for (int col = 1; col < m; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        //System.out.println(Arrays.deepToString(matrix));

        for (int row = 1; row < n; row++) {
            for (int col = 1; col < m; col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0){
                    matrix[row][col] = 0;
                }
            }
                if (zeroInFirstCol)
                    matrix[row][0] = 0;
        }

        if (matrix[0][0] == 0){
            for (int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }
        if (zeroInFirstCol)
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
    }
}