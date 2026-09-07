package com.Arrays;

import java.util.Arrays;

public class SumOfPosNegNumbers {
    public static void main(String[] args) {
        int[] arr = {4,1,-5,7,8,-5,6,1,-7,14,-8,45};
        System.out.println(Arrays.toString(posNegSum(arr)));
    }
    static int[] posNegSum(int[] arr){
        int positiveSum = 0;
        int negativeSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                positiveSum += arr[i];
            }
            else{
                negativeSum += arr[i];
            }
        }
        return new int[]{positiveSum, negativeSum};
    }
}
