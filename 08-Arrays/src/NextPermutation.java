package com.Arrays;

import java.util.Arrays;

public class NextPermutation {
    static void main(String[] args) {
        int[] arr = {2,1,5,4,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx1 = -1;
        int idx2 = -1;
        for (int i = n-2; i >= 0;i--) {
            if (nums[i] < nums[i+1]){
                idx1 = i;
                break;
            }
        }
        if (idx1 == -1){
            reverse(nums,0,n-1);
        }
        else {
            for (int i = n-1; i >= 0; i++) {
                if (nums[i] > idx1){
                    idx2 = i;
                    break;
                }
            }
            swap(nums,idx1,idx2);
            reverse(nums,idx1+1,n-1);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr,int low,int high){
        while (low < high){
            swap(arr,low,high);
            low++;
            high--;
        }
    }
}
