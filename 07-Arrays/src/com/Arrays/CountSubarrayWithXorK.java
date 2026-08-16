package com.Arrays;

import java.util.HashMap;

public class CountSubarrayWithXorK {
    static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        System.out.println(countSubarrays(arr,6));
        System.out.println(countsubarrays(arr,6));
    }

    //brute force
    static int countSubarrays(int[] nums,int k){
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == k) count++;
            int xor = nums[i];
            for (int j = i+1; j < n; j++) {
                    xor ^= nums[j];
                    if (xor == k) count++;
            }
        }
        return count;
    }

    //optimized soln:
    static int countsubarrays(int[] nums,int k){
        int n = nums.length;
        int xor = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            count += map.getOrDefault(xor ^ k,0);
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
