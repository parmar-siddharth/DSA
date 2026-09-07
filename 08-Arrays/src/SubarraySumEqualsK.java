package com.Arrays;

import java.util.HashMap;

public class SubarraySumEqualsK {
    static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        System.out.println(subarraySum(arr,2));
    }
    static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    //optimal soln : prefix sum + hashmap
    static int subarraySum2(int[] nums, int k) {
        int subarr = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if(sum == k)
                subarr += 1;

            int req = sum - k;

            if (map.containsKey(req)){
                subarr += map.get(req);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return subarr;
    }
}
