package com.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianOfTwoSortedArray {
    static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] temp = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                temp[k++] = nums1[i++];
            }
            else{
                temp[k++] = nums2[j++];
            }
        }
        while(i < n1){
            temp[k++] = nums1[i++];
        }
        while(j < n2){
            temp[k++] = nums2[j++];
        }
        System.out.println(Arrays.toString(temp));
        if(n % 2 == 0){
            return (double) (temp[n/2] + temp[n/2 - 1]) / 2;
        }
        else{
            return temp[n/2];
        }
    }
}
