package com.Arrays;

import java.util.HashMap;

public class MajorityElementII {
    static void main(String[] args) {
        /*
        Given an array nums of size n, return the majority element.

        The majority element is the element that appears more than ⌊n / 2⌋ times.
        You may assume that the majority element always exists in the array.
         */

        int[] arr = {1};
        System.out.println(majorityElement2(arr));
    }

    //brute force approach:
    static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        int element = 0;
        for(int j : map.keySet()){
            if(map.get(j) > max){
                max = map.get(j);
                element = j;
            }
        }
        return element;
    }

    //brute force approach with less lines of code
    static int majorityElement2(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int limit = n/3;
        for(int i : nums){
            int freq = map.getOrDefault(i, 0)+1;
            if(freq > limit){
                return i;
            }
            //map.put(i, map.getOrDefault(i, 0) + 1);
            map.put(i,freq);
        }
        return -1;
    }

}
