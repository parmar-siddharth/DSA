package com.Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[k]){
                k += 1;
                int temp =  nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
            }
        }
        return k+1;
    }
}
