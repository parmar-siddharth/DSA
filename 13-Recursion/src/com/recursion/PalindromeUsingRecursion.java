package com.recursion;

public class PalindromeUsingRecursion {
    static void main(String[] args) {
        System.out.println(isPalindrome("sid",0,2));
    }
    static boolean isPalindrome(String str,int start,int end) {
        if(start >= end)
            return true;

        if(str.charAt(start)!=str.charAt(end))
            return false;

        return isPalindrome(str,start+1,end-1);
    }
}
