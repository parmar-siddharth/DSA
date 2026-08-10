package com.Arrays;

import java.util.HashMap;

public class ContinousSubarraySum {
    static void main(String[] args) {
        int[] arr = {22,4,5,6,7,1,2,9};
        System.out.println(checkSubarraySum(arr,4));
    }
    static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            //if (i >= 1 && sum % k == 0) return true;
            int rem = sum % k;
            if (map.containsKey(rem)){
                if (i - map.get(rem) >= 2) return true;
            }
            else {
                map.put(rem,i);
            }
        }
        return false;
    }
}
