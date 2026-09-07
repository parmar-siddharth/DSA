package com.Arrays;

import java.util.Arrays;

public class MultiplyEachElementBy10 {
    static void main(String[] args) {
        int[] arr = {4,5,9,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(multiplyBy10(arr)));
    }
    static int[] multiplyBy10(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 10;
        }
        return arr;
    }
}

