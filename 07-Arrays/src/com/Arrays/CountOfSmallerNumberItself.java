package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfSmallerNumberItself {
    static void main(String[] args) {
        int[] arr = {5,2,6,1};
        System.out.println(countSmaller(arr));
    }
    static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;

        int[] count = new int[n];

        int[] index = new int[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        mergeSort(nums,0,n-1,count,index);

        List<Integer> ans = new ArrayList<>();

        for (int num : count){
            ans.add(num);
        }

        return ans;
    }
    static void mergeSort(int[] nums,int low,int high,int[] count,int[] index){
        if (low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSort(nums,low,mid,count,index);
        mergeSort(nums,mid+1,high,count,index);

        merge(nums,low,mid,high,count,index);
    }

    static void merge(int[] nums,int low,int mid,int high,int[] count,int[] index){
        int i = low;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[high - low + 1];
        int[] tempIndex = new int[high - low + 1];
        while (i <= mid && j <= high){
            if (nums[i] >  nums[j]){
                count[index[i]] += high - j + 1;
                temp[k] = nums[i];
                tempIndex[k] = index[i];
                i++;
                k++;
            }
            else {
                temp[k] = nums[j];
                tempIndex[k] = index[j];
                j++;
                k++;
            }
        }
        while (i <= mid){
            temp[k] = nums[i];
            tempIndex[k] = index[i];
            i++;
            k++;
        }
        while (j <= high){
            temp[k] = nums[j];
            tempIndex[k] = index[j];
            j++;
            k++;
        }
        for (int l = 0; l < temp.length; l++) {
                nums[low + l] = temp[l];
                index[low + l] = tempIndex[l];
        }
    }
}
