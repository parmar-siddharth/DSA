package com.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {87,54,44,37,33,27,21,19,17,15,9,7,1};
        System.out.println(orderAgnosticBS(arr,33));
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAscending){
                if (target < arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
