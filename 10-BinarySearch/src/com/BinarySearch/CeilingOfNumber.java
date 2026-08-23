package com.BinarySearch;

import java.util.Arrays;

public class CeilingOfNumber {
    public static void main(String[] args) {
//        int[] arr = {2,3,5,9,14,16,18};
        int[] arr = {3,4,4,7,8,10};
        System.out.println(ceiling(arr,5));
    }
    static int ceiling(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return arr[mid];
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
