package com.Arrays;

public class AverageOfArrayElements {
    static void main(String[] args) {
        int[] arr ={5,8,4,12,6};
        System.out.println(average(arr));
    }

    static int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
