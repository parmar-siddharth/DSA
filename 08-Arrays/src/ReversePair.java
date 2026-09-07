package com.Arrays;

public class ReversePair {
    static void main(String[] args) {
        int[] arr = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(arr));
    }
    static int reversepairs(int[] nums){
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] > (long) 2 * nums[j]) count++;
            }
        }
        return count;
    }
    static int reversePairs(int[] nums){
        return mergeSort(nums,0,nums.length-1);
    }
    static int mergeSort(int[] arr,int low,int high){
        if (low >= high) return 0;

        int mid = low + (high - low) / 2;

        int count = 0;

        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);

        count += countPairs(arr,low,mid,high);

        merge(arr,low,mid,high);
        return count;
    }

    private static int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int i = low;
        int j = mid+1;
        while (i <= mid && j <= high){
            if (arr[i] <= (long) 2 * arr[j]){
                i++;
            }
            else {
                count += mid - i + 1;
                j++;
            }
        }
        return count;
    }

    static void merge(int[] arr,int low,int mid,int high){
        int i = low;
        int j = mid + 1;

        int[] temp = new int[high - low + 1];

        int k = 0;

        while (i <= mid && j <= high){
            if (arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid){
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= high){
            temp[k] = arr[j];
            k++;
            j++;
        }

        for (int x = 0; x < temp.length;x++){
            arr[low+x] = temp[x];
        }

    }
}
