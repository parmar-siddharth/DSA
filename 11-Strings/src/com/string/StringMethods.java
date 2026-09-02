package com.string;

import java.util.Arrays;

public class StringMethods {
    static void main(String[] args) {

        /// length():

        String str = "Hello";
        int len = str.length();
        System.out.println(len);

        /// Last index :
        int lastIndex = str.length() - 1;
        System.out.println(lastIndex); //4

        /// charAt();
        char ch = str.charAt(4);
        System.out.println(ch); //o

        /// Traversing a String
        String str1 = "Welcome";
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }
        // W e l c o m e

        System.out.println();

        /// Reverse Traversal
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i) + " ");
        }
        // e m o c l e W

        System.out.println();

        /// subString()
        String str2 = "abcdefgh";
        String x = str2.substring(0, 4);
        System.out.println(x); // abcd

        // Start -> inclusive
        // end -> exclusive
        // 0 index will be included but 4 will not

        String z = str2.substring(3);
        System.out.println(z); // defgh


        /// comparing Strings:
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2)); // false

        // equalsIgnoreCase();
        System.out.println(s1.equalsIgnoreCase(s2)); // true


        /// compareTo():
        String s3 = "apple";
        String s4 = "banana";
        System.out.println(s3.compareTo(s4)); // -1
        System.out.println(s4.compareTo(s3)); // 1
        //  it checks first character lexicographically

        /*
            negative → first string comes before second
                0    → equal
            positive → first comes after second
         */

        /// character operations
        char chr = 'a';
        System.out.println(Character.isLetter(chr)); // true
        System.out.println(Character.isDigit(chr)); // false
        System.out.println(Character.isLetterOrDigit(chr)); // true //  bcz it is a letter
        System.out.println(Character.isAlphabetic(chr)); // true
        System.out.println(Character.isUpperCase(chr)); // false
        System.out.println(Character.isLowerCase(chr)); // true
        System.out.println(Character.toUpperCase(chr)); // A

        /// Character <---> Number
        char ch1 = 'd';
        int index = ch1 - 'a';
        System.out.println(index); //3
         // a → 0  b → 1  c → 2 ... z → 25


        /// ASCII CONCEPT
        /*
            'A' → 65
            'Z' → 90

            'a' → 97
            'z' → 122

            '0' → 48
            '9' → 57
         */


        /// toCharArray():

        String s = "hello";
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr)); // hello

        // String -> char[ ] -> String
        arr[0] = 'H';
        s = new String(arr);
        System.out.println(s); // Hello
    }
}
