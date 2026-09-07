package com.Arrays;

import java.util.Arrays;

/*
0 -------- low-1        => All 0s

low ------ mid-1        => All 1s

mid ------ high         => Unknown elements

high+1 ---- n-1         => All 2s
 */
public class SortColors {
    static void main(String[] args) {
        int[] arr = {0,2,1,1,0,2,1,0,1,2,1,0,2,1,1,2,1,1,2,0,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortColors(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid <= high){

            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                swap(arr,high,mid);
                high--;
            }
        }

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
