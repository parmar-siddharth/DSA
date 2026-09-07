package com.string;

public class MaximumNestingDepth {
    static void main(String[] args) {
        String s = "()(())((()()))";
        System.out.println(maxDepth(s));
    }
    static int maxDepth(String s) {
        int max = 0;
        int count = 0;
        for(char c : s.toCharArray()){
            if (c == '(') {
                count++;
            }
            else if (c == ')') {
                count--;
            }

            max = Math.max(max,count);
        }
        return max;
    }
}
