package com.Arrays;

import java.util.Arrays;

public class TrappingRainWater {
    static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        //int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
//    static int trap(int[] height) {
//        int n = height.length;
//        int water = 0;
//        for (int i = 0; i < n; i++) {
//            int unit = 0;
//            int leftMax = Integer.MIN_VALUE;
//            int rightMax = Integer.MIN_VALUE;
//            for (int j = i; j >= 0; j--) {
//                leftMax = Math.max(leftMax,height[j]);
//            }
//            for (int k = i; k < n; k++) {
//                rightMax = Math.max(rightMax,height[k]);
//            }
//            water += Math.min(leftMax,rightMax) - height[i];
//        }
//        return water;
//    }

    /// optimal soln
    static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int leftmax = Integer.MIN_VALUE;
        int rightmax = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            rightmax = Math.max(rightmax,height[i]);
            right[i] = rightmax;
        }
        System.out.println(Arrays.toString(right));
        for (int j = 0; j < n; j++) {
            leftmax = Math.max(leftmax,height[j]);
            left[j] = leftmax;
        }
        System.out.println(Arrays.toString(left));
        int units = 0;
        for (int k = 0; k < n; k++) {
            units += Math.min(left[k], right[k]) - height[k];
        }
        return units;
    }
}
