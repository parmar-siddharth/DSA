package com.Arrays;

public class CheckIfArrayIsSortedRotated {
    static void main(String[] args) {

    }
    /*
    Leetcode : 1752
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.
*/
    static boolean check(int[] nums){
        int n = nums.length;
        int rotated = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] >= nums[i + 1 % n]){
                rotated++;
            }
        }
        if (rotated <= 1){
            return true;
        }
        return false;
    }
}
