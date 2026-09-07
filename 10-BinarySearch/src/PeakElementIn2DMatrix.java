package com.BinarySearch;

import java.util.Arrays;

public class PeakElementIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {12,24,31,42},
                {15,26,34,45},
                {17,29,37,48}
        };
        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }
    static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int peak = 0;
        int[] index = {};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] > peak){
                    peak = mat[i][j];
                    index = new int[]{i, j};
                }
            }
        }
        return index;
    }
}
