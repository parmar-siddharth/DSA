package com.BinarySearch;

public class KokoEatingBananas {
    static void main(String[] args) {
        int[] piles = {805306368,805306368,805306368};
        System.out.println(minEatingSpeed(piles,1000000000));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int bananas : piles){
            max = Math.max(max,bananas);
        }
        int low = 1;
        int high = max;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canEat(piles,mid,h)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean canEat(int[] piles,int k,int h){
        long hours = 0;
        for(int bananas : piles){
            hours += bananas / k;
            if(bananas % k != 0) hours++;
        }
        return hours <= h;
    }
}
