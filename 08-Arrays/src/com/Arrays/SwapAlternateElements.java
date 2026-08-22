package com.Arrays;

import java.util.Arrays;

public class SwapAlternateElements {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(swapAlternateElements(arr)));
    }
    static int[] swapAlternateElements(int[] arr) {
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 2;
            j += 2;
        }
        return arr;
    }
}
