package com.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,11,13,17,21,27,33,41};
        System.out.println(search(arr,21));
    }
    static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
