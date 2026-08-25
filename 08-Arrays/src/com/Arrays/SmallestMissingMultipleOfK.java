package com.Arrays;

import java.util.HashSet;

public class SmallestMissingMultipleOfK {
    static void main(String[] args) {
        int[] arr = {1,4,7,10,15};
        System.out.println(missingMultiple(arr,5));
    }
    static int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int smallestMissing = Integer.MAX_VALUE;
        for(int i = 1; i <= 10; i++){
            int curr = k * i;
            if(!set.contains(curr)){
                smallestMissing = Math.min(smallestMissing,curr);
            }
        }
        return smallestMissing;
    }
}
