package com.Arrays;

import java.util.Arrays;

public class CountInversion {
    static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        System.out.println(countInversions(arr));
//        int[] nums1 = {2,3,5,6};
//        int[] nums2 = {2,2,4,4,8};
//        System.out.println(countInversions(nums1,nums2));
    }

    /// brute force
//    static int countInversions(int[] nums){
//        int n = nums.length;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (nums[i] > nums[j]) count++;
//            }
//        }
//        return count;
//    }

    /// optimal solution
    static int countInversions(int[] nums){
        return mergeSort(nums,0,nums.length-1);
    }
    static int mergeSort(int[] arr,int low,int high) {
        if(low >= high) return 0;

        int mid = low + (high - low) / 2;

        int count = 0;

        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);

        count += merge(arr,low,mid,high);

        return count;
    }

    static int merge(int[] nums,int low,int mid,int high){

        int i = low;
        int j = mid+1;

        int count = 0;

        int[] temp = new int[high - low + 1];

        int k = 0;

        while (i <= mid && j <= high){

            if (nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }
            else {
                temp[k++] = nums[j++];

                count += mid - i + 1;

            }
        }

        while (i <= mid){
            temp[k++] = nums[i++];
        }

        while (j <= high){
            temp[k++] = nums[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            nums[low + l] = temp[l];
        }
        return count;
    }

}
