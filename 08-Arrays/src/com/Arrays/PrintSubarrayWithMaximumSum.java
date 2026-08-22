package com.Arrays;

public class PrintSubarrayWithMaximumSum {
    static void main(String[] args) {
        int[] arr = {-2, -3, -7, -2, -10, -4};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum)
                maxSum = sum;
            if (sum < 0)
                sum = 0;
        }
        return maxSum;
    }
}
