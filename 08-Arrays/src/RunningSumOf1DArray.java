package com.Arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {
    static void main(String[] args) {
    int[] nums = {1,2,3,4};
    System.out.println(Arrays.toString(nums));
    runningSum(nums);
    System.out.println(Arrays.toString(runningSum2(nums)));
    }
    static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            int sum = 0;
            for(int j = 0;j < i+1;j++){
                sum += nums[j];
            }
            arr[i] = sum;
        }
        return arr;
    }

    static int[] runningSum2(int[] nums) {
        int n = nums.length;
        for(int i = 1;i < n;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
