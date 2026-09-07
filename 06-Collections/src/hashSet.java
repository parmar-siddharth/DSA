package com.collection;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(58);
        hashSet.add(45);
        //hashSet.add(45); //Duplicates not allowed
        hashSet.add(71);
        hashSet.add(94);
        hashSet.add(null); // null allowed
        System.out.println(hashSet);
        //[null, 71, 58, 45, 94]
        /*
            HashSet:
            Uses hash table
            No order guaranteed
            Elements stored based on hashing (random-like order)
            Faster than LinkedHashSet (slightly)
         */
    }
}
