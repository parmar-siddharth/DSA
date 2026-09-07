package com.Map;

import java.util.HashMap;

public class HashMap3 {
    static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {2,1,6,3,4,7,3,1,8};
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
