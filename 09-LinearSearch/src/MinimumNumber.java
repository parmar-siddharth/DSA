package com.LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {87,58,63,45,81,25,76,48,81,25,30,73,19,46};
        System.out.println(MinNum(arr  ));
    }
    static int MinNum(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
