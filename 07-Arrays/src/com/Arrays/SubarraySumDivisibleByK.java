package com.Arrays;

import java.util.HashMap;

public class SubarraySumDivisibleByK {
    static void main(String[] args) {
        int[] arr = {-1,2,9};
        System.out.println(subarraysDivByK(arr,2));
    }
    static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int rem = ((sum % k) + k) % k;
            if (map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
            System.out.println(map);
        }
        return count;
    }
}
