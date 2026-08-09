package com.Arrays;

import java.util.HashMap;

public class SubarraySumDivisibleByK {
    static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(arr,5));
    }
    static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum % k == 0) count += 1;
            int rem = sum % k;
            if (map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
