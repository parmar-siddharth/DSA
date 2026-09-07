package com.Arrays;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
     int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
     SwapVal(arr1,2,4);
        System.out.println(Arrays.toString(arr1));
    }
    static void SwapVal(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

