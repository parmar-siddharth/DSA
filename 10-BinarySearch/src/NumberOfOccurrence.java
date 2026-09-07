package com.BinarySearch;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,5,6,7,8,8,8,9,10};
        System.out.println(countOccurrences(arr,8));
    }
    static int first(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                ans = mid;
                end = mid - 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;
    }
    static int last(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                ans = mid;
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int countOccurrences(int[] arr,int target){
        int [] result = {first(arr,target),last(arr, target)};
        if (result[0] == -1) return 0;
        int count = result[1] - result[0] + 1;
        return count;
    }
}
