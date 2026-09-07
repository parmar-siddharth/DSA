package com.LinearSearch;

public class MaxValueIN2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {12,58,96},
                {89,58,74},
                {58,89,25}
        };
        System.out.println(maxValue(arr));
    }
    static int maxValue(int[][] arr){
        int max = Integer.MIN_VALUE;

/*
    // using for loop:

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
         */

        // using enhanced for loop
        for (int[] SubArr : arr){
            for (int element : SubArr){
                if (element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
