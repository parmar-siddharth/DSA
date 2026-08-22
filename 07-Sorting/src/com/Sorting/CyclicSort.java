package com.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Important pattern :
When given numbers from range 1 to N then use cyclic sort
 */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] nums){
        int n = nums.length;
        int i = 0;
        while (i < n){
            int index = nums[i] - 1;
            if (nums[i] != nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else {
                i++;
            }
        }
        return nums;
    }
}
