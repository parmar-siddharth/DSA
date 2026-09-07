package com.Arrays;

public class ThirdLargestElement {
    static void main(String[] args) {
        int[] arr = {7,4,5,2,9,4,1,8,2,5,1,5,5,2,4,12,5,1,5,15,25,51,5,1,0,4};
        System.out.println(thirdMax(arr));

    }
    static int thirdMax(int[] nums) {
       int n = nums.length;
       int firstlargest = Integer.MIN_VALUE;
       int secondlargest = Integer.MIN_VALUE;
       int thirdlargest = Integer.MIN_VALUE;
       for (int i = 0; i < n ; i++){
           if (nums[i] > firstlargest && nums[i] != secondlargest && nums[i] != thirdlargest){
               thirdlargest = secondlargest;
               secondlargest = firstlargest;
               firstlargest = nums[i];
           }
           else if (nums[i] > secondlargest && nums[i] != firstlargest && nums[i] != thirdlargest){
               thirdlargest = secondlargest;
               secondlargest = nums[i];
           }
           else if (nums[i] > thirdlargest && nums[i] != secondlargest && nums[i] != firstlargest){
               thirdlargest = nums[i];
           }
       }
       return thirdlargest;
    }
}
