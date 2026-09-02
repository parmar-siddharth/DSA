package com.string;

public class StringBasics {
    static void main(String[] args) {

        /// Immutablitiy:

        String str = "Hello";
        System.out.println(str);
        // Strings are immutable
        str = str + " World";
        System.out.println(str);
        // This does not modify "hello".

        /// creating strings:

        String str1 = "Siddharth";
        String str2 = new String("Sid");

        /// String pool:

        String a = "hii";
        String b = "hii";
        // java can store the same literal in the string pool
        System.out.println(a == b); // true;
        System.out.println(a.equals(b)); // true

        /*
            ==  -> Checks whether references point to the same object.
            .equals() ->  Checks whether contents are equal.
         */

        String c = new String("wow");
        String d = new String("wow");
        System.out.println(c == d); // false // both are pointing to diff objects
        System.out.println(c.equals(d)); // true // because literal is same

    }
}
