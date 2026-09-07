package com.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        arr = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int max = 0;
            int last = n-i-1;
            for (int j = 0; j <= last; j++) {
                if (arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
        return arr;
    }
}
