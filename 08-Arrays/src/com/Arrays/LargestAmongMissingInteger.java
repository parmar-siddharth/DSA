package com.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class LargestAmongMissingInteger {
    static void main(String[] args) {
        int[] arr = {3,9,2,1,7};
        System.out.println(largestInteger(arr,3));
    }
    static int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int largest = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <= n-k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i+k; j++) {
                set.add(nums[j]);
            }
            for(int num : set){
                map.put(num,map.getOrDefault(num, 0) + 1);
            }
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                largest = Math.max(largest, num);
            }
        }
        return largest;
    }
}
