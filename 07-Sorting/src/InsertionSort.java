package com.Sorting;

import java.util.Arrays;
/*
Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time by
inserting each element into its correct position in the already sorted part of the array.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {8,1,4,5,9,3};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }
    static int[] insertionSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                    if (nums[j] < nums[j-1]){
                        swap(nums,j,j-1);
                    }
                    else {
                        break;
                    }
            }
        }
        return nums;
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
