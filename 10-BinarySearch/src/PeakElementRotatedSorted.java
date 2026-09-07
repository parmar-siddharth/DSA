package com.BinarySearch;

public class PeakElementRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {5,8,9,11,13,17,19,21,27,33,37,0,1,2,3};
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (arr[mid - 1] > arr[mid]){
                return mid - 1;
            }

            if (arr[start] <= arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
