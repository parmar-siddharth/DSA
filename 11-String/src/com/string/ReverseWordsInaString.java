package com.string;

import java.util.Arrays;

public class ReverseWordsInaString {
    static void main() {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String[] temp = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = temp.length-1; i >= 0; i--){
            if(i > 0) ans.append(temp[i] + " ");
            else ans.append(temp[i]);
        }
        return ans.toString();
    }
}
