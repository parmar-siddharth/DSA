package com.string;

import java.util.Arrays;

public class ValidPalindrome {
    static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(Character.isLetterOrDigit(ch)){
//                sb.append(Character.toLowerCase(ch));
//            }

    }
    // 
    static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while (i < str.length() && j >= 0){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
