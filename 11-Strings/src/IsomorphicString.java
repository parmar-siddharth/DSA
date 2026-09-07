package com.string;

import java.util.HashMap;

public class IsomorphicString {
    static void main(String[] args) {
        String s = "f11";
        String t = "b23";
        System.out.println(isIsomorphic(s,t));
    }

    /// using two HashMaps:
//    static boolean isIsomorphic(String s, String t) {
//        HashMap<Character,Character> map1 = new HashMap<>();
//        HashMap<Character,Character> map2 = new HashMap<>();
//        for (int i = 0; i < s.length(); i++){
//            char c1 = s.charAt(i);
//            char c2 = t.charAt(i);
//            if (map1.containsKey(c1)){
//                if (map1.get(c1) != c2){
//                    return false;
//                }
//            }
//            if (map2.containsKey(c2)){
//                if (map2.get(c2) != c1){
//                    return false;
//                }
//            }
//           map1.put(c1,c2);
//           map2.put(c2,c1);
//        }
//        return true;
//    }


    /// using two arrays:
    static boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[128];
        int[] map2 = new int[128];
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map1[c1] != map2[c2]) return false;

            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }
        return true;
    }
}
