package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum2(arr,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }

    static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (map.containsKey(n)){
                return new int[]{map.get(n),i};
            }
            else {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
