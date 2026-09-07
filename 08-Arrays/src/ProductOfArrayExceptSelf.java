package com.Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf{
    static void main(String[] args) {
        int[] nums = {2,5,3,6};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    /// brute force
//    static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//        int index = 0;
//        while (index < n){
//            int prod = 1;
//            for (int i = index - 1; i >= 0; i--){
//                prod *= nums[i];
//            }
//            for (int j = index + 1; j < n; j++){
//                prod *= nums[j];
//            }
//            ans[index] = prod;
//            index++;
//        }
//        return ans;
//    }

    /// optimal sol
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int[] left = new int[n];
        left[0] = 1;
        int[] right = new int[n];
        right[n-1] = 1;
        for (int j = 0; j < n-1; j++) {
            leftProduct *= nums[j];
            left[j+1] = leftProduct;
        }
        for (int i = n - 1; i > 0; i--){
            rightProduct *= nums[i];
            right[i-1] = rightProduct;
        }
        int[] ans = new int[n];
        for (int k = 0; k < n; k++){
            ans[k] = left[k] * right[k];
        }
        return ans;
    }
}
