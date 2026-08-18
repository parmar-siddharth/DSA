package com.Arrays;

public class MaximumProductSubarray {
    static void main(String[] args) {
        int[] input = {-2,0,-1};
        System.out.println(maxProduct(input));
    }
    static int maxProduct(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int maxProd = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int currProd = 1;
            for(int j = i; j < n; j++){
                currProd *= nums[j];
                maxProd = Math.max(maxProd,currProd);
            }
        }
        return maxProd;
    }
}
