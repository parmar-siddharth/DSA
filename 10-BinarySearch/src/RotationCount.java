package com.BinarySearch;

import java.util.ArrayList;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {8,9,10,0,1,2,3,4,5,6,7};
        System.out.println(findKRotation(arr));
    }
    static int findKRotation(int[] nums){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int min = Integer.MAX_VALUE;
        int count = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[mid]){
                if(nums[low] < min){
                    min = nums[low];
                    count = low;
                }
                low = mid + 1;
            }
            else {
                if (nums[mid] < min){
                    min = nums[mid];
                    count = mid;
                }
                high = mid - 1;
            }
        }
        return count;
    }
}
