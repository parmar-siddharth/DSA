package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubarrayWithSumK {
    static void main(String[] args) {
        int[] arr = {1,0,3,1,4,2,2,1,1,2,3};
        System.out.println(longestSubarray2(arr,4));
    }
    //brute force approach : O (n²)
    static int longestSubarray(int[] arr, int k) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    //prefix + hashmap:
    static int longestSubarray2(int[] arr, int k) {

        int maxLength = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k)
                maxLength = i+1;

            int req = sum - k;

            int len = 0;

            if (map.containsKey(req)){
                len = i-map.get(req);
                maxLength = Math.max(maxLength,len);
            }

            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
}
