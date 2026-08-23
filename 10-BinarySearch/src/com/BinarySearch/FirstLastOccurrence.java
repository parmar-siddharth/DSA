package com.BinarySearch;

import java.util.Arrays;

public class FirstLastOccurrence {

    public static void main(String[] args) {
        int[] arr = {};
//        int[] ans = {first(arr,8), last(arr,8)};
        System.out.println(Arrays.toString(searchRange(arr,0)));
    }

    static int first(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                ans = mid;
                end = mid - 1;   // move left
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    static int last(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                ans = mid;
                start = mid + 1;   // move right
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int first = -1;
        int last = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        low = 0;
        high = n-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return new int[]{first,last};
    }
}