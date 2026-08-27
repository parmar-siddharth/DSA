package com.BinarySearch;

import com.sun.source.tree.BreakTree;

public class FindKthMissingPositive {
    static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(findKthPositive(arr,17));
    }
    /// brute force with linear time complexity
//    static int findKthPositive(int[] arr, int k){
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int missing = arr[i] - (i + 1);
//            if (missing >= k){
//                return k + i;
//            }
//        }
//        return k + n;
//    }

    /// optimal with logarithmic time complexity
    static int findKthPositive(int[] arr,int k){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) low = mid + 1;
            else high = mid - 1;

        }
        return low + k;
    }
}
