package com.Arrays;

public class ArrayIsSorted {
    static void main(String[] args) {
        int[] arr = {1,2,9,5,7,8};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int[] nums){
       int n = nums.length;
       boolean issorted = true;
       for (int i = 1; i < n; i++){
           if (nums[i] >= nums[i-1]){
               issorted = true;
           }
           else{
               issorted = false;
           }
       }
       return issorted;
    }
}
