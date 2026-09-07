package com.BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr ={0,4,7,9,12,8,6,3,1};
        int target = 3;
        int peak = peakIndexInMountainArray(arr);
        System.out.println(peak);
        int firstCheck = orderAgnosticBS(arr,target,0,peak);
        if(firstCheck != -1){
            System.out.println(firstCheck);
        }
        else {
            int secondCheck = orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
            System.out.println(secondCheck);
        }
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr,int target,int start,int end){

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
