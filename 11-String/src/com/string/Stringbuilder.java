package com.string;

import java.util.Arrays;
import java.util.HashMap;

public class Stringbuilder {
    static void main(String[] args) {
        String ans = "";
        char[] arr = {'h','e','l','l','o'};
        for(char ch : arr) {
            ans = ans + ch;
        }
        System.out.println(ans); //hello

        // you're repeatedly creating new String objects

        // Instead we will use Stringbuilder

        StringBuilder sb = new StringBuilder();
        for (char ch : arr){
            sb.append(ch);
        }
        System.out.println(sb.toString()); // hello

        /*
                Imp StringBuilder Methods:
                =========================
                append()
                insert()
                delete()
                deleteCharAt()
                reverse()
                setCharAt()
                charAt()
                length()
                toString()
         */

        System.out.println(sb.reverse()); //olleh


        /// StringBuilder vs String
        /*
            String :  Immutable.
            StringBuilder: Mutable and generally preferred for DSA.
            StringBuffer: Mutable + synchronized/thread-safe, but usually unnecessary for normal DSA.
            So: String manipulation in DSA → StringBuilder
         */

        String s = "helloaaaasid";
        String[] arr1 = s.split("a*");
        System.out.println(Arrays.toString(arr1));

        /*
            Abhi bas ye 5 yaad rakho:
            Regex	Meaning	Example
            +	1 or more	a+ → a, aa, aaa
            *	0 or more	a* → "", a, aa
            ?	0 or 1	a? → "", a
            .	any single character	a.c → abc, axc
            \\d	digit	0-9
         */


        /// Frequency Array
        int[] freq = new int[26];
        String str = "siddharth";
        for (char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        System.out.println(Arrays.toString(freq));
        // [1, 0, 0, 2, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0]

        /// With HashMap:
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);


        /// sorting a string:
        char[] arrrr  = str.toCharArray();
        Arrays.sort(arrrr);
        String sorted = new String(arrrr);
        System.out.println(sorted);
    }
}
