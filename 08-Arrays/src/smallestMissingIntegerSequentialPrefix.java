package com.Arrays;

public class smallestMissingIntegerSequentialPrefix {
    static void main(String[] args) {
        int[] arr = {1,2,3,2,5};
        System.out.println(missingInteger(arr));
    }
    static int missingInteger(int[] nums){
        int n = nums.length;
        int longestSum = nums[0];
        if (n == 1) return longestSum+1;
        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]+1){
                longestSum += nums[i];
            }
            else break;
        }
        int missingNumber = longestSum;
        while (linearSearch(nums,missingNumber)){
            missingNumber++;
        }
        return missingNumber;
    }
    static boolean linearSearch(int[] array,int target){
        for (int num : array){
            if (num == target) return true;
        }
        return false;
    }
}
