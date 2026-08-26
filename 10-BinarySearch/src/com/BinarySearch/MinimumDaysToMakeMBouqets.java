package com.BinarySearch;

public class MinimumDaysToMakeMBouqets {
    static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        System.out.println(minDays(bloomDay,3,2));
        // [1,10,3,10,2], m = 3, k = 1
        // [1,10,3,10,2], m = 3, k = 2
    }
    static int minDays(int[] bloomDay, int m, int k) {
        int max = Integer.MIN_VALUE;
        for (int day : bloomDay){
            max = Math.max(max, day);
        }
        int low = 1;
        int high = max;
        int ans = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay,k,m,mid)){
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] bloomDay,int k,int m,int mid){
        int bouqets = 0;
        int count = 0;
        for (int day : bloomDay){
            if (day <= mid){
                count++;

                if (count == k){
                    bouqets++;
                    count = 0;
                }

            }
            else {
                count = 0;
            }
        }
        return bouqets >= m;
    }
}
