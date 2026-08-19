package com.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5,7,9,12,8,17,6,19,28,41,27,24};
        System.out.println(largest(arr));
    }

    static int largest(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    // another method using for each loop
    static int largest2(int[] nums){
        int largest = Integer.MIN_VALUE;
        for (int num : nums){
            if (num > largest){
                largest = num;
            }
        }
        return largest;
    }

}
