package com.Arrays;

import java.util.Arrays;

public class RotateArraybyOne {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        rightRotateby1(arr);
//        System.out.println(Arrays.toString(arr));
        leftRotateby1(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rightRotateby1(int[] nums) {
      int n =  nums.length;
      int temp = nums[n-1];
      for (int i = n-2; i >= 0; i--){
          nums[i+1] = nums[i];
      }
      nums[0] = temp;
    }

    static void leftRotateby1(int[] nums) {
        int n = nums.length;
        int temp = nums[0];
        for (int i = 1; i < n; i++){
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
    }
}
