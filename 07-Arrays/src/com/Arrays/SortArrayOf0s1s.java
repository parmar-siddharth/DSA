package com.Arrays;

import java.util.Arrays;

public class SortArrayOf0s1s {
    static void main(String[] args) {
        int[] arr = {0,1,0,1,1,1,0,1,0};
        sort(arr);
    }
    static void sort(int[] arr) {
        int n = arr.length;
        int k = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 1){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
