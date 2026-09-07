package com.BinarySearch;

public class PosInfiniteElements {
    public static void main(String[] args) {
        int[] arr = {4,9,13,19,27,34,42,53,67,76,83,98,158,194,252,396,428,572,691,785,856,945,1024,1295,1458,1698,1724,1859};
        System.out.println(ans(arr,194));
    }
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return mid;
            }else if (target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
