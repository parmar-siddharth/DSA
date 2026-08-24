package com.BinarySearch;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {12,24,31,42},
                {15,26,35,45},
                {17,29,37,48}
        };
        System.out.println(Arrays.toString(search(arr,37)));
    }
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;

        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[]{row,col};
            }
            else if (matrix[row][col] > target){
                col--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
