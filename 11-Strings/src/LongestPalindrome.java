package com.string;

import java.util.HashMap;
import java.util.HashSet;

public class LongestPalindrome {
    static void main(String[] args) {
        //String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String s = "accc";
        System.out.println(longestPalindrome(s));
    }

//    static int longestPalindrome(String s) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(char c : s.toCharArray()){
//            map.put(c,map.getOrDefault(c,0) + 1);
//        }
//        int longest = 0;
//        for (int freq : map.values()){
//            if (freq % 2 == 0){
//                longest += freq;
//            } else if (freq % 2 != 0 && longest % 2 == 0) {
//                longest += freq-1;
//            }
//            else {
//                longest = Math.max(longest,freq);
//            }
//        }
//        return longest;
//    }

    static int longestPalindrome(String s) {

        HashSet<Character> charSet = new HashSet<>();

        int length = 0;


        for (char c : s.toCharArray()) {

            if (charSet.contains(c)) {
                charSet.remove(c);
                length += 2;
            }
            else {
                charSet.add(c);
            }
        }


        if (!charSet.isEmpty()) {
            length += 1;
        }

        return length;
    }
}
