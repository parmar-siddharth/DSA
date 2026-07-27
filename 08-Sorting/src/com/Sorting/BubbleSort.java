package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        bubbleSort(arr);
    }
    static void bubbleSort(int[] arr){
        int n =  arr.length;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=1;j <= n-i-1;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
