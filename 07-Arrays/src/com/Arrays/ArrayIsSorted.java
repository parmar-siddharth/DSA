package com.Arrays;

public class ArrayIsSorted {
    static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
}
