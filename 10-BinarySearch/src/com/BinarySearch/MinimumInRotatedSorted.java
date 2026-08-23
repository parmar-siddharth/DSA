package com.BinarySearch;

public class MinimumInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,0,1,2,3,4,5};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[mid]){
                min = Math.min(min, nums[low]);
                low = mid + 1;
            }
            else {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
    static int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) low = mid + 1;
            else high = mid;
        }
        return nums[high];
    }
}
