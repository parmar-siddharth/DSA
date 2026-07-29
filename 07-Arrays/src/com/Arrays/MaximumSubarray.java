package com.Arrays;

public class MaximumSubarray {
    static void main(String[] args) {
        int[] arr = {-2,-1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] arr) {
        int largestSum =  arr[0];
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++){
            currentSum += arr[i];

            if(currentSum > largestSum){
                largestSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return largestSum;
    }
}
