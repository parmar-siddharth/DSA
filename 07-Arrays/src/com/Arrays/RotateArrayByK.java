package com.Arrays;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Rotate(arr,3);
    }
    //brute force for rotation by k places
    static void Rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[k];
        int j = 0;
        for (int i = n-k; i < n ; i++) {
            temp[j++] = nums[i];
        }
        for (int i = 1; i <= n-k; i++) {
            nums[n-i] = nums[n-k-i];
        }
        for (int i = 0; i < temp.length; i++){
            nums[i] = temp[i];
        }
        System.out.println(Arrays.toString(nums));

    }
    // optimal soln
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;

        reverse(nums, 0, n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] nums,int start,int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
