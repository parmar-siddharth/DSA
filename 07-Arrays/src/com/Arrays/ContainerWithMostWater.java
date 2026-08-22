package com.Arrays;

public class ContainerWithMostWater {
    static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    /// Brute force
    static int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int area = 0;
            for(int j = n-1; j > i; j--){
                area = (j - i) * Math.min(height[i],height[j]);
                max = Math.max(max,area);
            }
        }
        return max;
    }

    /// optimal sol
//    static int maxArea(int[] height) {
//        int i = 0;
//        int j = height.length-1;
//        int max = Integer.MIN_VALUE;
//        while (i < j){
//            int area = (j - i) * Math.min(height[i],height[j]);
//            if (area > max){
//                max = area;
//            }
//            if (height[i] > height[j]){
//                j--;
//            }
//            else {
//                i++;
//            }
//        }
//        return max;
//    }

}