package com.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoArray {
    static void main(String[] args) {
        int[] arr1 = {1,2,9,2,4,8,3};
        int[] arr2 = {1,2,3,4,5,6};
        union(arr1,arr2);
    }
    static void union(int[] nums1, int [] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1) {
            set.add(i);
        }
        for(int i : nums2) {
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : set) {
            list.add(i);
        }
        System.out.println(list);
    }
}
