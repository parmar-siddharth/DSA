package com.string;

public class ReverseWordtringIII {
    static void main(String[] args) {
        String s = "Mr Ding";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {

        String[] str = s.split(" ");


        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < str.length; i++){
            char[] c = str[i].toCharArray();

            for (int j = c.length - 1; j >= 0; j--) {
                ans.append(c[j]);
            }

            if (i < str.length - 1) ans.append(" ");
        }

        return ans.toString();
    }
}
