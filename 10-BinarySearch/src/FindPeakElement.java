package com.BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {7,2,1,3,5,16,4};
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] nums){
        int n = nums.length;
        if (n == 1) return 0;
        if (nums[0] > nums[1]){
            return 0;
        }
        if (nums[n-1] > nums[n-2]){
            return n-1;
        }
        int start = 1;
        int end = n-2;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]){
                return mid;
            }
            else if (nums[mid + 1] > nums[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
