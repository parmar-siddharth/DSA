package com.BinarySearch;

public class MinimumInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,0,1,2,3,4,5};
        System.out.println(findMin(arr));
    }
//    static int findMin(int[] nums){
//        int n = nums.length;
//        int ans = Integer.MAX_VALUE;
//        int low = 0;
//        int high = n - 1;
//        while(low <= high){
//            int mid = low + (high - low) / 2;
//            if(nums[low] <= nums[mid]){
//                ans = Math.min(ans,nums[low]);
//                low = mid + 1;
//            }
//            else{
//                ans = Math.min(ans,nums[mid]);
//                high = mid - 1;
//            }
//        }
//        return ans;
//    }
    static int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return nums[high];
    }
}
