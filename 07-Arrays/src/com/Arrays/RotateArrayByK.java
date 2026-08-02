package com.Arrays;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rightRotate(arr,3);
        //rotate2(arr,3);
    }
    //brute force for left rotation
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = nums[i];
        }
        for(int i = k; i < n; i++){
            nums[i-k] = nums[i];
        }
        for(int i = n-k; i < n; i++){
            nums[i] =  temp[i-(n-k)];
        }
        System.out.println(Arrays.toString(nums));
    }

    //brute force for right rotation
    static void rightRotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        //Last k elements copy
        int[] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = nums[n-k+i];
        }

        // shift remaining elements right
        for(int i = n-k-1; i >= 0; i--){
            nums[i+k] = nums[i];
        }

        //copy to the begining
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        System.out.println(Arrays.toString(nums));
    }



    static void rotate2(int[] nums, int k) {
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
