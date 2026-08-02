package com.Arrays;

import java.util.Arrays;

/*
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.


 */
public class RearrangeElementsBySign {
    static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int neg = 1;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0){
                res[pos] = nums[i];
                pos += 2;
            }
            else {
                res[neg] = nums[i];
                neg += 2;
            }
        }
        return res;
    }
    static int[] rearrangeArray2(int[] nums){
        int n = nums.length;
        int pos = 0;
        int neg = 1;
        while (pos < n && neg < n){
            if (nums[pos] >= 0){
                pos += 2;
            } else if (nums[neg] < 0) {
                neg += 2;
            }
            else {
                int temp = nums[pos];
                nums[pos] = nums[neg];
                nums[neg] = temp;
            }
        }
        return nums;
    }
}
