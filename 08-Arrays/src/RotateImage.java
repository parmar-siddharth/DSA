package com.Arrays;

import java.util.Arrays;

public class RotateImage {
    static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.deepToString(matrix));
        rotate(matrix);
    }
//    static void rotate(int[][] matrix){
//        int n = matrix.length;
//        int[][] ans = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//             ans[j][n-i-1] = matrix[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(ans));
//    }

//    static void rotate(int[][] matrix) {
//        int n = matrix.length;
//        int start = 0; int end = n - 1;
//        while(start < end){
//            int[] temp = matrix[start];
//            matrix[start] = matrix[end];
//            matrix[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.deepToString(matrix));
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));
//    }
static void rotate(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    System.out.println(Arrays.deepToString(matrix));
    for (int i = 0; i < n; i++) {
        int start = 0; int end = n - 1;
        while(start < end){
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
            start++;
            end--;
        }
    }
    System.out.println(Arrays.deepToString(matrix));
}
}
