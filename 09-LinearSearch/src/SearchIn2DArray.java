package com.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {9,18,5},
                {6,7,14}
        };
        int target = 5;
        int[] ans = in2DArray(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] in2DArray(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]){
                    return new int[] {row,col} ;
                }
            }
        }
        return new int[]{-1};
    }
}
