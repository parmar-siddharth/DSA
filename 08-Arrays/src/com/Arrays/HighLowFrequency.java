package com.Arrays;

import java.util.HashMap;
import java.util.Map;

public class HighLowFrequency {
    static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5,5,5,5};
        highLowFrequency2(arr);
    }
    static void highLowFrequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;
        int maxval = 0;
        int minval = 0;
        for(int i:map.keySet()){
            if(map.get(i)>highestFreq){
                highestFreq = map.get(i);
                maxval = i;
            }
            if(map.get(i)<lowestFreq){
                lowestFreq = map.get(i);
                minval = i;
            }
        }
        System.out.println("Highest frequency is "+maxval);
        System.out.println("Lowest frequency is "+minval);
    }

    static  void highLowFrequency2(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;
        int maxval = 0;
        int minval = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>highestFreq){
                highestFreq = entry.getValue();
                maxval = entry.getKey();
            }
            if(map.get(entry.getKey())<lowestFreq){
                lowestFreq = map.get(entry.getKey());
                minval = entry.getKey();
            }
        }
        System.out.println("Highest frequency is "+maxval);
        System.out.println("Lowest frequency is "+minval);
    }
}
