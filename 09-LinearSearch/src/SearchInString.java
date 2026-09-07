package com.LinearSearch;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "siddharth";
        char target = input.next().charAt(0);
        System.out.println(inString(name,target));
    }
    static boolean inString(String str,char target){
        if (str.isEmpty()){     //str.isEmpty ==> str.length()
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
