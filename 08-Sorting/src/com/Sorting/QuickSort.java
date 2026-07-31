package com.Sorting;

import java.util.Arrays;

public class QuickSort {
    static void main(String[] args) {
        int[] arr = {2,4,9,1,6,7,10,3,5,8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int i = start;
        int j = end;
        int pivot = arr[(start + end) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        quickSort(arr, start, j);
        quickSort(arr, i, end);
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
