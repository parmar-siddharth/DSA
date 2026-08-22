package com.Arrays;

public class LongestSubseqWithNonZeroXOR {
    static void main(String[] args) {
        int[] arr = {0,7};
        System.out.println(longestSubsequence(arr));
    }
    static int longestSubsequence(int[] nums) {
        int n = nums.length;
        int longest = 0;
        int xor = 0;
        boolean hasNonZero = false;
        for(int num : nums){
            xor ^= num;
            if (num != 0) hasNonZero = true;
        }
        if (xor != 0) longest = n;
        else if (hasNonZero) longest = n - 1;

        return longest;
    }
}
