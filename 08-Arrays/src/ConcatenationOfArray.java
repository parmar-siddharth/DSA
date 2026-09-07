package com.Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(Concatenation(arr)));
    }
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n*2];
        for(int i = 0;i < arr.length;i++){
            if(i < n){
                arr[i] = nums[i];
            }
            else {
                arr[i] = nums[i-n];
            }
        }
        return arr;
    }

    static int[] Concatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n*2];
        for(int i = 0;i < arr.length;i++){
            arr[i] = nums[i % n];
        }
        return arr;
    }

}
