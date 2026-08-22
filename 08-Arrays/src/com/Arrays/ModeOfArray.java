package com.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ModeOfArray {
    static void main(String[] args) {
        int[] arr = {1,2,2,4,5,2,7,5,7,2,3,7,5,1,9,2};
        mode(arr);
    }
    static void mode(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int mode = 0;
        int max = Integer.MIN_VALUE;
        for(int i : map.keySet()){
            if(max < map.get(i)){
                max = map.get(i);
                mode = i;
            }
        }
        System.out.println("Mode of the array is " + mode);
    }

    static void mode2(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int mode = 0;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(entry.getValue() > max){
                max = entry.getValue();
                mode = entry.getKey();
            }
        }
        System.out.println("Mode of the array is " + mode);
    }
}
