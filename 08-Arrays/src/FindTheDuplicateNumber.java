package com.Arrays;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        int  n = nums.length;
        int i = 0;
        while (i < n){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        int duplicateNumber = -1;
        for (int j = 0; j < n; j++) {
            if (nums[j] != j){
                duplicateNumber = nums[j];
            }
        }
        return duplicateNumber;
    }
}
