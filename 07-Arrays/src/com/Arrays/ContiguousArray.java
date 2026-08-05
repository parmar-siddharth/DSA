package com.Arrays;

import java.util.HashMap;

public class ContiguousArray {
    static void main(String[] args) {
        //int[] arr = {0,1,1,1,1,1,0,0,0};
        int[] arr = {0,1};
        System.out.println(findMaxLength(arr));
    }
    static int findMaxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int zero = 0;
            int ones = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0){
                    zero += 1;
                } else if (nums[j] == 1) {
                    ones += 1;
                }
                if (zero == ones){
                    int length = zero + ones;
                    maxLen = Math.max(length,maxLen);
                }
            }
        }
        return maxLen;
    }

}
