package com.BinarySearch;

public class upperBound {
    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};
        System.out.println(upperBound(arr,8));
    }
    static int upperBound(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high =  n - 1;
        int ans = -1;
        while(low <= high){
           int mid = low + (high - low) / 2;
           if(nums[mid] > x){
               ans = mid;
               high = mid - 1;
           }
           else{
               low = mid + 1;
           }
        }
        return ans;
    }
}
