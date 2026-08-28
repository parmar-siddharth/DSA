package com.BinarySearch;

public class BookAllocationProblem {
    static void main(String[] args) {
        int[] nums = {12, 34, 67, 90};
        System.out.println(findPages(nums,2));
    }
    static int findPages(int[] nums,int m){
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int num : nums){
            low = Math.max(low,num);
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canAllocate(nums,m,mid)){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    static boolean canAllocate(int[] nums,int m ,int pages){
        int students = 1;
        int  sum = 0;
        for (int book : nums){
            if ((sum + book) > pages){
                students++;
                sum = book;
            }
            else sum += book;
        }
        return students <= m;
    }
}
