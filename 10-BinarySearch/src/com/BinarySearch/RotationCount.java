package com.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {8,9,10,0,1,2,3,4,5,6,7};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;
        while (start <= end){
            int  mid = start + (end - start) / 2;
            if (arr[start] <= arr[mid]){
                if (arr[start] < min){
                    min = arr[start];
                    index = start;
                }
                start = mid + 1;
            }
            else {
                if (arr[mid] < min){
                    min = arr[mid];
                    index = mid;
                }
                end = mid - 1;
            }
        }
        return index;
    }
}
