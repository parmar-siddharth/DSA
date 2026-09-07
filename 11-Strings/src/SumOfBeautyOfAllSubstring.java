package com.string;

import java.util.ArrayList;
import java.util.HashMap;

public class SumOfBeautyOfAllSubstring {
    static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beautySum(s));
    }

    ///brute
//    public static int beautySum(String s) {
//        int sum = 0;
//        int last = s.length();
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                String str = s.substring(i,j+1);
//                if (str.length() >= 3){
//                    sum += beauty(str);
//                }
//            }
//        }
//        return sum;
//    }
//    private static int beauty(String s) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(char c : s.toCharArray()){
//            map.put(c,map.getOrDefault(c,0) + 1);
//        }
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int freq : map.values()){
//            max = Math.max(freq,max);
//            min = Math.min(freq,min);
//        }
//        return max - min;
//    }

    static int beautySum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {

                freq[s.charAt(j) - 'a']++;

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < freq.length; k++) {

                    if (freq[k] > 0){
                        max = Math.max(max,freq[k]);
                        min = Math.min(min,freq[k]);
                    }

                }

                sum += max - min;
            }
        }
        return sum;
    }
}
