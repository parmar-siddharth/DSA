package com.BinarySearch;

import java.util.Arrays;

public class AggresiveCows {
    static void main(String[] args) {
        int[] nums = {4, 2, 1, 3, 6};
        System.out.println(aggressiveCows(nums,2));
    }
    static int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 1;
        int high = nums[n - 1] - nums[0];
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (canPlace(nums,k,mid)){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return high;
    }
    static boolean canPlace(int[] nums,int k,int distance){
        int cowsPlaced = 1;
        int lastPlaced = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] - lastPlaced) >= distance){
                cowsPlaced++;
                lastPlaced = nums[i];
            }
        }
        return  cowsPlaced >= k;
    }
}
