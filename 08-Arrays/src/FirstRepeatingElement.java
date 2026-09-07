package com.Arrays;

import java.util.HashMap;

public class FirstRepeatingElement {
    static void main(String[] args) {
        int[] arr = {92,1,8,2,4,92,1,66,8,12,5,4,5,8,5,9,3,4,7,2,69,4};
        System.out.println(firstRepeatingElement2(arr));
    }

    static int firstRepeatingElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        return -1;
    }

    static int firstRepeatingElement2(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
//        for(int i = 0; i < n; i++){
//            if(map.get(arr[i]) > 1){
//                return i;
//            }
//        }

        for(int i : arr){
            if(map.get(i) > 1){
                return i;
            }
        }
        return -1;
    }
}
