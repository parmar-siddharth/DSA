package com.BinarySearch;

public class FindSmallestDivisor {
    static void main(String[] args) {
        int[] nums = {44,22,33,11,1};
        System.out.println(smallestDivisor(nums,5));
    }
    static int smallestDivisor(int[] nums, int threshold){
        int max = Integer.MIN_VALUE;

        for (int num : nums){
            max = Math.max(max,num);
        }

        int low = 1;
        int high = max;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (isDivisible(nums,threshold,mid)){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    static boolean isDivisible(int[] nums,int threshold,int divisor){
        int sum = 0;
        for (int num : nums){
            sum += num / divisor;
            if (num % divisor != 0) sum++;
        }
        return sum <= threshold;
    }
}
