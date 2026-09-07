package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesInArray {
    static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    //Brute Solution
    static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i : nums){
            if(map.get(i) > 1){
                list.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        return list;
    }
}
