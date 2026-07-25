package com.Arrays;

public class FindPivotIndex {
    static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex2(arr));
    }

    //brute solution
    static int pivotIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = i; j >= 0; j--) {
                leftSum += nums[j];
            }
            for (int j = i; j < n; j++) {
                rightSum += nums[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    static int pivotIndex2(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for(int i : nums){
            totalSum += i;
        }
        int leftSum = 0;
        for(int i = 0; i < n; i++){
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}
