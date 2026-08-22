package com.Arrays;

import java.util.Arrays;

public class PlusOne {
    static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i] < 10){
                return digits;
            }else {
                digits[i] = 0;
            }
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
}