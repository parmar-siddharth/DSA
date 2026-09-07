package com.recursion;

import java.util.Arrays;

public class ReveseAnArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr,int low,int high)
    {

        if(low >= high){
            return;
        }

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        reverse(arr,low+1,high-1);
    }
}
