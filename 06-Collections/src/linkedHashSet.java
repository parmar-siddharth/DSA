package com.collection;

import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(89);
        linkedHashSet.add(42);
        linkedHashSet.add(63);
        linkedHashSet.add(52);
        linkedHashSet.add(12);
        linkedHashSet.add(78);
        System.out.println(linkedHashSet);
        //[89, 42, 63, 52, 12, 78]
        /*
            LinkedHashSet:
            Uses hash table + linked list
            Maintains insertion order
            Slightly slower (because of extra linked list)
         */
    }
}
