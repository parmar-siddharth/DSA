package com.Arrays;

public class MaxConsecutiveOnes {
    static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,1,1,0,1,0,1,1,1,1,0,1,0};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int current = 0;
        for(int i = 0;i < n;i++){
            if(nums[i] == 1){
                current += 1;
            }else{
                current = 0;
            }
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}
