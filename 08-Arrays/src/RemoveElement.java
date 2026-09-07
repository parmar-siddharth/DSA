package com.Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement2(arr,2));
    }
    static int removeElement(int[] nums, int val) {
        int n =  nums.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
               k++;
            }
        System.out.println(Arrays.toString(nums));
        }
        return k;
    }
    static int removeElement2(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        for(int i=0;i < n;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
