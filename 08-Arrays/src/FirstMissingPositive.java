package com.Arrays;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n){
            int correctIndex = nums[i]-1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < n; j++) {
            if (nums[j] != j+1){
              return j+1;
            }
        }
        return n+1;
    }
}
