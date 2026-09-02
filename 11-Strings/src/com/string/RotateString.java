package com.string;

public class RotateString {
    static void main(String[] args) {
       String s = "abcde";
       String goal = "cdeab";
        System.out.println(rotateString(s,goal));
        System.out.println(s.contains(goal));
    }
    static boolean rotateString(String s, String goal) {

        StringBuilder str = new StringBuilder(s);
        StringBuilder g = new StringBuilder(goal);

        int i = 0;

        while (i < s.length()) {

            if (str.toString().equals(g.toString())) {
                return true;
            }

            rotate(str);
            i++;
        }

        return false;
    }
    static void rotate(StringBuilder str){
        int n = str.length();
        char temp = str.charAt(0);

        for (int i = 1; i < n; i++) {
            str.setCharAt(i-1, str.charAt(i));
        }

        str.setCharAt(n - 1,temp);
    }

    /// optmized code
//        static boolean rotateString(String s, String goal) {
//            if(s.length() != goal.length()) return false;
//            String str = s + s;
//            return str.contains(goal);
//        }

}
