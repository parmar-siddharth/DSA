package com.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FloorAndCeilOfaNumber {
    static void main(String[] args) {
        int[] arr = {1,3,4,5,6,8,9,11,13,14,45};
        System.out.println(Arrays.toString(getFloorAndCeil(arr,46)));
    }
    static int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == x) return new int[]{nums[mid],nums[mid]};
            if(nums[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        // edge case : x is not in range of array either < than smaller element of array or
        // bigger than largest element of array
        int floor = (high >= 0) ? nums[high] : -1;
        int ceil = (low < n) ? nums[low] : -1;
        return new int[]{floor,ceil};
    }
}
