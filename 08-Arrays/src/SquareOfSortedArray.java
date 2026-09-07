package com.Arrays;

import java.util.Arrays;

public class SquareOfSortedArray {
    static void main(String[] args) {
        int[] arr = {-14,-9,-3,4,7,12};
        System.out.println(Arrays.toString(sortedSquares2(arr)));
    }
    static int[] sortedSquares2(int[] nums) {
        int[] result = new int[nums.length];
        int low = 0;
        int high = nums.length - 1;
        for (int i = nums.length-1; i >= 0; i--) {
            if(Math.abs(nums[low]) > Math.abs(nums[high])){
                result[i] = nums[low] * nums[low];
                low++;
            }
            else{
                result[i] = nums[high] * nums[high];
                high--;
            }
        }
        return result;
    }

    static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

}
