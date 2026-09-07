package com.Arrays;

public class FirstUnsortedElement {
    static void main(String[] args) {
        int[] arr = {4,8,7,9,2,1,2,7,8,3,8};
        System.out.println(firstUnsortedElement(arr));
    }
    static int firstUnsortedElement(int[] nums) {
       for (int i = 0; i < nums.length; i++) {
           if(nums[i] > nums[i+1]){
               return nums[i];
           }
       }
       return -1;
    }
}
