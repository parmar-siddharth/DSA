package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistributeElementsIntoTwoArrays {
    static void main(String[] args) {
        int[] nums = {8, 3, 7, 2, 6, 6, 1};
        System.out.println(Arrays.toString(resultArray(nums)));
    }
//    static int[] resultArray(int[] nums) {
//        int n = nums.length;
//        int i = 0;
//        int j = 0;
//        List<Integer> arr1 = new ArrayList<>();
//        arr1.add(nums[0]);
//        List<Integer> arr2 = new ArrayList<>();
//        arr2.add(nums[1]);
//        for (int k = 2; k < n; k++) {
//           if (arr1.get(i) > arr2.get(j)){
//               arr1.add(nums[k]);
//               i++;
//           }
//           else {
//               arr2.add(nums[k]);
//               j++;
//           }
//        }
//        int[] result = new int[n];
//        int index = 0;
//        for (int num : arr1){
//            result[index++] = num;
//        }
//        for (int num : arr2){
//            result[index++] = num;
//        }
//        return result;
//    }
    static int[] resultArray(int[] nums){
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int k = 2; k < n; k++){
            if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)){
                arr1.add(nums[k]);
            }
            else{
                arr2.add(nums[k]);
            }
        }
        int[] result = new int[n];
        int index = 0;
        for(int num : arr1){
            result[index++] = num;
        }
        for(int num : arr2){
            result[index++] = num;
        }
        return result;
    }
}
