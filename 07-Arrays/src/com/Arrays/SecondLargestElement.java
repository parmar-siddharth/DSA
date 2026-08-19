package com.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {9,8,7,2,9,2,7,8,3,8};
        System.out.println(secondLargestElement(nums));

    }
    static int secondLargestElement(int[] nums) {
        int n = nums.length;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (nums[i] > firstLargest && nums[i] != secondLargest){
                secondLargest = firstLargest;
                firstLargest = nums[i];
            }
            else if (nums[i] > secondLargest && nums[i] != firstLargest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
}
