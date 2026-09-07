package com.Bitwise;

import java.util.Arrays;
import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1,5};
        System.out.println(missingNumber2(arr));
    }
    static int missingNumber(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }

    static int missingNumber2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i,nums[i]);
        }
        System.out.println(Arrays.toString(map.keySet().toArray()));
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsValue(i)) {
                return i;
            }
        }
        return -1;
    }
}

