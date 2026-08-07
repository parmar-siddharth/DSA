package com.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
        System.out.println(longestsequence(arr));
    }
    static int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 1 ;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int count = 1;
            while (linearSearch(nums,x+1)){
                x++;
                count++;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    static boolean linearSearch(int[] arr,int target){
        for (int i : arr){
            if (i == target){
                return true;
            }
        }
        return false;
    }

    //better soln:
    static int longestSeq(int[] arr){
        int longest = 1;
        Arrays.sort(arr);
        int count = 1;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-1 == lastSmaller){
                count++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }

    //optimal soln :
    static int longestsequence(int[] nums){
        int n = nums.length;
        if (n == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int longest = 1;
        for (int num : set){
            if (!set.contains(num-1)){
                int current = num;
                int count = 1;
                while (set.contains(current+1)){
                    count += 1;
                    current += 1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
