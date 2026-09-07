package com.Arrays;

public class DisasterReliefWindow {
    static void main(String[] args) {
        int[] scores = {-8,-3,-6,-2,-5};
        System.out.println(maximumSum(scores));
    }
    static int maximumSum(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += nums[i];
            if (curr > max) max = curr;
            if (curr < 0) curr = 0;
        }
        return max;
    }
}
