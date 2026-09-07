package com.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    static void main(String[] args) {
     //Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.
        int[] arr = {1,2};
        System.out.println(majorityELement(arr));
    }

    //brute force
//    static List<Integer> majorityElement(int[] nums) {
//        int n = nums.length;
//        List<Integer> ans = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            if(ans.contains(nums[i])){
//                continue;
//            }
//            int count = 0;
//            for(int j = 0; j < n; j++){
//                if(nums[j] == nums[i]){
//                    count++;
//                }
//            }
//            if(count > n / 3){
//                ans.add(nums[i]);
//            }
//        }
//        return ans;
//    }




    // better solution
//    static List<Integer> majorityElement(int[] nums) {
//        int n = nums.length;
//        int limit = n/3;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        List<Integer> list = new ArrayList<>();
//        for(int num : nums){
//            int freq = map.getOrDefault(num,0)+1;
//            if(freq > limit){
//                if(!list.contains(num)) {
//                    list.add(num);
//                }
//            }
//            map.put(num,freq);
//        }
//        return list;
//    }

    static List<Integer> majorityELement(int[] nums){
        int n = nums.length;
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != candidate2){
                count1++;
                candidate1 = nums[i];
            }
            else if (count2 == 0 && nums[i] != candidate1) {
                count2++;
                candidate2 = nums[i];
            }
            else if (nums[i] == candidate1){
                count1++;
            }else if (nums[i] == candidate2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        int limit = n/3;
        for (int i = 0; i < n; i++) {
            count1 = 0;
            count2 = 0;
            if (nums[i] == candidate1){
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            }
        }
        if (count1 > limit){
            list.add(candidate1);
        }
        if (count2 > limit){
            list.add(candidate2);
        }
        return list;
    }
}
