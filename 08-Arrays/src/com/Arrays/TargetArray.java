package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] op = {0,4,1,3,2};
        System.out.println(Arrays.toString(createTargetArray2(nums, index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            int idx =  index[i];
            for (int j = size; j > idx; j--) {
                target[j] = target[j-1];
            }
            target[idx] = nums[i];
            size++;
        }
        return target;
    }
    static int[] createTargetArray2(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
