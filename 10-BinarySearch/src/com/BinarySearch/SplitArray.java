package com.BinarySearch;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }
    static int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num : nums){
            low = Math.max(low,num);
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canSplit(nums,k,mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    static boolean canSplit(int[] nums,int k,int largSum){
        int partitions = 1;
        int sum = 0;
        for(int num : nums){
            if((sum + num) > largSum){
                partitions++;
                sum = num;
            }
            else sum += num;
        }
        return partitions <= k;
    }
}
