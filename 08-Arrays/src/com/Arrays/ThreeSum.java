package com.Arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
//    static List<List<Integer>> threeSum(int[] nums) {
//        ArrayList<List<Integer>> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> temp = new ArrayList<>();
//                        temp.add(nums[i]);
//                        temp.add(nums[j]);
//                        temp.add(nums[k]);
//                        Collections.sort(temp);
//                        if (!list.contains(temp)) {
//                            list.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        return list;
//    }

//    static List<List<Integer>> threeSum(int[] nums){
//        int n = nums.length;
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            HashSet<Integer> set = new HashSet<>();
//            for (int j = i+1; j < n; j++) {
//                int third = -(nums[i] + nums[j]);
//                if (set.contains(third)){
//                    List<Integer> list = new ArrayList<>();
//                    list.add(nums[i]);
//                    list.add(nums[j]);
//                    list.add(third);
//                    Collections.sort(list);
//                    if (!ans.contains(list)) {
//                        ans.add(list);
//                    }
//                }
//                    set.add(nums[j]);
//            }
//        }
//        return ans;
//    }

    static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) j++;
                else if (sum > 0) k--;
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while (j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}
