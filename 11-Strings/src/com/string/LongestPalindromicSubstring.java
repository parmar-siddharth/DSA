package com.string;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalindromicSubstring {
    static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s) {
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {

            int start = i;
            int last = s.length()-1;
            while (start <= last){
                if (s.charAt(start) == s.charAt(last)){
                    if (isPalindromicSubstring(s,start,last)){
                        ans.add(s.substring(start,last+1));
                        break;
                    }
                    else last--;
                }
                else {
                    last--;
                }
            }
        }
        int maxLength = 0;
        int index = -1;

        for (int i = 0; i < ans.size(); i++) {
            int length = ans.get(i).length();

            if (length > maxLength) {
                maxLength = length;
                index = i;
            }
        }

        if (ans.isEmpty()) {
            return s.substring(0, 1);
        }

        return ans.get(index);
    }
    static boolean isPalindromicSubstring(String s,int start,int last){
        while (start <= last){
            char c1 = s.charAt(start);
            char c2 = s.charAt(last);
            if (c1 == c2){
                start++;
                last--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
