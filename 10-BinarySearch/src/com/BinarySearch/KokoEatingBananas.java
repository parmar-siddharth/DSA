package com.BinarySearch;

public class KokoEatingBananas {
    static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        System.out.println(minEatingSpeed(piles,5));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int num : piles){
            max = Math.max(max,num);
        }
        int low = 0;
        int high = max;
        int ans = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (canFinish(piles,mid,h)){
                ans = mid;
                high = mid - 1;
            }
            else {
                low =  mid + 1;
            }
        }
        return ans;
    }
    static boolean canFinish(int[] piles, int k, int h){
        long hours = 0;
        for (int pile : piles){
            hours += pile / k;
            if (pile % k != 0) hours++;
        }
        return hours <= h;
    }
}
