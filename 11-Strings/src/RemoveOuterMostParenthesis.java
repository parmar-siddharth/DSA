package com.string;

public class RemoveOuterMostParenthesis {
    static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
//    static String removeOuterParentheses(String s) {
//        int count = 0;
//        StringBuilder ans = new StringBuilder();
//        for(int i = 0; i < s.length(); i++){
//            char ch = s.charAt(i);
//            if (ch == '(' && count++ > 0){
//                ans.append(ch);
//            }
//            else if (ch == ')' && count-- > 1) {
//                ans.append(ch);
//            }
//        }
//        return ans.toString();
//    }

    /// with lesser code;
    static String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' && count++ > 0) ans.append(ch);
            if (ch == ')' && count-- > 1) ans.append(ch);
        }
        return ans.toString();
    }
}
