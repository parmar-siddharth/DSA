package com.Arrays;

import java.util.Arrays;

public class MoveZeros {
    static void main(String[] args) {
        int[] arr = {2,1,0,3,9,12,5,7,0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
