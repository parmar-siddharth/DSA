package com.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    static void main(String[] args) {
        String[] strs = {"siddharth","sia","ribn"};
        System.out.println(longestCommonPrefix(strs));
    }
    /// In O(n x m) time complexity
//    static String longestCommonPrefix(String[] strs) {
//        String first = strs[0];
//        StringBuilder ans = new StringBuilder();
//
//        for (int i = 0; i < first.length(); i++) {
//            for (int j = 1; j < strs.length; j++) {
//                if (i >= strs[j].length() || first.charAt(i) != strs[j].charAt(i)){
//                    return ans.toString();
//                }
//            }
//            ans.append(first.charAt(i));
//        }
//        return ans.toString();
//    }

    /// In O(n log n) time complexity using Arrays.sort();
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        int n = strs.length;
        String first = strs[0];
        String last = strs[n - 1];
        int len = Math.min(first.length(),last.length());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            else{
                ans.append(first.charAt(i));
            }
        }
        return ans.toString();
    }
}
