package com.string;

import java.util.HashMap;

public class ValidAnagram {
    static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
//    static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c1 = s.charAt(i);
//            int freq1 = map.getOrDefault(c1,0)+1;
//            map.put(c1,freq1);
//        }
//        for (int i = 0; i < t.length(); i++) {
//            char c2 = t.charAt(i);
//            int freq2 = map.getOrDefault(c2,0)-1;
//            map.put(c2,freq2);
//        }
//        for (int count : map.values()){
//            if (count != 0){
//                return false;
//            }
//        }
//        return true;
//    }

    static boolean isAnagram(String s,String t){
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            freq[c1 - 'a']++;
            freq[c2 - 'a']--;
        }
        for (int count : freq){
            if (count != 0) return false;
        }
        return true;
    }
}
