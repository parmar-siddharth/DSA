package com.BinarySearch;

public class SearchInsertPosition {
   public static void main(String[] args) {
        int[] arr = {0,2,4,5,7,9,18};
       System.out.println(searchInsert(arr,4));

    }
    static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;
            if(target < nums[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}
