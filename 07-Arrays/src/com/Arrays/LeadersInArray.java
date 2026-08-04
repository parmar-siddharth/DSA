package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    static void main(String[] args) {
        int[] nums = {10,22,12,12,3,0,6};
        System.out.println(Arrays.toString(leader(nums)));
    }
    //brute force
    static int[] leader(int[] arr){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i+1; j < n; j++) {
                if (arr[i] < arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if (isLeader){
                list.add(arr[i]);
            }
        }
        int size = list.size();
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    // optimal solution
    static int[] leader2(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] >= max){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
